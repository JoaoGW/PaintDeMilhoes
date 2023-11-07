package flor;

import java.awt.*;

/**
 * Tem como principal fun��o o desenho da reta de acordo com as cores e espessuras selecionadas
 * Al�m de conter c�lculos matem�ticos para que seja poss�vel a cria��o dessa flor
 *
 * @author Pedro Marques Prado,Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */
public class FiguraFlor
{
    public static void desenharFlor(Graphics g, int x, int y, int xc, int yc, String nome, Color cor1, Color cor2, int esp){
        FlorGr r = new FlorGr(g, x, y, xc, yc, nome, cor1, cor2, esp);
        r.desenharFlorCompleto(g);
        //System.out.println("VALORRR:" + xc + " " + yc);
    }
}