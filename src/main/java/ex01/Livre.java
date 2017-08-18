package ex01;

public class Livre {

	private int annee;
	private String auteur;
	private String nom;
	private int salle;

	public Livre(int annee, String auteur, String nom, int salle) {
		this.annee = annee;
		this.auteur = auteur;
		this.nom = nom;
		this.salle = salle;		
	}
	
	@Override
	public String toString() {
		return "annee=" + annee + ", auteur=" + auteur + ", nom=" + nom + ", salle=" + salle + " \n";
	}
	///////////////////////////////////////////////////////////////////////////////////
	// Getters and Setters
	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee
	 *            the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur
	 *            the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the salle
	 */
	public int getSalle() {
		return salle;
	}

	/**
	 * @param salle
	 *            the salle to set
	 */
	public void setSalle(int salle) {
		this.salle = salle;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

}
