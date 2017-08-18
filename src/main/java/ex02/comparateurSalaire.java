package ex02;

import java.util.Comparator;

public class comparateurSalaire implements Comparator<Employe> {

	public int compare(Employe e1, Employe e2) {

		if (e1.getSalaire() < e2.getSalaire()) {
			return 1;

		} else if (e1.getSalaire() > e2.getSalaire()) {
			return -1;
		}
		// }else (e1.getSalaire() = e2.getSalaire()){
		else
			return 0;
	}

}
