package org.vitu.exceptions;

import org.vitu.exceptions.model.Commune;

public class PlayWithNullPointerException {

	public static void main(String[] args) {
		
		Commune commune = new Commune();
		
		int length = commune.getMaire().getAdresse().getRue().length();
		System.out.println("Length = " + length);

	}

}
