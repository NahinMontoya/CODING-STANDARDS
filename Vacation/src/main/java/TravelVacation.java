
public class TravelVacation {

	
	    private int pasajeros;
	    private int dias;
	    
	    public TravelVacation() {
	    }

	    public TravelVacation(int pasajeros, int dias, String destino) {
	        this.pasajeros = pasajeros;
	        this.dias = dias;
	       
	    }

	    public int getPasajeros() {
	        return pasajeros;
	    }

	    public void setPasajeros(int pasajeros) {
	        this.pasajeros = pasajeros;
	    }

	    public int getDias() {
	        return dias;
	    }

	    public void setDias(int dias) {
	        this.dias = dias;
	    }


	    @Override
	    public String toString() {
	        return "TravelVacation{" +
	                "pasajeros=" + pasajeros +
	                ", dias=" + dias +
	                '\'' +
	                '}';
	    }
	}