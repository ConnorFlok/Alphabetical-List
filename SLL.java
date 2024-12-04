public class SLL {
    private Node head;
    public SLL() {
        this.head = null;
    }
  
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }
   
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    
    private Node getPred(String target) {
        Node current = head;
        Node previous = null;
       
        while (current.getData().compareTo(target) < 0) {
            previous = current;
            current = current.getNext();
        }
        
        return previous;
    }
    public void addAlphabetical(String data) {
        Node newNode = new Node(data);
       
        if (head == null || head.getData().compareTo(data) > 0) {
            addFirst(data);
        } else {
            Node pred = getPred(data);
            newNode.setNext(pred.getNext());
            pred.setNext(newNode);}
        }
  
    public Node findLastNodeWithCranberry() {
        return getPred("Cranberry");
    }
}
    
