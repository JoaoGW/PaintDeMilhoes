package circulo;

import java.awt.*;

/**
 * Possui em seu conteúdo a funcionalidade principal de desenho da forma do
 * círculo, carrega consigo os pontos, cor e espessura que serão utilizados
 * para a criação deste conteúdo.
 *
 * @author Pedro Marques Prado, Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */

/*
 * Desenha uma reta de acordo com os pontos parâmetros
 *
 * @param g biblioteca para desenhar o primitivo grafico
 * @param x coordenada x de p1
 * @param y coordenada y de p1
 * @param xc coordenada x de p2
 * @param yc coordenada y de p2
 * @param nome nome do Círculo
 * @param esp espessura do circulo
 * @param cor cor do circulo
 */
public class FiguraCirculo
{
    public static void desenharCirculo(Graphics g, int x, int y, int xc, int yc, String nome, int esp, Color cor){
        CirculoGr r = new CirculoGr(x, y, xc, yc, cor, nome, esp);
        r.desenharCirculoCompleto(g);
    }
}