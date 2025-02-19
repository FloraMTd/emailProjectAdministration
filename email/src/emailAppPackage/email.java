package emailAppPackage;

import java.util.Scanner;

/**
 * Vous faites partie du support IT et vous êtes en charge de générer
 * des adresses mails pour les nouveaux arrivants.
 * cette application permettra de generer une @mail sous la forme prenom.nom@departement.entreprise.com
 * permettra de determiner lle departement (vente, developpement, marketing...)
 * de genrer aleatoirement un mot de passe
 * avoir des methodes pour changer le mdp, la capacite de la boite mail et definir un mail par defat
 * et enfin une methode pour afficher le nom, l'email...
 */


public class email {
	private String prenom;
	private String nom;
	private String mdp;
	private String departement;
	private int mailCapacite;
	private String alternateMail;

	
	//constructeur nom et prenom
	
	public email(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		System.out.println("FULL NAME CREATED: " + this.prenom +" "+ this.nom);
		
		//appeler la methode qui retourne le departement
		this.departement = setDepartement();
		System.out.println("Departement : " +this.departement);
		
		//appeler la methode qui retourne le mot de passe
		this.mdp = randomPassword(12);
		System.out.println("\nEMAIL CREATED: " + this.prenom +"."+ this.nom + "@"+ this.departement +".company.com");
		System.out.println("Your password is " + this.mdp);
	}

	
	// renseigner le departement
	
	private String getDepartement() {
		return departement;
	}


	private String setDepartement() {
		System.out.println("Code departement:\n1 pour Vente\n2 pour Developpement\n3 pour Marketing\n0 pour none\n Entrez le departement");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num == 1) { return "Vente"; }
		else if (num == 2) { return "Developpement"; }
		else if (num == 3) {return "Marketing"; }
		else { return ""; }
		
	}
	
	// generer le mot de passe

	/**
	 * pour generer ce mdp, on va generer un nombre entre 0 et 1 multiplié par la taille des caracteres
	 * @param length
	 * @return
	 */
	private String randomPassword(int length) {
		String pwd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char [length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random()*pwd.length());
			password[i] = pwd.charAt(rand);
		}
		return new String(password);	
	}
	
	// renseigner la capacité
	
	// renseigner le mail alternatif

}
