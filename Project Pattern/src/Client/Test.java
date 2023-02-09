package Client;


import java.util.*;

import Abstract_Factory.*;
import Builder.*;
import Bridge.*;
import Factory_method.*;
import singleton_template_method.*;
import Adapter.*;
import Composite.*;
import Decorator.*;

public class Test {
	
	// function of client that manage abstract factory pattern
	public static void abstractFactory() 
{
		IvehiculeFactory vehicule_ess = new VehiculeEssence();
		IvehiculeFactory vehicule_elec = new VehiculeElectric();
		
		// automobile
		Automobile automobile = null;
		// scooter
		Scooter scooter = null;
				
		System.out.println("\nUtilsation de la fabrique des vehicule a essence");
		automobile = vehicule_ess.creerAutomobile();
		automobile.setModele("Modele Africain");
		automobile.setCouleur("Rouge");
		automobile.setPuissance(300);
		scooter = vehicule_ess.creerScooter();
		automobile.afficher();
		scooter.afficher();
				
		System.out.println("\nutilsation de la fabrique des vehicule electrique");
		automobile = vehicule_elec.creerAutomobile();
		scooter = vehicule_elec.creerScooter();
		automobile.afficher();
		scooter.afficher();
	}
	
	public static void builder() 
{
		Scanner lire = new Scanner(System.in);
		MonteurLiasseVehicule monteur;
		System.out.println("construire les liasses (1) HTML ou (2) PDF");
		
		String choix = lire.next();
		lire.close();
		switch (choix) {
		case "1": {
			monteur = new MonteurLiasseVehiculeHTML();
		}break;
		case "2": {
			monteur = new MonteurLiasseVehiculePDF();
		}break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choix);
		}
		
		// le vendeur construire les document pour le client a svoir bon de commande....
		Vendeur vendeur = new Vendeur(monteur);
		LiasseDocument liasseDoc = vendeur.construire("jean");
		liasseDoc.afficher();
		
	}

	public static void factory() 
{
		// declarer les fabrique clientAC et clientPC
		ClientCommande clientPC = new ClientPC();
		ClientCommande clientAC = new ClientAC();
		
		Commande commande = null;
		
		// utilisation de la premiere fabrique
		System.out.println("\nUtilisation de la fabrique ClientAc");
		commande = clientAC.getNewCommande(5000);
		commande.paye();
		commande = clientAC.getNewCommande(4000);
		commande.paye();
		
		
		// utilisation de la seconf fabrique
		System.out.println("\nUtilisation de la fabrique ClientPc");
		commande = clientPC.getNewCommande(4000);
		commande.paye();
	}

	public static void singletons() 
{
		// initialiser les document vierge
		Document bonCommande = new BonDeCommande();
		bonCommande.setContenu("Jean");
		Document certSes = new CertificatDeSession();
		certSes.setContenu("Jean");
		Document immatriculation = new DemmandImmatriculation();
		immatriculation.setContenu("Jean");
		
		ArrayList<Document> docs = new ArrayList<Document>();
		docs.add(certSes);
		//ajout des document a la liasse Vierge
		LiasseViergeDocument s1 = LiasseViergeDocument.getLiasseVierge(docs);
		System.out.println("\najout d'un document a la liasse verge");
		s1.ajouter(immatriculation);
		s1.getDocument();
		
		System.out.println("\n");
		docs.add(bonCommande);
		LiasseViergeDocument s2 = LiasseViergeDocument.getLiasseVierge(docs);
		s2.getDocument();
	}

	public static void adapter() 
	{
		DocumentType document1, document2;
		document1 = new DocumentHTML();
		document1.setContenu("Pattern Leçon");
		document1.remplir();
		document1.imprime();
		System.out.println();
		document2 = new DocumentPDF();
		document2.setContenu("Pattern adapter");
		document2.remplir();
		document2.imprime();
	}
	
	public static void bridge() 
	{
		// form immatriculation cameroun en HTML
		FormImmatriculationCMR formulaire1 = new FormImmatriculationCMR(new FormulaireHTML());
		formulaire1.affiche();
		if (formulaire1.gereSaisie())
			formulaire1.genereDocument();
		System.out.println();
		// form immatriculation chine en widget
		FormImmatriculationChine formulaire2 = new FormImmatriculationChine(new FormulaireWidget());
		formulaire2.affiche();
		if (formulaire2.gereSaisie())
			formulaire2.genereDocument();
	}

	public static void composite() 
	{
		//societe sans filiales
		System.out.println("Socite 1" );
		Societe societe1 = new SocieteSansFiliale();
		societe1.ajouteVehicule();
		societe1.afficher();
		System.out.println("\nSocite 1" );
		Societe societe2 = new SocieteSansFiliale();
		societe2.ajouteVehicule();
		societe2.ajouteVehicule();
		societe2.afficher();
		
		//groupe de societe
		System.out.println("\nGroupe" );
		Societe groupe = new SocieteFiliale();
		groupe.ajouteFiliale(societe1);
		groupe.ajouteFiliale(societe2);
		groupe.ajouteVehicule();
		groupe.afficher();
	}
	
	public static void decorator() 
	{
		VueVehicule vueVehicule = new VueVehicule();
		ModeleDecorator modeleDecorateur = new
		ModeleDecorator(vueVehicule);
		
		MarqueDecorateur marqueDecorateur = new
		MarqueDecorateur(modeleDecorateur);
		marqueDecorateur.afficher();
		
	}
	
	public static void iterator() 
	{
		
	}
	
	public static void templateMethod()
	{
		
	}
	
	public static void main(String[] args) {
		
		
		
		// different functionalities of project menu
		System.out.println("******************************************************************************");
		System.out.println("******************************************************************************");
		System.out.println("\n*****************************\t Choix du Menu \t***************************");
		System.out.println("**************\t\t 1. Abstract Factory                                           *********");
		System.out.println("**************\t\t 2. Builder                                                              *********");
		System.out.println("**************\t\t 3. Factory Method                                             *********");
		System.out.println("**************\t\t 4. Singleton                                                          *********");
		System.out.println("**************\t\t 5. Adapter                                                            *********");
		System.out.println("**************\t\t 6. Bridge                                                               *********");
		System.out.println("**************\t\t 7. Composite                                                       *********");
		System.out.println("**************\t\t 8. Decorator                                                        *********");
		System.out.println("**************\t\t 9. Observer                                                          *********");
		System.out.println("**************\t\t 10. Iterator                                                           *********");
		System.out.println("**************\t\t 11. Template Method                                         *********");
		System.out.println("******************************************************************************");
		System.out.println("******************************************************************************");
		
		
		
		// system choice case
		int choix = 8;
		switch (choix){
		case 1:  {
			abstractFactory();
		} break;
		case 2: {
			builder();
		} break;
		case 3: {
			factory();
		} break;
		case 4: {
			singletons();
		} break;
		case 5: {
			adapter();
		} break;
		case 6: {
			bridge();
		} break;
		case 7: {
			composite();
		} break;
		case 8: {
			decorator();
		} break;
		case 9: {
			System.out.println("choix 9");
		} break;
		case 10: {
			System.out.println("choix 10");
		} break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
		
		
		
		
		
		

	}

} 
