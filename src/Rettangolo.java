
public class Rettangolo {
	 private double larghezza;
	    private double altezza;

	    public Rettangolo(double larghezza, double altezza) {
	        this.larghezza = larghezza;
	        this.altezza = altezza;
	    }

	    public double getLarghezza() {
	        return larghezza;
	    }

	    public double getAltezza() {
	        return altezza;
	    }

	    public double getPerimetro() {
	        return 2 * (larghezza + altezza);
	    }

	    public double getArea() {
	        return larghezza * altezza;
	    }

	    public void stampaRettangolo() {
	        System.out.println("Area: " + getArea());
	        System.out.println("Perimetro: " + getPerimetro());
	    }

	    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
	        System.out.println("Rettangolo 1:");
	        r1.stampaRettangolo();
	        System.out.println("Rettangolo 2:");
	        r2.stampaRettangolo();
	    }

	    public static void main(String[] args) {
	        Rettangolo r1 = new Rettangolo(5, 10);
	        Rettangolo r2 = new Rettangolo(7, 3);

	        stampaDueRettangoli(r1, r2);
	    }

}
