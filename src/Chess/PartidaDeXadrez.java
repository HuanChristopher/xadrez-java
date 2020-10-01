package Chess;

import boardgame.Tabuleiro;
// Aqui estarão as regras do jogo
public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	//Criamos o tabuleiro de acordo com as regras
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
	}
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i ++) {
			for(int j = 0; j < tabuleiro.getColunas(); j++) {
					mat[i][j] = (PecaXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
}
