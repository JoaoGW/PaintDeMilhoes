package ponto;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Contem metodos para desenhar figuras com ponto
 * 
 * @author Julio Arakaki
 * @version 20220815
 */
public class FiguraPontos {

	/**
	 * Desenha um ponto na tela
	 * @param g biblioteca grafica para desenhar elementos gr�ficos
	 * @param x coordena x do ponto
	 * @param y coordenada y do ponto
	 * @param nome nome do ponto
	 * @param diametro diametro do ponto
	 * @param cor cor do ponto
	 */
	public static void desenharPonto(Graphics g, int x, int y, String nome, int diametro, Color cor){
		// Color cor = new Color((int) (Math.random() * 256),  
		// (int) (Math.random() * 256),  
		// (int) (Math.random() * 256));
		PontoGr p = new PontoGr(x, y, cor, nome, diametro);
		p.desenharPonto(g);
	}

	/**
	 * Desenha variso pontos na tela com cores diferentes
	 * @param g biblioteca grafica para desenhar elementos gr�ficos
	 * @param qtde quantidade de pontos
	 * @param diametro diametro do pontos
	 */
	public static void desenharPontos(Graphics g, int qtde, int diametro){

		for(int i=0; i < qtde; i++) {
			int x = (int) (Math.random() * 801);
			int y = (int) (Math.random() * 801);

			// R, G e B aleatorio
			Color cor = new Color((int) (Math.random() * 256),  
					(int) (Math.random() * 256),  
					(int) (Math.random() * 256));
			PontoGr p = new PontoGr(x, y, cor, diametro);
			p.desenharPonto(g);
		}
	}
}
