public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addLast(int v) {
        this.size++;
        Node newNode = new Node(v);

        if (isEmpty()) {
            this.head = newNode;
            return;
        }

        Node aux = this.head;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = newNode;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Head nulo");
        }
        this.size--;
        this.head = this.head.next;
    }

    public void addFirst(int ele) {
        Node aux = new Node(ele);
        aux.next = this.head;
        this.head = aux;
        this.size++;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Head nulo");
        }
        this.size--;
        Node aux = this.head;
        if (aux.next == null) {
            this.head = null;
            return;
        }

        while (aux.next.next != null) {
            aux = aux.next;
        }
        aux.next = null;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        String out = "[";
        Node aux = this.head;
        while (aux.next != null) {
            out += "" + aux.v + ",";
            aux = aux.next;
        }
        out += "" + aux.v + "]";
        return out;
    }

    public void add(int index, int element) {
        if (index == this.size - 1) {
            this.addLast(element);
            return;
        }
        if (index == 0) {
            this.addFirst(element);
            return;
        }
        Node aux = this.head;
        Node newNode = new Node(element);

        for (int i = 0; i < index - 1; i++) {
            aux = aux.next;
        }
        newNode.next = aux.next;
        aux.next = newNode;
        this.size++;
    }

    public int indexOf(int valor) {
        if (isEmpty()) {
            throw new RuntimeException("Head nulo");
        }
        int idx = -1;
        Node aux = this.head;
        while (aux != null) {
            idx++;
            if (aux.v == valor)
                return idx;
            aux = aux.next;
        }
        return -1;
    }
}

class Node {
    int v;
    Node next;

    public Node(int v) {
        this.v = v;
        this.next = null;
    }
}
