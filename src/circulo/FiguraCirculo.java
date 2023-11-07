package circulo;

import java.awt.*;

/**
 * Possui em seu conte�do a funcionalidade principal de desenho da forma do
 * c�rculo, carrega consigo os pontos, cor e espessura que ser�o utilizados
 * para a cria��o deste conte�do.
 *
 * @author Pedro Marques Prado, Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */

/*
 * Desenha uma reta de acordo com os pontos par�metros
 *
 * @param g biblioteca para desenhar o primitivo grafico
 * @param x coordenada x de p1
 * @param y coordenada y de p1
 * @param xc coordenada x de p2
 * @param yc coordenada y de p2
 * @param nome nome do C�rculo
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