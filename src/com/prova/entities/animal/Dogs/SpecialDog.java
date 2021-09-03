package com.prova.entities.animal.Dogs;

public class SpecialDog extends NormalDog {
	public static SpecialDog INSTANCE = new SpecialDog();

	public SpecialDog() {
	}

	public static String latir() {
		return "Warf";
	}
}
