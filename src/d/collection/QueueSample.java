package d.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList1();
    }
    public void checkLinkedList1() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.addFirst("B");
        System.out.println(link);
        link.offerFirst("C");
        System.out.println(link);
        printLinkedList(link);
    }
    public void printLinkedList(LinkedList<String> list) {
        ListIterator iterator = list.listIterator(0);
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(iterator.previous()+" ");
    }
}