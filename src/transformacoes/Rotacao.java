package transformacoes;

import reta.FiguraRetas;
import retangulo.FiguraRetangulo;
import triangulo.FiguraTriangulo;
import dados.*;
import java.awt.Color;
import java.awt.Graphics;
public class Rotacao{
    public double calcAngulo(double angulo){
        return Math.toRadians(angulo);
    }

    public void rotacionarReta(Graphics g, double x1, double y1, double x2, double y2, int esp, double angulacao, Color cor){
        //Calcula de graus para radianos e modifica os pontos respectivamente ao ângulo desejado
        double angulo = calcAngulo(angulacao);

        double x2modif = x1 + ((x2 - x1) * Math.cos(angulo)) - ((y2 - y1) * Math.sin(angulo));
        double y2modif = y1 + ((x2 - x1) * Math.sin(angulo)) + ((y2 - y1) * Math.cos(angulo));

        //Desenha a nova reta
        FiguraRetas.desenharReta(g, (int)x1, (int)y1, (int)x2modif, (int)y2modif, "", esp, cor);
    }

    public void rotacionarRetangulo(Graphics g, double x1, double y1, double x2, double y2, int esp, double angulacao, Color cor){
        //Calcula de graus para radianos e modifica os pontos respectivamente ao ângulo desejado
        double angulo = calcAngulo(angulacao);

        double x2modif = x1 - ((y2 - y1) * Math.sin(angulo));
        double y2modif = y1 + ((y2 - y1) * Math.cos(angulo));
        double x3modif = x1 + ((x2 - x1) * Math.cos(angulo)) - ((y2 - y1) * Math.sin(angulo));
        double y3modif = y1 + ((x2 - x1) * Math.sin(angulo)) + ((y2 - y1) * Math.cos(angulo));
        double x4modif = x1 + ((x2 - x1) * Math.cos(angulo));
        double y4modif = y1 + ((x2 - x1) * Math.sin(angulo));

        //Desenha as novas retas
        FiguraRetas.desenharReta(g, (int)x1, (int)y1, (int)x2modif, (int)y2modif, "", esp, cor);
        FiguraRetas.desenharReta(g, (int)x2modif, (int)y2modif, (int)x3modif, (int)y3modif, "", esp, cor);
        FiguraRetas.desenharReta(g, (int)x3modif, (int)y3modif, (int)x4modif, (int)y4modif, "", esp, cor);
        FiguraRetas.desenharReta(g, (int)x4modif, (int)y4modif, (int)x1, (int)y1, "", esp, cor);
    }

    public void rotacionarTriangulo(Graphics g, double x1, double y1, double x2, double y2, double x3, double y3, int esp, double angulacao, Color cor){
        //Calcula de graus para radianos e modifica os pontos respectivamente ao ângulo desejado
        double angulo = calcAngulo(angulacao);

        double x2modif = x1 + (x2 - x1) * Math.cos(angulo) - (y2 - y1) * Math.sin(angulo);
        double y2modif = y1 + (x2 - x1) * Math.sin(angulo) + (y2 - y1) * Math.cos(angulo);
        double x3modif = x1 + (x3 - x1) * Math.cos(angulo) - (y3 - y1) * Math.sin(angulo);
        double y3modif = y1 + (x3 - x1) * Math.sin(angulo) + (y3 - y1) * Math.cos(angulo);

        //Desenha o novo triângulo
        FiguraTriangulo.desenharTriangulo(g, (int)x1, (int)y1, (int)x2modif, (int)y2modif, (int)x3modif, (int)y3modif, "", esp, cor);
    }
}
