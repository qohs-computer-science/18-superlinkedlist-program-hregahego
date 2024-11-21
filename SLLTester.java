//Steven Wang, Pd. 3


import java.util.LinkedList;
import java.util.ListIterator;

class SLLTester {
    public static void main(String[] args) {
        SuperLinkedList list1 = new SuperLinkedList();
        SuperLinkedList list2 = new SuperLinkedList();
        SuperLinkedList list3 = new SuperLinkedList();
 
 
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
 
 
        list2.add("F");
        list2.add("G");
        list2.add("H");
        list2.add("I");
        list2.add("J");
 
 
        list3.add("K");
        list3.add("L");
        list3.add("M");
        list3.add("N");
        list3.add("O");
        list3.add("K");
        list3.add("K");
        list3.add("N");
 
        
        System.out.println("This is list 1: \n" + list1.toString());
        System.out.println("This is list 2: \n" + list2.toString());
        System.out.println("This is list 3: \n" + list3.toString());
 
 
        boolean removed = list1.removeVowels();
        System.out.println("\n\nlist1 removed vowels? " + removed);
        System.out.println(list1.toString());
 
 
 
 
        removed = list2.removeConsonants();
        System.out.println("\n\nlist2 removed consonants? " + removed);
        System.out.println(list2.toString());
 
 
 
 
        System.out.println("\n\nlist3 remove duplicates");
        LinkedList<String> noDuplicates = list3.removeDuplicates();
        list3 = new SuperLinkedList(noDuplicates);
        ListIterator<String> it = noDuplicates.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        } //loop through list
 
 
        System.out.println("\n\nlist3 concatenations");
        System.out.println(list3.concatenateStrings());
       
        System.out.println("\n\nlist 3 mixed with list1");
        LinkedList<String> mixed = new LinkedList<String>();
        LinkedList<String> linked1 = list1;
        mixed = list3.mix(linked1);
        it = mixed.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        } //loop through list
 
 
        System.out.println("\n\nFinal lists: ");
        System.out.println("List 1: " + list1.toString());
        System.out.println("List 2: " + list2.toString());
        System.out.println("List 3: " + list3.toString());
 
 
 
 
 
    } // end main
} // end class