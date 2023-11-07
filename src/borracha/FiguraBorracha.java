package borracha;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Possui em seu conteúdo a funcionalidade principal de desenho da forma do
 * círculo, carrega consigo os pontos, cor e espessura que serão utilizados
 * para a criação deste conteúdo.
 *
 * @author Pedro Marques Prado, Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */
public class FiguraBorracha
{
    /**
     * Desenha uma reta de acordo com os pontos p1 e p2
     *
     * @param g biblioteca para desenhar o primitivo grafico
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     * @param nome nome da reta
     * @param esp espessura da reta
     * @param cor cor da reta
     */
    public static void desenharBorracha(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor){
        BorrachaGr r = new BorrachaGr(x1, y1, x2, y2, cor, nome, esp);
        r.verificarPincel(g );
    }
    
    /**
     * Desenha varias retas na area de desenho
     *
     * @param g biblioteca grafica para desenhar os primitivos
     * @param qtde quantidade de retas
     * @param esp espessura das retas
     */
    public static void desenharBorracha(Graphics g, int qtde, int esp){
        for(int i=0; i < qtde; i++) {
            int x1 = (int) (Math.random() * 801);
            int y1 = (int) (Math.random() * 801);
            int x2 = (int) (Math.random() * 801);
            int y2 = (int) (Math.random() * 801);

            // Cor (R, G e   B) aleatorio
            Color cor = new Color((int) (Math.random() * 256),  
                    (int) (Math.random() * 256),  
                    (int) (Math.random() * 256));
            BorrachaGr r = new BorrachaGr(x1, y1, x2, y2, cor, "", esp);
            r.verificarPincel(g);
        }
    }
}