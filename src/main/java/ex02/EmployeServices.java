package ex02;

import java.util.List;

public class EmployeServices {

	public double moyenneSalairesFront(List<DeveloppeurFront> listEmployeFront) {
		double moyenneFront = 0;
		double sommeFront = 0;

		for (DeveloppeurFront i : listEmployeFront) {
			sommeFront = sommeFront + i.getSalaire();
			moyenneFront = sommeFront / listEmployeFront.size();
		}

		return moyenneFront;

	}

	public double moyenneSalairesBack(List<DeveloppeurBack> listEmployeBack) {
		double moyenneBack = 0;
		double sommeBack = 0;

		for (DeveloppeurBack j : listEmployeBack) {
			sommeBack = sommeBack + j.getSalaire();
			moyenneBack = sommeBack / listEmployeBack.size();
		}

		return moyenneBack;

	}

	public double moyenneSalaires(List<DeveloppeurFront> listEmployeFront, List<DeveloppeurBack> listEmployeBack) {
		double moyenne = 0;
		double sommeFr = 0;
		double sommeBa = 0;
		for (Employe i : listEmployeFront) {

			sommeFr = sommeFr + i.getSalaire();
			// moyenneFr = sommeFr / listEmployeFront.size();
		}
		for (Employe i : listEmployeBack) {

			sommeBa = sommeBa + i.getSalaire();
			// moyenneBa = sommeBa / listEmployeBack.size();
		}
		moyenne = (sommeFr + sommeBa) / (listEmployeFront.size() + listEmployeBack.size());
		// moyenne = (moyenneFr + moyenneBa)/2;

		return moyenne;
	}
}
