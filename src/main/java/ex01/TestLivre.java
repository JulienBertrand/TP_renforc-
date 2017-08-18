package ex01;

import java.util.ArrayList;
import java.util.List;

public class TestLivre {

	public static String[] auteurs = { "BASSO", "BERTRAND", "BONNET", "CELIKBAS", "DELPECHE", "EL ATMANI", "KACHI",
			"PICKEL", "PORTIER", "RODRIGUES", "YOU", "VLAS" };
	public static String[] nomsLivres = { "Comment avoir de beaux cheveux", "Java 8 Expert",
			"L'encyclopédie de la chanson", "L'univers des plantes", "Les drosophiles en 10 tomes",
			"L'histoire de la Chine sous Mao", "Vers l'infini et au-delà", "Pourquoi j'aime Trump",
			"Le ragout sous toutes ses formes", "1001 salades", "Le secret des codes barres",
			"L'art du brassage de la bière" };

	public static int[] annees = { 2010, 2015, 2012, 2014, 2013, 2016, 2011, 2015, 2010, 2016, 2015, 2013 };
	public static int[] salles = { 1, 2, 3 };

	public static void main(String[] args) {
		// TODO 1. Modifier la classe Livre afin de respecter les règles de
		// l'encapsulation

		// --> ajouter getters and setters

		// TODO 2. Mettre en place un constructeur dans la classe Livre qui prend en
		// paramètres: l'année, l'auteur, le nom, la salle
		// -->on génère un constructeur en utilisant la fonction automatique de STS;
		// fait aussi manuellement.

		// TODO 3. Dans cette classe TestLivre, instanciez une ArrayList de Livre.
		// Mettre 12 livres dans cette liste:
		// Chaque livre sera instancié à partir des informations dans les tableaux
		// ci-dessus.

		List<Livre> listLivre = new ArrayList<Livre>(12); // on crée une nouvelle liste de livres de taille 12
		for (int i = 0; i < annees.length; i++) { // on fait une boucle for, "traditionnelle car les tableaux de base
													// sont [], qui parcourt nos tableaux
			Livre unLivre = new Livre(annees[i], nomsLivres[i], auteurs[i], salles[(int) (Math.random() * 3)]); // on
																												// crée
																												// un
																												// objet
																												// Livre
																												// avec
																												// les
																												// paramètres
																												// du
																												// contructeur

			listLivre.add(unLivre); // on ajoute ce nouveau livre à notre liste listLivre

		}
		System.out.println(listLivre); // fait pour voir la liste

		// TODO 4. Créer une classe LivreServices
		// TODO 5. Dans la classe LivreServices, mettre en place une méthode qui prend
		// en paramètre une liste de livres
		// et qui retourne la liste des livres parus entre 2 années
		LivreServices a = new LivreServices(); // permet d'instancier un nouvel objet
		// "a" de type LivreServices

		System.out.println(a.triLivre(listLivre, 2009, 2013)); // permet de retourner
		// sur la console la liste des livres paru entre 2009 et 2013

		// TODO 6. Se servir de cette méthode pour afficher la liste des livres parus
		// entre 2010 et 2014 et ceux parus entre 2015 et 2017
		LivreServices b = new LivreServices();

		List<Livre> premierTri = b.triLivre(listLivre, 2010, 2015);
		System.out.println(premierTri);

		LivreServices c = new LivreServices();
		List<Livre> secondTri = c.triLivre(listLivre, 2015, 2017);
		System.out.println(secondTri);
		// TODO 7. Créer une méthode qui permet de rechercher les livres rangés dans une
		// salle donnée.

		LivreServices d = new LivreServices();
		List<Livre> triParSalle = d.triSalle(listLivre, 1);
		System.out.println(triParSalle);

		// TODO 8. Extraire la liste des livres parus entre 2010 et 2015 rangés dans les
		// salles 1 ou 2.

		LivreServices e = new LivreServices();
		List<Livre> triParSalleEtParAnnees1 = e.triLivre(e.triSalle(listLivre, 1), 2010, 2015);
		List<Livre> triParSalleEtParAnnees2 = e.triLivre(e.triSalle(listLivre, 2), 2010, 2015);
		List<Livre> triParSalleEtParAnnees3 = new ArrayList<>();
		triParSalleEtParAnnees3.addAll(triParSalleEtParAnnees1);
		triParSalleEtParAnnees3.addAll(triParSalleEtParAnnees2);
		System.out.println(triParSalleEtParAnnees3);
	}

}
