//Steven Wang, Pd. 3

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.HashSet;


class SuperLinkedList extends LinkedList<String> {

   public SuperLinkedList() {
       super();
   } //end default constructor


   public SuperLinkedList(LinkedList<String> init) {
       super();
       for (String i : init) {
           super.add(i);
       }
   } //end constructor that takes LinkedList as input
  
   public boolean removeVowels() {
       ListIterator<String> it = super.listIterator();
       boolean removed = false;
       String vowels = "aeiou";
       while(it.hasNext()) {
           String current = it.next();
           if (vowels.contains(current.toLowerCase())) {
               it.remove();
               removed = true;
           } //checks if current letter is a vowel - if so, removes
       } //loop through all the letters


       return removed;
   } //end removeVowels


   public boolean removeConsonants() {
       ListIterator<String> it = super.listIterator();
       boolean removed = false;
       String consonants = "bcdfghjklmnpqrstvwxyz";
       while(it.hasNext()) {
           String current = it.next();
           if (consonants.contains(current.toLowerCase())) {
               it.remove();
               removed = true;
           } //checks if current letter is a consonant - if so, removes
       } //loop through all the letters
      
       return removed;
   } //end removeConsonants


   public LinkedList<String> removeDuplicates() {
       HashSet<String> seen = new HashSet<String>();
       ListIterator<String> it = super.listIterator();
       LinkedList<String> unique = new LinkedList<String>();


       while(it.hasNext()) {
           String current = it.next();
           if (!seen.contains(current)) {
               unique.add(current);
           } //checks if current is in the set - if no, then add to unique list
           seen.add(current);
       } //loop through all letters


       return unique;
   } //end removeDuplicates


   public LinkedList<String> concatenateStrings() {
       LinkedList<String> result = new LinkedList<String>();
       for (int i = 0; i < super.size(); i++) {
           ListIterator<String> it = super.listIterator();
           String concat = "";
           for (int j = 0; j <= i; j++) {
               String current = it.next();
               concat += current;
           } //loop through beginning to current # of concatenation
           result.add(concat);
       } //loop through total # of concatenations
       return result;
   } //end concatenateStrings


   public LinkedList<String> mix(LinkedList<String> list2) {


       ListIterator<String> it1 = super.listIterator();
       ListIterator<String> it2 = list2.listIterator();
       LinkedList<String> result = new LinkedList<String>();


       while (it1.hasNext() || it2.hasNext()) {
           if (it1.hasNext()) {
               result.add(it1.next());
           } //if there are still items remaining in this list, add
           if (it2.hasNext()) {
               result.add(it2.next());
           } //if there are still items remaining in the input list, add
       } //loop while either this list or the input list have items left


       return result;


   } //end mix


   public String toString() {
       String result = "";
       ListIterator<String> it = super.listIterator();
       while (it.hasNext()) {
           result += it.next() + ", ";
       } //add current letter and comma to result


       return result;


   } //end toString


} //end class
