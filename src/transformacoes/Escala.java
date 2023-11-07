package transformacoes;

import reta.FiguraRetas;

import java.awt.*;

public class Escala{
    public void escalaTriangulo(Graphics g, double Sx, double Sy, double x1, double y1, double x2, double y2, double x3, double y3, int esp, Color cor){
        //Calula a escala do triângulo a partir de um ponto qualquer
        double xa = (x1 * Sx) + x1 * (1- Sx);
        double ya = (y1 * Sy) + y1 * (1- Sy);
        double xb = (x2 * Sx) + x1 * (1- Sx);
        double yb = (y2 * Sy) + y1 * (1- Sy);
        double xc = (x3 * Sx) + x1 * (1- Sx);
        double yc = (y3 * Sy) + y1 * (1- Sy);

        //Desenha a escala do triângulo
        FiguraRetas.desenharReta(g, (int)xa, (int)ya, (int)xb, (int)yb, "", esp, cor);
        FiguraRetas.desenharReta(g, (int)xb, (int)yb, (int)xc, (int)yc,"",esp, cor);
        FiguraRetas.desenharReta(g, (int)xc, (int)yc, (int)xa, (int)ya,"",esp, cor);
    }
}


