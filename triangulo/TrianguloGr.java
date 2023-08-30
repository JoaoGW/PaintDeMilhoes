package triangulo;

import java.awt.Color;
import java.awt.Graphics;

import reta.RetaGr;
import ponto.PontoGr; 

/**
 * Escreva uma descrição da classe TrianguloGr aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class TrianguloGr extends Triangulo
{
    //Cor inicial padrão do triângulo
    Color corTriangulo = Color.BLACK;
    //Nome do retângulo
    String nomeTriangulo = "";
    Color corNomeTriangulo  = Color.BLACK; //a cor que vai no nome do triangulo
    int espTriangulo = 1; // espessura do retangulo
    
    public TrianguloGr(int x1, int y1, int x2, int y2,int x3,int y3, Color cor, String nome, int esp){
        super(x1, y1, x2, y2, x3, y3);
        
        setCorTriangulo(cor);
        setNomeTriangulo(nome);
        setEspTriangulo(esp);
    }
    
    /**
     * Altera a cor da reta.
     *
     * @param cor Color. Cor da reta.
     */
    public void setCorTriangulo(Color cor) {
        this.corTriangulo = cor;
    }

    /**
     * Altera o nome da reta.
     *
     * @param str String. Nome da reta.
     */
    public void setNomeTriangulo(String str) {
        this.nomeTriangulo = str;
    }

    /**
     * Altera a espessura da reta.
     *
     * @param esp int. Espessura da reta.
     */
    public void setEspTriangulo(int esp) {
        this.espTriangulo = esp;
    }

    /**
     * Retorna a espessura da reta.
     *
     * @return int. Espessura da reta.
     */
    public int getEspTriangulo() {
        return(this.espTriangulo);
    }

    /**
     * Retorna a cor da reta.
     *
     * @return Color. Cor da reta.
     */
    public Color getCorTriangulo() {
        return corTriangulo;
    }

    /**
     * Retorna o nome da reta.
     *
     * @return String. Nome da reta.
     */
    public String getNomeTriangulo() {
        return nomeTriangulo;
    }

    /**
     * @return the corNomeReta
     */
    public Color getCorNomeTriangulo() {
        return corNomeTriangulo;
    }

    /**
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomeTriangulo(Color corNomeTriangulo) {
        this.corNomeTriangulo = corNomeTriangulo;
    }
    
    /**
     * Método desenharRetangulo
     *
     * @param g Um parâmetro
     */
    public void desenharTriangulo(Graphics g){
        RetaGr reta;
        
        reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorTriangulo(), getNomeTriangulo(),getEspTriangulo());
        reta.verificarReta(g);
            
        reta = new RetaGr((int)getP2().getX(),(int)getP2().getY(),(int)getP3().getX(),(int)getP3().getY(), getCorTriangulo(), getNomeTriangulo(),getEspTriangulo());
        reta.verificarReta(g);
        
        reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP3().getX(),(int)getP3().getY(), getCorTriangulo(), getNomeTriangulo(),getEspTriangulo());
        reta.verificarReta(g);
    }
}
