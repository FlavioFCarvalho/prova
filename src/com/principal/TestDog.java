package com.principal;

import com.prova.entities.animal.Dogs.BigDog;
import com.prova.entities.animal.Dogs.NormalDog;
import com.prova.entities.animal.Dogs.SmallDog;
import com.prova.entities.animal.Dogs.SpecialDog;

public class TestDog {

	public static void main(String[] args) {

		NormalDog normalDog = new NormalDog();

		String nomeDog = normalDog.nome = "MeuDog";

		String latirNormalDog = NormalDog.latir();
		String latirMuitoNormalDog = NormalDog.latirMuito();
		String responderNormalDog = NormalDog.responder("parado");

		System.out.println("Normal Dog");
		System.out.println("Nome do dog: " + nomeDog);
		System.out.println("-");
		System.out.println("Latindo: " + latirNormalDog);
		System.out.println("- ");
		System.out.println("Latindo Muito: " + latirMuitoNormalDog);
		System.out.println("- ");
		System.out.println("Dog respondendo: " + responderNormalDog);
		System.out.println("------------------------------ ");

		SmallDog smallDogNome = new SmallDog();
		String nomeSmallDog = smallDogNome.nome = "Meu Small Dog";
		String latirSmallDog = SmallDog.latir();
		String latirMuitoSmallDog = SmallDog.latirMuito();
		String responderSmallDog = SmallDog.responder(SmallDog.SOUND);

		System.out.println("- ");
		System.out.println("SmallDog");
		System.out.println("Nome: " + nomeSmallDog);
		System.out.println("Latindo: " + latirSmallDog);
		System.out.println("Latindo Muito: " + latirMuitoSmallDog);
		System.out.println("Dog respondendo: " + responderSmallDog);
		System.out.println("------------------------------ ");

		SpecialDog specialDog = new SpecialDog();
		String nomeSpecialDog = smallDogNome.nome = "Meu Special Dog ";
		String latirSpecialDog = SpecialDog.latir();
		String latirMuitoSpecialDog = SpecialDog.latirMuito();
		String responderSpecialDog = SpecialDog.responder(SmallDog.SOUND);
		
		System.out.println("- ");
		System.out.println("SpecialDog");
		System.out.println("Nome: " + nomeSpecialDog);
		System.out.println("Latindo: " + latirSpecialDog);
		System.out.println("Latindo Muito: " + latirMuitoSpecialDog);
		System.out.println("Dog respondendo: " + responderSpecialDog);
		System.out.println("------------------------------ ");
		
		
		BigDog bigDog = new BigDog();
		String nomeBigDog = smallDogNome.nome = "Meu Big Dog ";
		String latirBigDog = BigDog.latir();
		String latirBigDogMuito = BigDog.latirMuito();
		String responderBigDog = BigDog.responder(SmallDog.SOUND);
		
		System.out.println("- ");
		System.out.println("Big Dog");
		System.out.println("Nome: " + nomeBigDog);
		System.out.println("Latindo: " + latirBigDog);
		System.out.println("Latindo Muito: " + latirBigDogMuito);
		System.out.println("Dog respondendo: " + responderBigDog);
		System.out.println("------------------------------ ");
	}

}
