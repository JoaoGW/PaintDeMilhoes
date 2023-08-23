package poligono;

import java.awt.*;

/**
 * Escreva uma descrição da classe FiguraPoligono aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class FiguraPoligono
{
    /**
     * Desenha uma reta de acordo com os pontos p1, p2 e p3
     *
     * @param g biblioteca para desenhar o primitivo grafico
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     * @param x3 coordenada x de p3
     * @param y3 coordenada y de p3
     * @param nome nome da reta
     * @param esp espessura da reta
     * @param cor cor da reta
     */
    public static void desenharPoligono(Graphics g, int x1, int y1, int x2, int y2,int x3,int y3,int x4,int y4,int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8, String nome, int esp, Color cor){
        PoligonoGr r = new PoligonoGr(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8, cor, nome, esp);
        r.desenharPoligono(g);
    }
}