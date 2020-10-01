package boardgame;

public class Tabuleiro {
	private int colunas;
	private int linhas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	// Retorna peça de acordo com a linha e coluna
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	//Retorna peça de acordo com a posição
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
}
