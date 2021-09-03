package com.prova.entities.animal.Dogs;

public class NormalDog {
	
	public String nome;
	
	public static final String SOUND = "Au";
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static String latir() {
		//return SOUND;
		return SOUND + " ";
	}

	public static String latirMuito() {
		//String latido = null;
		String latido = latir();
		for (int i = 0; i < 10; i++)
			latido += SOUND + " ";
		return latido;
	}

	public static String responder(String chamado) {
		if (chamado == SOUND)
			return latir() + latir();
		if (chamado == "parado")
			return latir();
		// else, do nothing
		return chamado;
	}
}





