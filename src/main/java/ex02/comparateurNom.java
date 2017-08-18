package ex02;

import java.util.Comparator;

public class comparateurNom implements Comparator<Employe> {

	public int compare(Employe e1, Employe e2) {

		if (e1.getNom().compareTo(e2.getNom()) >0) {
			return 1;

		} else if (e1.getNom().compareTo(e2.getNom()) < 0) {
			return -1;
		}
	
		else
			return 0;
	}

	
}
