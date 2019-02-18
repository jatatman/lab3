/*
 * 
 * IntNode allows us to create a linked list using the IntNode class
 * instance variable data houses the data element while link provides
 * a link to the next element in the linked list
 */


package lab3;

public class IntNode {
    
    private int data; 
    private IntNode link; 
    
    /*
     * constructor method that sets data to 0 and link to null
     */
    public IntNode() {
        
        data = 0; 
        link = null; 
        
    } // end IntNode
    
    /*
     * @params 
     * int _data; data value to be assigned to the node
     * IntNode _node; link to the next node
     */
    public IntNode(int _data, IntNode _node) { 
        data = _data;
        link = _node;
    } // end IntNode
    
    /*
     * returns value of the node
     */
    public int getData() {
        return data;
        
    } // end getData
    
    /*
     * returns link to the next node
     * value will be null if no other node present
     */
    public IntNode getLink() {
        return link; 
    } // end getNodeLink
    
    /*
     * @param
     * _data; sets the node value to _data
     */
    public void setNodeValue(int _data) {
        data = _data; 
    } // end setNodeValue
    
    /*
     * @ param
     * _link; sets the link value to _link
     */
    public void setNodeLink(IntNode _link) {
        link = _link; 
    } // end setNodeLink
    
    /*
     * @params
     * IntNode; linked list that you want the length of 
     * @returns
     * int; length of the linked list
     */
    public static int listLength(IntNode head) {
        
        int answer = 0; 
        for (IntNode cursor = head; cursor != null; cursor = cursor.link) {
            answer++;
        } // end for 
        return answer;
    } // end listLength
    
    /*
     * @ returns teh values of the likned list as String
     */
    
    public String toString() {
        
        String answer = "";
        IntNode next = link;
 
        while (next != null) {
           
            answer = answer + next.getData() + "->"; 
            next = next.link; 
        } // end while
        
        if (next == null) {
            answer = answer + data;
        } // end if 
    
        return answer; 
        
    } // end toString

    /*
     * adds value to the node after the node the method is called upon. 
     * @ param
     * int newdata; value to be added
     */
    public void addNodeAfterThis(int newdata) {
        
        link = new IntNode(newdata, link); 
        
    } // end addNodeafterThis
    
    /*
     * removes the value of the node after the node the method is called upon.
     */
    public void removeNodeAfterThis() {
        
        link = link.link; 
        
    } // end removeNodeAfterThis 
    
    /*
     * determines if the value is in the linked list
     * @param
     * IntNode head; linked list to be check for value
     * int data; value to be checked for 
     * @returns
     * boolean true if the value is in the linked list and false if it is not
     */
    public static boolean search(IntNode head, int data) {
        
        if (head == null) {
            throw new IllegalArgumentException("IntNode must not be null"); 
        } // end if 
        
        for (IntNode cursor = head; cursor != null; cursor = cursor.link) {
            
            if (cursor.getData() == data) {
                return true;
            } // end if 
        } // end for
        
        return false; 
    } // end search
   
        
    
} // end IntNode


