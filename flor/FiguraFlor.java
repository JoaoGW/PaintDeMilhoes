package flor;

import java.awt.*;

/**
 * Escreva uma descrição da classe FiguraCirculos aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class FiguraFlor
{
    public static void desenharFlor(Graphics g, int x, int y, int xc, int yc, String nome, int esp, Color cor){
        FlorGr r = new FlorGr(x, y, xc, yc, cor, nome, esp);
        r.desenharFlorCompleto(g);
    }
}