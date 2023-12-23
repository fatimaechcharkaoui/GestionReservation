package pk;

import java.util.Arrays;
import java.util.Collections;

public class AgenceVoyage {

		// Tableau reservations
		private Réservation[] réservations;
		
		public AgenceVoyage(Réservation[] réservations) {
			super();
			this.réservations = réservations;
		}

		public Réservation[] getRéservations() {
			return réservations;
		}

		public void setRéservations(Réservation[] réservations) {
			this.réservations = réservations;
		}
		
	    // Method pour trier reservations par numero
	    public void trierRéservationsParNuméro() {
	        Arrays.sort(réservations);
	    }
	    
	    // Ajouter une réservation
	    public void ajouterRéservation(Réservation nouvelleRéservation) {
	        // Créer un nouveau tableau avec une taille augmentée
	        Réservation[] nouveauTableau = Arrays.copyOf(réservations, réservations.length + 1);
	        // Ajouter la nouvelle réservation à la fin du tableau
	        nouveauTableau[nouveauTableau.length - 1] = nouvelleRéservation;
	        // Mettre à jour le tableau de réservations
	        réservations = nouveauTableau;
	    }

	    // Supprimer une réservation
	    public void supprimerRéservation(int numéroRéservationASupprimer) {
	        // Filtrer les réservations différentes de celle à supprimer
	        Réservation[] nouveauTableau = Arrays.stream(réservations)
	                .filter(r -> r.getNuméroRéservation() != numéroRéservationASupprimer)
	                .toArray(Réservation[]::new);
	        // Mettre à jour le tableau de réservations
	        réservations = nouveauTableau;
	    }
	    
	    // Compter le nombre d'éléments dans le tableau
	    public int compterRéservations() {
	        return réservations.length;
	    }
	    
	    // Inverser l'ordre du tableau
	    public void inverserOrdreRéservations() {
	        Collections.reverse(Arrays.asList(réservations));
	    }
	    
		// Méthode pour afficher toutes les réservations
	    public void afficherRéservations() {
	        for (Réservation réservation : réservations) {
	            System.out.println(réservation);
	        }
	    }
	    
	    // Renvoyer l'élément le plus grand
	    public Réservation élémentLePlusGrand() {
	        if (réservations.length == 0) {
	            return null;
	        }
	        Réservation plusGrand = réservations[0];
	        for (Réservation réservation : réservations) {
	            if (réservation.compareTo(plusGrand) > 0) {
	                plusGrand = réservation;
	            }
	        }
	        return plusGrand;
	    }
	    
	    // Tester l'égalité de deux tableaux
	    public boolean estÉgal(AgenceVoyage autreAgence) {
	        return Arrays.equals(this.réservations, autreAgence.réservations);
	    }
	    

	public static void main(String[] args) {
		

	}

}
