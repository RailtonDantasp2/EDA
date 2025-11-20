
public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList arrl = new ArrayList();

        arrl.add(1);
        arrl.add(2);
        arrl.add(3);
        arrl.add(4);
        arrl.add(6);
        arrl.insert(3, 4);
        arrl.insert(3, 10);
        arrl.insert(3, 11);
        arrl.insert(3, 19);
        arrl.insert(3, 20);
        arrl.insert(3, 8);
        arrl.insert(3, 2);
        System.out.println(arrl.toString());
        arrl.remove(6);
        arrl.remove(3);
        arrl.remove(3);
        arrl.remove(3);
        arrl.remove(3);
        arrl.remove(3);
        System.out.println(arrl.toString());
        arrl.insert(3, 99);
        arrl.insert(3, 99);
        arrl.insert(3, 99);
        arrl.insert(3, 99);
        System.out.println(arrl.toString());
        arrl.removeLast(99);
        arrl.removeLast(99);
        arrl.removeLast(99);
        System.out.println(arrl.toString());
        arrl.remove(Integer.valueOf(3));
        System.out.println(arrl.toString());
    }
}
