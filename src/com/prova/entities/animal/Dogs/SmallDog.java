package com.prova.entities.animal.Dogs;

public class SmallDog extends NormalDog {
	public static String latirMuito() {
		//String latido = null;
		String latido = latir();
		for (int i = 0; i < 40; i++)
			latido += SOUND + " ";
		return latido;
	}
}

