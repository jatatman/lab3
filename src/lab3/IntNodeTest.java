package lab3;

public class IntNodeTest {
    
    public static void main(String[] args) {
        
        //creating new IntNode
        IntNode testNode = new IntNode(1, null); 
        
        System.out.println("Testing empty constructor:"); 
        System.out.println(testNode.getData());
        System.out.println(testNode.getLink()); 
        System.out.println(IntNode.listLength(testNode) + "\n");
      
        System.out.printf("testNode getdata: %d\n", testNode.getData());
        System.out.printf("testNode getLink: %d\n", testNode.getLink());
        System.out.println(" "); 
        
        System.out.println("using addNodeAfterThis to add more nodes\n");
        testNode.addNodeAfterThis(2);
        testNode.addNodeAfterThis(3);
        testNode.addNodeAfterThis(4);
        
        System.out.printf("List length: %d\n", IntNode.listLength(testNode)); 
        
        System.out.println("Checking to see if 4 has been added with search:");
        System.out.printf("%b 4 has been added\n", IntNode.search(testNode, 4)); 
        System.out.println("Check to make sure 5 has not been added:");
        System.out.printf("5 has been added = %b\n", IntNode.search(testNode, 5)); 
        System.out.println(" "); 
        
        
        System.out.println("removing node\n");
        
        testNode.removeNodeAfterThis();
        
        System.out.println("List length = 3 if remove was succesful"); 
        System.out.printf("ListLength: %d\n\n", IntNode.listLength(testNode));
        
        
        System.out.println("checking toString"); 
        
        System.out.println(testNode.toString());
       
        
    } // end main

}  // end IntNodeTest
