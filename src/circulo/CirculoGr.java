package circulo;

import java.awt.*;
import java.util.*;

import ponto.PontoGr;

/**
 * Possui os m�todos de captura de retorno de um valor e defini��o de um novo
 * valor (gets e sets). Tamb�m cont�m as equa��es para que seja poss�vel a cria��o do circulo.
 * Verifica as caracter�sticas do circylo para cada caso poss�vel.
 *
 * @author Pedro Marques Prado, Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */
public class CirculoGr extends Circulo{
    // Atributos da reta grafica
    Color corCirculo = Color.BLACK;   // cor da reta
    String nomeCirculo = ""; // nome da reta
    Color corNomeCirculo  = Color.BLACK;
    int espCirculo = 1; // espessura da reta

    // Construtores
    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     * @param nome String. Nome da reta
     * @param esp int. Espessura da reta
     */
    public CirculoGr(int x, int y, int xc, int yc, Color cor, String nome, int esp){
        super (x, y, xc, yc);
        setCorCirculo(cor);
        setNomeCirculo(nome);
        setEspCirculo(esp);
    }

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     */
    public CirculoGr(int x, int y, int xc, int yc, Color cor){
        super (x, y, xc, yc);
        setCorCirculo(cor);
        setNomeCirculo("");
    }   

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     * @param esp int. Espessura da reta
     */
    public CirculoGr(int x, int y, int xc, int yc, Color cor, int esp){
        super (x, y, xc, yc);
        setCorCirculo(cor);
        setNomeCirculo("");
        setEspCirculo(esp);
    }   

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     */
    public CirculoGr(int x, int y, int xc, int yc){
        super(x, y, xc, yc);
        setCorCirculo(Color.black);
        setNomeCirculo("");
    }   

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     */
    public CirculoGr(PontoGr p1, PontoGr p2){
        super(p1, p2);
        setCorCirculo(Color.black);
        setNomeCirculo("");
    }    

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     */
    public CirculoGr(PontoGr p1, PontoGr p2, Color cor){
        super(p1, p2);
        setCorCirculo(cor);
        setNomeCirculo("");
    }    

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     * @param nome String. Nome da reta
     */
    public CirculoGr(PontoGr p1, PontoGr p2, Color cor, String str){
        super(p1, p2);
        setCorCirculo(cor);
        setNomeCirculo(str);
    }    

    /**
     * Altera a cor da reta.
     *
     * @param cor Color. Cor da reta.
     */
    public void setCorCirculo(Color cor) {
        this.corCirculo = cor;
    }

    /**
     * Altera o nome da reta.
     *
     * @param str String. Nome da reta.
     */
    public void setNomeCirculo(String str) {
        this.nomeCirculo = str;
    }

    /**
     * Altera a espessura da reta.
     *
     * @param esp int. Espessura da reta.
     */
    public void setEspCirculo(int esp) {
        this.espCirculo = esp;
    }

    /**
     * Retorna a espessura da reta.
     *
     * @return int. Espessura da reta.
     */
    public int getEspCirculo() {
        return(this.espCirculo);
    }

    /**
     * Retorna a cor da reta.
     *
     * @return Color. Cor da reta.
     */
    public Color getCorCirculo() {
        return corCirculo;
    }

    /**
     * Retorna o nome da reta.
     *
     * @return String. Nome da reta.
     */
    public String getNomeCirculo() {
        return nomeCirculo;
    }

    /**
     * @return the corNomeReta
     */
    public Color getCorNomeCirculo() {
        return corNomeCirculo;
    }

    /**
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomeCirculo(Color corNomeCirculo) {
        this.corNomeCirculo = corNomeCirculo;
    }

    /**
     * Desenha reta grafica utilizando a equacao da reta: y = mx + b
     * Para o caso de x1 > x2
     * @param g Graphics. Classe com os metodos graficos do Java
     */
    public void desenharCirculoCompleto(Graphics g){
        // Variaveis auxiliares
        PontoGr ponto;
        
        int theta;
        double x, y,x2,y2, xc, yc,r, radianos;
        
        xc = p1.getX();
        yc = p1.getY();
        x2 = p2.getX();
        y2 = p2.getY();
        
        r = Math.sqrt(Math.pow(x2 - xc,2) + Math.pow(y2 - yc,2));   
        
        //System.out.println(r);
        
        for(theta = 0; theta <= 360; theta++){
            radianos = Math.toRadians(theta);
            x = xc + r * Math.cos(radianos);
            y = yc + r * Math.sin(radianos);
            
            // Define ponto grafico
            ponto = new PontoGr((int)x, (int)y, getCorCirculo(), getEspCirculo());
            
            // Desenha ponto grafico
            ponto.desenharPonto(g);
            
            // desenha nome do ponto
            g.setColor(getCorNomeCirculo());
            g.drawString(getNomeCirculo(), (int)getP1().getX() + getEspCirculo(), (int)getP1().getY());
        }        
    }
}