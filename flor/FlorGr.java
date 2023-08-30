package flor;

import java.awt.*;
import java.util.*;
import java.util.Arrays;  

import ponto.PontoGr;

/**
 * Implementacao da classe reta grafica.
 *
 * @author Julio Arakaki
 * @version 1.0 - 24/08/2020
 */
public class FlorGr extends Flor{
    // Atributos da reta grafica
    Color corFlor = Color.BLACK;   // cor da reta
    String nomeFlor = ""; // nome da reta
    Color corNomeFlor  = Color.BLACK;
    int espFlor = 1; // espessura da reta

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
    public FlorGr(int x, int y, int xc, int yc, Color cor, String nome, int esp){
        super (x, y, xc, yc);
        setCorFlor(cor);
        setNomeFlor(nome);
        setEspFlor(esp);
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
    public FlorGr(int x, int y, int xc, int yc, Color cor){
        super (x, y, xc, yc);
        setCorFlor(cor);
        setNomeFlor("");
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
    public FlorGr(int x, int y, int xc, int yc, Color cor, int esp){
        super (x, y, xc, yc);
        setCorFlor(cor);
        setNomeFlor("");
        setEspFlor(esp);
    }   

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     */
    public FlorGr(int x, int y, int xc, int yc){
        super(x, y, xc, yc);
        setCorFlor(Color.black);
        setNomeFlor("");
    }   

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     */
    public FlorGr(PontoGr p1, PontoGr p2){
        super(p1, p2);
        setCorFlor(Color.black);
        setNomeFlor("");
    }    

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     */
    public FlorGr(PontoGr p1, PontoGr p2, Color cor){
        super(p1, p2);
        setCorFlor(cor);
        setNomeFlor("");
    }    

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     * @param nome String. Nome da reta
     */
    public FlorGr(PontoGr p1, PontoGr p2, Color cor, String str){
        super(p1, p2);
        setCorFlor(cor);
        setNomeFlor(str);
    }    

    /**
     * Altera a cor da reta.
     *
     * @param cor Color. Cor da reta.
     */
    public void setCorFlor(Color cor) {
        this.corFlor = cor;
    }

    /**
     * Altera o nome da reta.
     *
     * @param str String. Nome da reta.
     */
    public void setNomeFlor(String str) {
        this.nomeFlor = str;
    }

    /**
     * Altera a espessura da reta.
     *
     * @param esp int. Espessura da reta.
     */
    public void setEspFlor(int esp) {
        this.espFlor = esp;
    }

    /**
     * Retorna a espessura da reta.
     *
     * @return int. Espessura da reta.
     */
    public int getEspFlor() {
        return(this.espFlor);
    }

    /**
     * Retorna a cor da reta.
     *
     * @return Color. Cor da reta.
     */
    public Color getCorFlor() {
        return corFlor;
    }

    /**
     * Retorna o nome da reta.
     *
     * @return String. Nome da reta.
     */
    public String getNomeFlor() {
        return nomeFlor;
    }

    /**
     * @return the corNomeReta
     */
    public Color getCorNomeFlor() {
        return corNomeFlor;
    }

    /**
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomeFlor(Color corNomeFlor) {
        this.corNomeFlor = corNomeFlor;
    }

    /**
     * Desenha reta grafica utilizando a equacao da reta: y = mx + b
     * Para o caso de x1 > x2
     * @param g Graphics. Classe com os metodos graficos do Java
     */
    public void desenharFlorCompleto(Graphics g){
        // Variaveis auxiliares
        PontoGr ponto;

        int theta;
        double x, y,x2,y2, xc, yc,r, r2, radianos;
        double angulo;
        int cont = 0;
        //double pontosX[] = new double[6];
        //double pontosY[] = new double[6];

        xc = p1.getX();
        yc = p1.getY();
        x2 = p2.getX();
        y2 = p2.getY();

        r = Math.sqrt(Math.pow(x2 - xc,2) + Math.pow(y2 - yc,2));
        r2 = Math.sqrt(Math.pow(xc - x2,2) + Math.pow(yc - y2,2));

        //System.out.println(r);
        /*
        for(theta = 0; theta <= 360; theta++){
        radianos = Math.toRadians(theta);
        x = xc + r * Math.cos(radianos);
        y = yc + r * Math.sin(radianos);

        // Define ponto grafico
        ponto = new PontoGr((int)x, (int)y, getCorFlor(), getEspFlor());

        // Desenha ponto grafico
        ponto.desenharPonto(g);

        // desenha nome do ponto
        g.setColor(getCorNomeFlor());
        g.drawString(getNomeFlor(), (int)getP1().getX() + getEspFlor(), (int)getP1().getY());
        }

        for(theta = 360; theta >= 0; theta--){
        radianos = Math.toRadians(theta);
        x = x2 + r2 * Math.cos(radianos);
        y = y2 + r2 * Math.sin(radianos);

        // Define ponto grafico
        ponto = new PontoGr((int)x, (int)y, getCorFlor(), getEspFlor());

        // Desenha ponto grafico
        ponto.desenharPonto(g);

        // desenha nome do ponto
        g.setColor(getCorNomeFlor());
        g.drawString(getNomeFlor(), (int)getP1().getX() + getEspFlor(), (int)getP1().getY());
        }
         */

        for (angulo = 0; angulo <= 300; angulo+=60){
            radianos = Math.toRadians(angulo);
            x = xc + r * Math.cos(radianos);
            y = yc + r * Math.sin(radianos);
            //pontosX[cont] = x;
            //pontosY[cont] = y;
            System.out.println("cont:" + cont + " coord: " + x + " " + y);
            cont++;

            // Define ponto grafico
            ponto = new PontoGr((int)x, (int)y, getCorFlor(), 10);

            // Desenha ponto grafico
            ponto.desenharPonto(g);

            // desenha nome do ponto
            g.setColor(getCorNomeFlor());
            g.drawString(getNomeFlor(), (int)getP1().getX() + getEspFlor(), (int)getP1().getY());

            for(theta = 360; theta >= 0; theta--){
                //x2 = x;
                //y2 = y;
                r2 = Math.sqrt(Math.pow(xc - x2,2) + Math.pow(yc - y2,2));
                
                radianos = Math.toRadians(theta);
                x = x2 + r2 * Math.cos(radianos);
                y = y2 + r2 * Math.sin(radianos);

                // Define ponto grafico
                ponto = new PontoGr((int)x, (int)y, getCorFlor(), getEspFlor());

                // Desenha ponto grafico
                ponto.desenharPonto(g);

                // desenha nome do ponto
                g.setColor(getCorNomeFlor());
                g.drawString(getNomeFlor(), (int)getP1().getX() + getEspFlor(), (int)getP1().getY());
            }

        }

    }
}