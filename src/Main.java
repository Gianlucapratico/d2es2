
public class Main {

	public static void main(String[] args) {
		 // Creazione dei due oggetti Rettangolo
	    Rettangolo r1 = new Rettangolo(5, 10);
	    Rettangolo r2 = new Rettangolo(7, 3);
	    
	    // Chiamata alla funzione stampaDueRettangoli per stampare a video l'area e il perimetro di entrambi i rettangoli
	    System.out.println("Dati del primo rettangolo:");
	    r1.stampaRettangolo();
	    System.out.println();
	    System.out.println("Dati del secondo rettangolo:");
	    r2.stampaRettangolo();
	    System.out.println();
	    System.out.println("Dati di entrambi i rettangoli:");
	    Rettangolo.stampaDueRettangoli(r1, r2);

	}

}
