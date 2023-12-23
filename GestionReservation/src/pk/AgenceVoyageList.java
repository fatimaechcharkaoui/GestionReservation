package pk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AgenceVoyageList {

	// Liste de réservations
	private List<Réservation> réservations;
	
	public AgenceVoyageList(List<Réservation> réservations) {
		super();
		this.réservations = réservations;
	}
	
	public List<Réservation> getRéservations() {
		return réservations;
	}

	public void setRéservations(List<Réservation> réservations) {
		this.réservations = réservations;
	}

	// Méthode pour alimenter la liste
    public void alimenterListe(Réservation nouvelleRéservation) {
        réservations.add(nouvelleRéservation);
    }

    //Afficher la liste (ligne par ligne)
    public void afficherListe() {
        for (Réservation réservation : réservations) {
            System.out.println(réservation);
        }
    }

    //parcourir la liste avec un itérateur
    public void parcourirListeAvecIterateur() {
        Iterator<Réservation> iterator = réservations.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //Insérer un élément dans la liste
    public void insererElement(Réservation nouvelleRéservation, int index) {
        réservations.add(index, nouvelleRéservation);
    }

    //Récupérer un élément de la liste
    public Réservation récupérerElement(int index) {
        if (index >= 0 && index < réservations.size()) {
            return réservations.get(index);
        } else {
            return null;
        }
    }

    // Méthode pour supprimer un élément de la liste
    public void supprimerElement(Réservation réservationASupprimer) {
        réservations.remove(réservationASupprimer);
    }

    // Méthode pour rechercher un élément dans la liste
    public boolean rechercherElement(Réservation réservationRecherchée) {
        return réservations.contains(réservationRecherchée);
    }

    // Méthode pour trier la liste
    public void trierListe() {
        Collections.sort(réservations);
    }
    
    // Méthode pour copier la liste dans un nouveau tableau
    public List<Réservation> copierListeDansTableau() {
        return new ArrayList<>(réservations);
    }

    // Méthode pour mélanger les éléments de la liste
    public void mélangerListe() {
        Collections.shuffle(réservations);
    }
    
    // Méthode pour inverser les éléments de la liste
    public void inverserListe() {
        Collections.reverse(réservations);
    }

    // Méthode pour extraire une partie de la liste
    public List<Réservation> extrairePartieListe(int début, int fin) {
        return réservations.subList(début, fin);
    }

    // Méthode pour comparer deux listes
    public boolean comparerListes(List<Réservation> autreListe) {
        return réservations.equals(autreListe);
    }
    
    // Méthode d'échange de deux éléments dans la liste
    public void échangerDeuxÉléments(int index1, int index2) {
        Collections.swap(réservations, index1, index2);
    }

    // Méthode pour vider la liste
    public void viderListe() {
        réservations.clear();
    }

    // Méthode pour tester si la liste est vide
    public boolean estListeVide() {
        return réservations.isEmpty();
    }
	public static void main(String[] args) {
		

	}

}
