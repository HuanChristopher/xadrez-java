package aplicacao;

import Chess.PartidaDeXadrez;

public class Programa {

	public static void main(String[] args) {
		
		PartidaDeXadrez partida = new PartidaDeXadrez();
		UI.printBoard(partida.getPecas());
	}

}
