package hr.vsite.java.DoubleLink;

	 
    /**
     * <h1>Predstavlja Node (cvor) Doubly Linked List</h1>
     * @author Korisnik (Krunoslav)
     *
     */
    class Node{  
        int data;  
        Node previous;  
        Node next;  
        /**
         * <h2>Konstruktor </h2>
         * 
         * @param data  konstrukcija i inicijalizacija clanova variajbli
         */
        public Node(int data) {  
            this.data = data;  
        }  
    } 

