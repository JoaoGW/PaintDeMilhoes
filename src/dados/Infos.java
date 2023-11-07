package dados;

import java.awt.Color;

/**
 * @author Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
 */
public class Infos {
    private String tipo;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private int espessura;
    private Color cor1;
    private Color cor2;

    public String getTipo(){
        return this.tipo;
    }

    public double getX1(){
        return this.x1;
    }

    public double getX2(){
        return this.x2;
    }

    public double getX3(){
        return this.x3;
    }

    public double getY1(){
        return this.y1;
    }

    public double getY2(){
        return this.y2;
    }

    public double getY3(){
        return this.y3;
    }

    public int getEspessura(){
        return this.espessura;
    }

    public Color getCor1(){
        return this.cor1;
    }

    public Color getCor2(){
        return this.cor2;
    }

    public void setTipo(String tp){
        this.tipo = tp;
    }

    public void setX1(double x1){
        this.x1 = x1;
    }

    public void setX2(double x2){
        this.x2 = x2;
    }

    public void setX3(double x3){
        this.x3 = x3;
    }

    public void setY1(double y1){
        this.y1 = y1;
    }

    public void setY2(double y2){
        this.y2 = y2;
    }

    public void setY3(double y3){
        this.y3 = y3;
    }

    public void setEspessura(int esp){
        this.espessura = esp;
    }

    public void setCor1(Color c1){
        this.cor1 = c1;
    }

    public void setCor2(Color c2){
        this.cor2 = c2;
    }
}
