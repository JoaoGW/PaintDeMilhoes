package retangulo;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Possui em seu conte�do a funcionalidade principal de desenho da forma do
 * ret�ngulo, carrega consigo os pontos, cor e espessura que ser�o utilizados
 * para a cria��o deste conte�do.
 *
 * @author Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
 */
public class FiguraRetangulo
{
    /**
     * Desenha um ret�ngulo de acordo com os seus pontos p1 e p2
     *
     * @param g biblioteca para desenhar o primitivo grafico
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     * @param nome nome do ret�ngulo
     * @param esp espessura do ret�ngulo
     * @param cor � a cor do ret�ngulo
     */
    public static void desenharRetangulo(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor){
        RetanguloGr r = new RetanguloGr(x1, y1, x2, y2, cor, nome, esp);
        r.desenharRetangulo(g);
    }
}
