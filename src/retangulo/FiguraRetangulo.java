package retangulo;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Possui em seu conteúdo a funcionalidade principal de desenho da forma do
 * retângulo, carrega consigo os pontos, cor e espessura que serão utilizados
 * para a criação deste conteúdo.
 *
 * @author Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
 */
public class FiguraRetangulo
{
    /**
     * Desenha um retângulo de acordo com os seus pontos p1 e p2
     *
     * @param g biblioteca para desenhar o primitivo grafico
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     * @param nome nome do retângulo
     * @param esp espessura do retângulo
     * @param cor é a cor do retângulo
     */
    public static void desenharRetangulo(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor){
        RetanguloGr r = new RetanguloGr(x1, y1, x2, y2, cor, nome, esp);
        r.desenharRetangulo(g);
    }
}
