package ex02;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

public class TestEmploye {

	public static String[] noms = { "Jackson", "Smith", "Warrand", "Cosco", "Clement", "Forrez", "Thomson", "Wood",
			"Pot", "Gavin", "Andrew", "Vaughn" };

	public static String[] postes = { "BACK", "FRONT", "BACK", "FRONT", "BACK", "FRONT", "BACK", "FRONT", "FRONT",
			"BACK", "FRONT", "BACK" };
	public static double[] salaires = { 2750.0, 2725.0, 2695.0, 2700.0, 2695.0, 2525.0, 2870.0, 3010.0, 2725.0, 2540.0,
			2310.0, 2250.0 };

	public static void main(String[] args) {
		// TODO 1. Modifier la classe Employe afin de respecter les règles de
		// l'encapsulation

		// mettre les paramètres en private et ajouter getters ans setters

		// TODO 2. Trouver un moyen de rendre la classe Employe impossible à instancier

		// la mettre en abstract

		// TODO 3. Faire en sorte que les classes DeveloppeurFront et DeveloppeurBack
		// héritent de Employe
		// créer ces classes et ajouter le mot "extends"

		// TODO 4. Mettre en place un constructeur dans la classe Employe avec les 2
		// paramètres: nom et salaire

		// mise en place automatiquement par STS

		// TODO 5. Mettre en place le même constructeur dans les classes filles.

		// Idem

		// TODO 6. Dans cette méthode, créez une ArrayList d'Employe et l'alimenter avec
		// les données des tableaux ci-dessus
		// On instanciera une instance de DeveloppeurBack si le postes[i] est BACK, et
		// DeveloppeurFront dans le cas
		// contraire.
		
		
		
		List<DeveloppeurFront> listEmployeFront = new ArrayList<DeveloppeurFront>();
		List<DeveloppeurBack> listEmployeBack = new ArrayList<DeveloppeurBack>();
		for (int i = 0; i < noms.length; i++) {
			if (postes[i].equals("FRONT")) {
				DeveloppeurFront devFront = new DeveloppeurFront(noms[i], salaires[i]);
				listEmployeFront.add(devFront);
			} else if (postes[i].equals("BACK")) {

				DeveloppeurBack devBack = new DeveloppeurBack(noms[i], salaires[i]);
				listEmployeBack.add(devBack);
			}

		}

		// TODO 7. Faire une classe qui va centraliser des services permettant de
		// répondre aux questions ci-dessous:
		// a. Quelle est la moyenne des salaires des développeurs BACK
		// b. Quelle est la moyenne des salaires des développeurs FRONT
		// c. Quelle est la moyenne des salaires

		// création de la classe EmployeServices pour centraliser les services
		EmployeServices front = new EmployeServices();
		System.out.println(front.moyenneSalairesFront(listEmployeFront));

		EmployeServices back = new EmployeServices();
		System.out.println(back.moyenneSalairesBack(listEmployeBack));
		
		EmployeServices total = new EmployeServices();
		System.out.println(total.moyenneSalaires(listEmployeFront, listEmployeBack));
		
		
		// TODO 8. Triez les employés par salaires descendants
		
		
		List<Employe> listEmploye =new ArrayList<Employe>();
		listEmploye.addAll(listEmployeFront);
		listEmploye.addAll(listEmployeBack);
		System.out.println(listEmploye);
		
		Collections.sort(listEmploye, new comparateurSalaire());
		System.out.println(listEmploye);
		// TODO 9. Triez les employés par ordre alphabétique
		
		Collections.sort(listEmploye, new comparateurNom());
		System.out.println(listEmploye);
		
		
	}
}
