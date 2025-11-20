
public class ArrayList {
    private int[] lista;
    private int capacidade = 20;
    private int tail;

    public ArrayList() {
        this.lista = new int[capacidade];
        this.tail = -1;
    }

    private boolean isValidIndex(int idx) {
        return idx >= 0 && idx <= this.tail;
    }

    private void shiftRight(int idx) {
        for (int i = this.tail + 1; i > idx; i--) {
            this.lista[i] = this.lista[i - 1];
        }
        this.tail++;
    }

    private void shiftLeft(int idx) {
        for (int i = idx; i < this.tail; i++) {
            this.lista[i] = this.lista[i + 1];
        }
        this.tail--;
    }

    public void remove(int idx) {
        if (!isValidIndex(idx))
            throw new IndexOutOfBoundsException();
        shiftLeft(idx);
    }

    public void remove(Integer ele) {
        for (int i = 0; i <= this.tail; i++) {
            if (this.lista[i] == ele) {
                shiftLeft(i);
                break;
            }
        }
    }

    public void removeLast(Integer ele) {
        for (int i = this.tail; i >= 0; i--) {
            if (this.lista[i] == ele) {
                shiftLeft(i);
                break;
            }
        }
    }

    public boolean insert(int idx, int ele) {
        if (!isValidIndex(idx))
            throw new IndexOutOfBoundsException();
        if (isFull())
            resize();

        shiftRight(idx);
        this.lista[idx] = ele;
        return true;
    }

    public boolean add(int ele) {
        if (isFull())
            resize();
        this.tail++;
        this.lista[this.tail] = ele;
        return true;
    }

    public boolean addFirst(int ele) {
        if (isFull())
            resize();
        shiftRight(0);
        this.lista[0] = ele;
        return true;
    }

    public int length() {
        return this.tail + 1;
    }

    public int getElement(int idx) {
        if (!isValidIndex(idx))
            throw new IndexOutOfBoundsException();
        return this.lista[idx];
    }

    public boolean setElement(int idx, Integer element) {
        if (!isValidIndex(idx))
            throw new IndexOutOfBoundsException();
        this.lista[idx] = element;
        return true;
    }

    private boolean isFull() {
        return this.tail == capacidade - 1;
    }

    public int indexOf(Integer ele) {
        for (int i = 0; i <= this.tail; i++) {
            if (this.lista[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfLast(Integer ele) {
        for (int i = this.tail; i >= 0; i--) {
            if (this.lista[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    private void resize() {
        this.capacidade *= 2;
        int[] arr = new int[this.capacidade];

        for (int i = 0; i <= this.tail; i++) {
            arr[i] = this.lista[i];
        }
        this.lista = arr;
    }

    public String toString() {
        String out = "[";
        for (int i = 0; i <= this.tail; i++) {
            if (i == this.tail) {
                out += "" + this.lista[i] + "]";
                continue;
            }
            out += "" + this.lista[i] + ",";
        }
        return out;
    }
}
