import java.util.LinkedList;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> name = new LinkedList<String>();
        name.add("lili");
        name.add("pat");
        name.add("mark");
        System.out.println(name);
        name.addFirst("luke");
        name.addLast("harry");
       System.out.println(name);
        name.addAll(name);
        name.removeFirst();
        name.removeLast();
        System.out.println(name);
        name.get(2);
        System.out.println(name);
        name.getFirst();
        name.getLast();
        System.out.println(name);
        name.clear();
        System.out.println(name);
        name.indexOf( 2);
        System.out.println(name);
        
        
        
    }
    
}
