public class Fruit {
    public static void main(String[] args) {
        SLL t = new SLL();
        
        t.addFirst("Pear");
        t.addFirst("Banana");
        t.addFirst("Apple");

        System.out.println("The list in alphabetical order without 'Cranberry':");
        t.printAll();  
        t.addAlphabetical("Cranberry");

        System.out.println("List with 'Cranberry':");
        t.printAll();  
    }
}