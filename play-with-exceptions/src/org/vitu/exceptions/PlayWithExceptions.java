package org.vitu.exceptions;

public class PlayWithExceptions {

	public static void main(String... args) { 	// throws MyAppException {
		// Si nous gardons 'main throws MyAppException, cela veut dire que nous ne faisons rien pour la gérer puisque main est la méthode mère
		// Nous ne pouvons pas renvoyer l'exception à une méthode mère à la méthode main, vu que c'est elle-même la méthode mère
		
		
		String information = "No information";
		information = getInformation();
		
//		try {
//			information = getInformation();
//		} catch (MyAppException e) {
//			// Nous imprimons le message
//			System.out.println("Exception = " + e.getMessage());
//			// Nous récupérons la StackTrace
//			e.printStackTrace();
//			// Tout ceci nous est imposé car MyAppException étends Exception qui est une CheckedException
//		}
//		System.out.println("Information = " + information);
	
	}
	
	public static String getInformation() throws MyAppException {
		// Ajouter 'throws MyAppException nous indique que cette variable là peut jeter une MyAppException
		// Dès que nous faisons ça, le JDK nous impose de gérer 'getInformation' car MyAppException est une CheckedException
		// Eclipse nous propose, soit d'ajouter une clause 'throws' (patate chaude), soit de mettre la déclaration dans un bloc try / catch
		// Nous avons un dernier warning sur 'information' nous indiquant qu'il faut initialiser la variable, donc nous le faisons. 
		
		return "Une information";
	}
	
}
