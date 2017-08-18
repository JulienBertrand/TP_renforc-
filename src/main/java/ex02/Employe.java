package ex02;

public abstract class Employe {

	private String nom;
	private double salaire;

	/**
	 * @param nom
	 * @param salaire
	 */
	public Employe(String nom, double salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nom=" + nom + ", salaire=" + salaire + "\n";
	}

	//////////////////////////////
	// Getters and Setters
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
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire
	 *            the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
