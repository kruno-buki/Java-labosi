package hr.vsite.java.DoubleLink;

/**
 * <h1> TestDoublyLinked klasa</h1>
 *  <p> Unos raznih zahtjeva i pozivanje metodi</p>
 *  
 * @author Korisnik (Krunoslav)
 * @version 1.0
 */
public class TestDoublyLinked {

    /**
     * <h2> main()</h2>
     * <p> Pocetak programa</p>
     *@param args pohranjuje argumente naredbenog retka (command line)  
     *
     */
    
    public static void main(String[] args) {  
    	DoublyLink dList = new DoublyLink();  
        //Dodaj 1 
        dList.offer(1); 
        System.out.println("Prikaz svih elemenata: ");
        dList.display();  
        //Dodaj 2  
        dList.push(2);  
        //Dodaj 3  
        dList.offer(3);  
         //Dodaj 5 i 4 
        dList.offer(5); 
        dList.offer(4);  
        System.out.println("Prikaz svih elemenata: ");
         dList.display();
         System.out.println("----------------------");
        System.out.println("Metodat PROVJERE (contains):");
                
        System.out.println("("+dList.contains(1)+")");
        System.out.println("("+dList.contains(11)+")");
        System.out.println("Prikaz svih elemenata: ");
        dList.display();
        System.out.println("----------------------");
        
        
        System.out.println("WELICINA: "+dList.size());
        dList.poll();
        dList.poll();
        System.out.println("WELICINA: "+dList.size());
        System.out.println("Prikaz svih elemenata: ");
        dList.display();
        System.out.println("----------------------");
        dList.pop();
        System.out.println("WELICINA: "+dList.size());
        System.out.println("Prikaz svih elemenata: ");
        dList.display();
        dList.push(345);
        dList.poll();
        System.out.println("Prikaz svih elemenata: ");
        dList.display();
        System.out.println("WELICINA: "+dList.size());
        System.out.println("----------------------");
        System.out.println("Proviri u queue (ali ne poll): "+dList.element());
        System.out.println("WELICINA: "+dList.size());
        System.out.println("Proviri u stack (ali ne pop): "+dList.peek());
        System.out.println("Prikaz svih elemenata: ");
        dList.display();
        System.out.println("WELICINA: "+dList.size());
        System.out.println("----------------------");
        
        dList.pop();
        System.out.println("Prikaz svih elemenata: ");
        dList.display();
        dList.poll();//deleteFromStart
        
         dList.pop();
         dList.display();
       
    }
}
