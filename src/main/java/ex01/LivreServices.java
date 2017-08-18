package ex01;

import java.util.ArrayList;
import java.util.List;

public class LivreServices {

	public List<Livre> triLivre(List<Livre> listLivre, int anneeMin, int anneeMax) {

		List<Livre> listTriEntreDeuxAnnees = new ArrayList<Livre>();
		for (Livre i : listLivre) {
			if (i.getAnnee() < anneeMax && i.getAnnee() > anneeMin) {
				listTriEntreDeuxAnnees.add(i);
			}
		}
		return listTriEntreDeuxAnnees;

	}

}
