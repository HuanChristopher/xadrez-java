package boardgame;

public class Peca {
	protected Posicao posicao;
	protected Tabuleiro tabueiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabueiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabueiro() {
		return tabueiro;
	}
	
}
