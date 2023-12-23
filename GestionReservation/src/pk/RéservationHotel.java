package pk;

public class RéservationHotel extends Réservation{
	
	private String nomHotel;
	private int numberOfNights;
	
	public RéservationHotel(int numéroRéservation, String clientName, String reservationDate, int numberOfPeople,
			double montant, String nomHotel, int numberOfNights) {
		super(numéroRéservation, clientName, reservationDate, numberOfPeople, montant);
		this.nomHotel = nomHotel;
		this.numberOfNights = numberOfNights;
	}
	public String getNomHotel() {
		return nomHotel;
	}
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	public int getNumberOfNights() {
		return numberOfNights;
	}
	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}
	
	@Override
	public String toString() {
		return "RéservationHotel " + super.toString()+" [nomHotel=" + nomHotel + ", numberOfNights=" + numberOfNights + "]";
	}
	
	 // Redefinition method equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        RéservationHotel that = (RéservationHotel) obj;
        return nomHotel.equals(that.nomHotel) && numberOfNights == that.numberOfNights;
    }

    // Redefinition method clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        RéservationHotel clone = (RéservationHotel) super.clone();
        clone.nomHotel = this.nomHotel;
        clone.numberOfNights = this.numberOfNights;
        return clone;
    }
	
	
	
	

}
