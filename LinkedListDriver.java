public class LinkedListDriver
{
    public static void main(String[] args)
    {
        IntLinkedList list = new IntLinkedList();
        list.addNodeToStart(5);
        list.addToTail(10);
        list.addNodeToStart(15);

        list.showList();
        System.out.println();
        list.deleteNodeFromTail();
        list.showList();
    } // end main method
} // end driver class
