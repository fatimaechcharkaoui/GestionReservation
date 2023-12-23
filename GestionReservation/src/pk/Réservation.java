package pk;

public class Réservation implements Comparable<Réservation> {
	
	protected int numéroRéservation;
	protected String clientName;
    protected String reservationDate;
    protected int numberOfPeople;
    protected double montant;
    
   
	public Réservation(int numéroRéservation, String clientName, String reservationDate, int numberOfPeople,
			double montant) {
		super();
		this.numéroRéservation = numéroRéservation;
		this.clientName = clientName;
		this.reservationDate = reservationDate;
		this.numberOfPeople = numberOfPeople;
		this.montant = montant;
	}

	// getters and setters
	public int getNuméroRéservation() {
		return numéroRéservation;
	}

	public void setNuméroRéservation(int numéroRéservation) {
		this.numéroRéservation = numéroRéservation;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	// Redefinition method toString()
	@Override
	public String toString() {
		return "Réservation [numéroRéservation=" + numéroRéservation + ", clientName=" + clientName
				+ ", reservationDate=" + reservationDate + ", numberOfPeople=" + numberOfPeople + ", montant=" + montant
				+ "]";
	}

	// Method equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Réservation that = (Réservation) obj;
        return numéroRéservation == that.numéroRéservation &&
               Double.compare(that.montant, montant) == 0 &&
               numberOfPeople == that.numberOfPeople &&
               clientName.equals(that.clientName) &&
               reservationDate.equals(that.reservationDate);
    }
    
    // method clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Réservation clone = (Réservation) super.clone();
        clone.clientName = this.clientName;
        clone.numberOfPeople = this.numberOfPeople;
        return clone;
    }

    //Implementation de l'interface Comparable
	@Override
	public int compareTo(Réservation o) {
		return Integer.compare(this.numéroRéservation,o.numéroRéservation);
	}
	 
}
