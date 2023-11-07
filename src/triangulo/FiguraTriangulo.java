package triangulo;

import java.awt.*;

/**
 * Tem como principal função o desenho da reta de acordo com as cores e espessuras selecionadas
 * Além de conter cálculos matemáticos para que seja possível a criação desse triangulo.
 *
 * @author Pedro Marques Prado,Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */
public class FiguraTriangulo
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
    public static void desenharTriangulo(Graphics g, int x1, int y1, int x2, int y2,int x3,int y3, String nome, int esp, Color cor){
        TrianguloGr r = new TrianguloGr(x1, y1, x2, y2, x3, y3, cor, nome, esp);
        r.desenharTriangulo(g);
    }
}