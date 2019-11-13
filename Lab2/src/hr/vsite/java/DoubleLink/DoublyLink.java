package hr.vsite.java.DoubleLink;

/**
 * <h1>Implementacija Doubly Linked List </h1>
 * <p>U ovoj klasi primjenjujem  metode koje omogucuju rad nad strukturom kao da radim  
 *operacije nad stogom(stack) ili redom(queue) </p>
 
 * @author Korisnik (Krunoslav)
 * @version 1.0
 */
public class DoublyLink {

	     
	    //Reprezentacija head and tail od doubly linked list  
	    Node head, tail = null;  
	   
	    /**
	     * <p>Public size za određivanje velicine Liste</p>
	     */
	      public int size=0;
	      
	    //addAtEnd() will add a node to the end of the list  
	    
	    /**
	     * <h2>Metoda kojom dodajem cvor na kraju liste </h2>
	     * <p>1. U metodi se kreira novi cvor.
	     * 2.Provjera da li je lista prazna.3. Ako nije newNode prazan,
	     * newNode ce biti dodan nakon tail...koji ce pokazivati na novi newNode <p>
	     * 
	     * 
	     * @param data parametar, broj koji se dodaje na kraju liste
	     */
	    public void offer(int data) {  
	        //Kreiranje novog cvora
	        Node newNode = new Node(data);  
	        //Lista prazna?  
	        if(isEmpty()) {  
	            //Head i tail pokazuju na newNode  
	            head = tail = newNode;  
	            //head-prethodni:pokazuje na null  
	            head.previous = null;  
	            //tail-next pokazuje na nullkao da je zadnji cvor liste  
	            tail.next = null;  
	        }  
	        //Inace...dodaje newNode kao novi tail Liste
	        
	        else {  
	            //newNode  ce biti dodan nakon tail...koji ce pokazivati na novi newNode  
	            tail.next = newNode;  
	            //newNode previous ce pokazivati na tail  
	            newNode.previous = tail;  
	            //newNode postaje novi tail  
	            tail = newNode;  
	            //tail next pokazuje na null  
	            tail.next = null;  
	        } 
	        System.out.println(("offer("+data+")"));
	        size++;
	    } 
	    //
	    /**
	     * <h2>*Primjena stack push-metode</h2>
	     * <p>Stavljanje elemenata na vrh drugoga</p>
	     * 
	     * @param data element koji stavljamo na vrh 
	     */
	    public void push(int data) {
			Node node = new Node(data);
			node.next = head;
			//Lista prazna?  
			if (!(isEmpty())) {	//head != null
				head.previous = node;
			}

			head = node;
			System.out.println(("push("+data+")"));
			size++;

			if (head.next == null) {
				tail = head;
				
			}
		}
	    
	   
	    /**
	     * <h2>Primjena queue poll-metode()</h2>
	     * 
	     * <p>Implementacija kojom brišemo element sa pocetka</p>
	     * 
	     */
	    public void poll() {  
	        //Lista prazna?   
	    	if(isEmpty()) { 
	        	System.out.println("poll()---ALI prazna lista");//head == null
	            return;  
	        }  
	        else {  
	            //Provjera da li lista sadrzi barem jedan element  
	            if(head != tail) {  
	                //head pokazuje na sljedeci cvor u listi  
	                head = head.next;  
	                //Prethodni cvor null  
	                head.previous = null;  
	                System.out.println("poll()");
	            }  
	            //Ako lista sadrzi makar jedan element onda obriši cvor
	            //sada head i tail pokazuju na null  
	            //
	            else {  
	                head = tail = null; 
	                System.out.println("poll()---ALI prazna lista(NULL)");
	            } 
	            size--;
	        }
	    }
	   
	    /**
	     * <h2>Metoda kojom prikazujem sadrzaj primjenjenih metoda</h2>
	     * 
	     * <p>Ispis svakog cvora sa uvecavanjem pokazivaca</p>
	     */
	    public void display() {  
	        //Trenutni Node pokazuje na head 
	        Node current = head; 
	        //prazan?
	        if(isEmpty()) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        
	        while(current != null) {  
	            
	        	//Ispis svakog cvora sa uvecavanjem pokazivaca
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }  
	    //stack: briše 
	   
	    /**
	     * <h2>Primjena stack POP-metode</h2>
	     * <p>Metoda kojom dohvacamo element sa stoga (ujedno ga brišemo). LIFO metoda</p>
	     */
	    public void pop() {  
	        //Lista prazna? 
	        if(isEmpty()) { 
	        	System.out.println("pop()---ALI prazna lista");//head == null
	            return;  
	        }  
	        else {  
	            //Lista sadrzi barem jedan cvor?  
	            if(head != tail) {  
	                //Prethodni cvor se pridodaje tail (to je novi cvor)  
	                tail = tail.previous;  
	                //Trenutni tail postaje null (Node next to current tail)  
	                tail.next = null;  
	                System.out.println("pop()");
	            }  
	            //Ako lista sadrzi barem jedan cvor 
	            //Onda ce se obrisati cvor pa ce head i tail pokazivati na null  
	            else {  
	                head = tail = null;  
	               
	            } 
	            size--;
	        } 
	        
		    }
	    //pogledaj u stack
	    /**
	     * <h2>Implementacija STACK peek()-metode</h2>
	     * <p>Pregled zadnjeg element u stack-u ali ne i njegovo brisanje</p>
	     * 
	     * @return tail.data vraca u main() zadnji element na stogu
	     */
	    /**
	     * 
	     * @return -1   ako je stog prazan
	     */
	    public int peek()
		{
			// stog prazan?
			if (head == null) {	//isEmpty()
				System.out.println("Stack je prazan!");
				return -1;
			}
			else {
				return tail.data;
			}
		}

	  
	   
	    /**
	     * <h2> Implementacija QUEUE element()-metode</h2>
	     * <p>Pregled prvog elementa u redu ali ne i njegovo brisanje
	     * 
	     * @return head.data  
	     *  
	     */
	    /**
	     * @return -1 ako je stog prazan
	     */
	    public int element()
		{
			// stack prazan?
			if (!(isEmpty())) {	//!head == null
				return head.data;
			}
			else {
				System.out.println("Stog je prazan");
				return -1;
			}
		}
	    
	    /**
	     * <h2>Metoda kojom provjeravam da li je Linked lista prazna</h2>
	     * @return true vraca true ako je lista prazna
	     *  
	     */
	    /**
	     * @return false Ako je lista nijeprazan
	     */
	    public boolean isEmpty() 
	    { 
	        if (head == null) { 
	            return true; 
	        } 
	        else
	            return false; 
	    } 
	    
	    /**
	     * <h2>Velicina</h2>
	     * @return size vraca velicinu kao zbroj svih dodanih elemenata
	     */
	    public int size(){
			return size;
		}
	    
	    //Checks whether the value x is present in linked list 
	    
	    
	    /**
	     * <h2>Metoda provjere sadrzaja liste</h2>
	     * <p>Provjera da li element postoji u Listi</p>
	     * 
	     * @param x parametar koji prima i koji pretrazuje
	     * @return  vraca true ili false 
	     */
	    public boolean contains(int x) 
	    { 
	        Node current = head;    //Initialize current 
	        while (current != null) 
	        { 
	            if (current.data == x) 
	            {
	            	System.out.print(("ELEMENT: "+x+" POSTOJI " ));
	            	  return true;    //data found 
	            }
	              
	            current = current.next; 
	        } 
	        System.out.print(("ELEMENT: "+x +" NE POSTOJI " ));
	        return false;    //data not found 
	    } 
	    
	      
	}

