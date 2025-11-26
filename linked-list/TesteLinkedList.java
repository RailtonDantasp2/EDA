public class TesteLinkedList {
    public static void main(String[] args) {
        testLinkedListWithoutPrev();
    }

    public static void testLinkedListWithoutPrev() {
        LinkedList lk = new LinkedList();
        System.out.println("\n\nTESTANDO ADDLAST\n\n");
        lk.addLast(4);
        System.out.println(lk.toString());
        lk.addLast(5);
        lk.addLast(4);
        System.out.println(lk.toString());
        lk.addLast(9999);
        System.out.println(lk.toString());

        System.out.println("\n\nTestando removeLast\n\n");
        lk = new LinkedList();
        lk.addLast(3);
        lk.addLast(6);
        lk.addLast(7);
        System.out.println(lk.toString());
        lk.removeLast();
        System.out.println(lk.toString());
        lk.removeLast();
        System.out.println(lk.toString());
        lk.removeLast();
        System.out.println(lk.toString());

        System.out.println("\n\nTestando remove first\n\n");
        lk = new LinkedList();
        lk.addLast(1);
        lk.addLast(2);
        lk.addLast(3);
        lk.addLast(4);
        System.out.println(lk.toString());
        lk.removeFirst();
        System.out.println(lk.toString());
        lk.removeFirst();
        lk.removeFirst();
        System.out.println(lk.toString());
        lk.removeFirst();
        System.out.println(lk.toString());
        System.out.println("\n\nTestando indexOf\n\n");

        lk = new LinkedList();
        lk.addLast(12);
        lk.addLast(7);
        lk.addLast(5);
        lk.addLast(0);
        lk.addLast(3);
        lk.addLast(12);
        lk.addLast(9);
        System.out.println(lk.toString());
        System.out.println(lk.indexOf(12));
        System.out.println(lk.indexOf(9));
        System.out.println(lk.indexOf(5));
        System.out.println(lk.indexOf(0));
        System.out.println(lk.indexOf(7));

        lk = new LinkedList();

        lk.addLast(90);
        System.out.println(lk.indexOf(90));
        System.out.println("\n\nTestando addFirst\n\n");
        lk = new LinkedList();
        lk.addLast(3);
        lk.addFirst(4);
        lk.addLast(5);
        lk.addFirst(6);
        lk.addFirst(9);
        lk.addFirst(8);
        lk.addFirst(7);
        System.out.println(lk.toString());

        System.out.println("\n\nTestando add\n\n");
        lk = new LinkedList();
        lk.addLast(1);
        lk.addLast(2);
        lk.addLast(3);
        lk.addLast(4);
        lk.addLast(5);
        lk.addLast(6);
        lk.add(3, 90);
        System.out.println(lk.toString());
        lk.add(5, 99);
        System.out.println(lk.toString());
        lk.add(0, 50);
        System.out.println(lk.toString());
        lk.add(2, 200);
        System.out.println(lk.toString());
    }
}
