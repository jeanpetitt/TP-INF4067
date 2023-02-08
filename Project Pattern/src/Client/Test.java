package Client;

import Abstract_Factory.Automobile;
import Abstract_Factory.IvehiculeFactory;
import Abstract_Factory.Scooter;
import Abstract_Factory.VehiculeElectric;
import Abstract_Factory.VehiculeEssence;

public class Test {
	
	// function of client that manage abstract factory pattern
	public static void abstractFactory() {
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
		int n = 1;
		switch (n ){
		case 1:  {
			abstractFactory();
		} break;
		case 2: {
			System.out.println("choix 2");
		} break;
		case 3: {
			System.out.println("choix 3");
		} break;
		case 4: {
			System.out.println("choix 4");
		} break;
		case 5: {
			System.out.println("choix 5");
		} break;
		case 6: {
			System.out.println("choix 6");
		} break;
		case 7: {
			System.out.println("choix 7");
		} break;
		case 8: {
			System.out.println("choix 8");
		} break;
		case 9: {
			System.out.println("choix 9");
		} break;
		case 10: {
			System.out.println("choix 10");
		} break;
		case 11: {
			System.out.println("choix 11");
		} break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
		
		
		
		
		
		

	}

} 
