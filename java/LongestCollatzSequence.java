/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author User
 */
public class LongestCollatzSequence {

    /**
     * @param args the command line arguments
     */
    public class Node{
        long value;
        Node next;
        public Node(long value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    
    public class LinkedList{
        Node head = null;
        int length = 0;
        public void addToEnd(long value){
            if(head == null){
                head = new Node(value, null);
                
            }
            else{
                Node ptr = head;
                while(ptr.next != null){
                    ptr = ptr.next;
                }
                ptr.next = new Node(value, null);
            }
            length++;
        }
    }
    
    public static LinkedList generateCollatzSeq(long num){
        LongestCollatzSequence a = new LongestCollatzSequence();
        LinkedList list = a.new LinkedList();
        list.addToEnd(num);
        while(num != 1){
            if(isEven(num)){
                num = num / 2;
                list.addToEnd(num);
            }
            else{
                num = (3 * num) + 1;
                list.addToEnd(num);
            }
        }
        return list;
    }
    
    public static boolean isEven(long num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int longestLength = 0;
        int numThatMakesLongestSeq = 0;
        //replace int with long and make an array of linked lists
        for(int i = 1; i < 1000000; i++){
            LinkedList list = generateCollatzSeq(i);
            if(list.length > longestLength){
                longestLength = list.length;
                numThatMakesLongestSeq = i;
            }
            System.out.println("Sequence: " + i + " done");
        }
        System.out.println(numThatMakesLongestSeq);
        //LinkedList l = generateCollatzSeq(920300);
        //System.out.println(l.length);
    }
    
}
