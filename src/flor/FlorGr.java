package flor;

import java.awt.*;
import java.util.*;
import java.util.Arrays;  

import ponto.PontoGr;
import reta.RetaGr;


import ponto.PontoGr;
import reta.RetaGr;

import java.awt.*;

/**
 * Implementacao da classe reta grafica.
 *
 * @author Julio Arakaki
 * @version 1.0 - 24/08/2020
 */
public class FlorGr extends Flor{
    // Atributos da reta grafica
    Color corFlor1 = Color.BLACK;   // cor da reta
    Color corFlor2 = Color.BLACK;
    String nomeFlor = ""; // nome da reta
    Color corNomeFlor  = Color.BLACK;
    int espFlor = 1; // espessura da reta
//    GuiFlor gui = new GuiFlor(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp);

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
    public FlorGr(int x, int y, int xc, int yc, String nome, Color cor1, Color cor2, int esp){
        super (x, y, xc, yc);
        setCorFlor1(cor1);
        setCorFlor2(cor2);
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
    public FlorGr(int x, int y, int xc, int yc, Color cor1, Color cor2, int esp){
        super (x, y, xc, yc);
        setCorFlor1(cor1);
        setCorFlor2(cor2);
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
     * @param cor Color. Cor da reta
     * @param esp int. Espessura da reta
     */
    public FlorGr(int x, int y, int xc, int yc, Color cor1, int esp){
        super (x, y, xc, yc);
        setCorFlor1(cor1);
        setCorFlor2(Color.black);
        setNomeFlor("");
        setEspFlor(esp);
    }

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param x1   int. Coordenada x1
     * @param y1   int. Coordenada y1
     * @param x2   int. Coordenada x2
     * @param y2   int. Coordenada y2
     * @param g
     * @param nome
     * @param esp
     */
    public FlorGr(Graphics g, int x, int y, int xc, int yc, String nome, Color cor1, Color cor2, int esp){
        super(x, y, xc, yc);
        setCorFlor1(cor1);
        setCorFlor2(cor2);
        setNomeFlor("");
        setEspFlor(esp);
    }

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     */
    public FlorGr(PontoGr p3, PontoGr p4){
        super(p3, p4);
        setCorFlor1(Color.black);
        setCorFlor2(Color.black);
        setNomeFlor("");
    }

    /**
     * CirculoGr - Constroi um Circulo grafico
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     */
    public FlorGr(PontoGr p3, PontoGr p4, Color cor1, Color cor2){
        super(p3, p4);
        setCorFlor1(cor1);
        setCorFlor2(cor2);
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
    public FlorGr(PontoGr p3, PontoGr p4, Color cor1, Color cor2, String str){
        super(p3, p4);
        setCorFlor1(cor1);
        setCorFlor2(cor2);
        setNomeFlor(str);
    }

    /**
     * Altera a cor da reta.
     *
     * @param cor Color. Cor da reta.
     */
    public void setCorFlor1(Color cor) {
        this.corFlor1 = cor;
    }

    public void setCorFlor2(Color cor){
        this.corFlor2 = cor;
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
    public Color getCorFlor1() {
        return corFlor1;
    }

    public Color getCorFlor2(){
        return corFlor2;
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
        PontoGr ponto, ponto2;

        Color cor1 = getCorFlor1();
        Color cor2 = getCorFlor2();

        double theta, x, y, x2, y2, xAntInt, yAntInt, xProxExt, yProxExt, xAntExt, yAntExt, xAntExt2, yAntExt2, xExt, yExt, difX, difY, xCirculo, yCirculo, xc, yc, r, r2, r3, radianos, radianosInv;
        double angulo, anguloPonto;
        int cont = 0;
        xAntInt = 0;
        yAntInt = 0;
        xAntExt = 0;
        yAntExt = 0;

        xc = p3.getX();
        yc = p3.getY();
        x2 = p4.getX();
        y2 = p4.getY();

        r = Math.sqrt(Math.pow(x2 - xc,2) + Math.pow(y2 - yc,2));
        r3 = Math.sqrt(Math.pow((x2 - xc)*2,2) + Math.pow((y2 - yc)*2,2));

        // Angulo que a figura vai girar
        anguloPonto = Math.toDegrees(Math.atan2(x2 - xc, y2 - yc));
        anguloPonto = anguloPonto + Math.ceil(-anguloPonto / 360) * 360;
        anguloPonto -= 90;
        anguloPonto *= -1;

        // Calcula os 6 pontos internos e externos
        for (angulo = anguloPonto; angulo <= anguloPonto + 300; angulo+=60){
            radianos = Math.toRadians(angulo);

            // CALCULA os 6 Pontos Internos
            x = xc + r * Math.cos(radianos);
            y = yc + r * Math.sin(radianos);

            // Define e desenha os Pontos Internos
            ponto = new PontoGr((int)x, (int)y, getCorFlor1(), getEspFlor() + 10);
            ponto.desenharPonto(g);
            g.setColor(getCorNomeFlor());
            g.drawString(getNomeFlor(), (int)getP3().getX() + getEspFlor(), (int)getP3().getY());

            // CALCULA os 6 Pontos Externos
            x2 = xc + r * Math.cos(radianos+19.9);
            y2 = yc + r * Math.sin(radianos+19.9);
            difX = x - xc;
            difY = y - yc;
            xExt = x2 + difX;
            yExt = y2 + difY;

            // Define e desenha os Pontos Externos
            ponto2 = new PontoGr((int)xExt, (int)yExt, getCorFlor1(), getEspFlor() + 10);
            ponto2.desenharPonto(g);
            g.setColor(getCorNomeFlor());
            g.drawString(getNomeFlor(), (int)getP3().getX() + getEspFlor(), (int)getP3().getY());

            // Guarda a posicao do dos pontos proximo e anterior externo ao ponto atual
            xProxExt = x2 + ((xc + r * Math.cos(radianos-29.3333)) - xc);
            yProxExt = y2 + ((yc + r * Math.sin(radianos-29.3333)) - yc);
            xAntExt2 = xc + r * Math.cos(radianos-19.9) + ((xc + r * Math.cos(radianos+29.3333)) - xc);
            yAntExt2 = yc + r * Math.sin(radianos-19.9) + ((yc + r * Math.sin(radianos+29.3333)) - yc);

            // DESENHA os 6 Triangulos Externos
            RetaGr reta2;
            reta2 = new RetaGr((int)xc,(int)yc,(int)xExt,(int)yExt, cor1, getNomeFlor(),getEspFlor());
            reta2.verificarReta(g);
            reta2 = new RetaGr((int)xExt,(int)yExt,(int)xProxExt,(int)yProxExt, cor1, getNomeFlor(),getEspFlor());
            reta2.verificarReta(g);

            if (cont % 2 == 0){
                xAntInt = x;
                yAntInt = y;
                xAntExt = xExt;
                yAntExt = yExt;

            }
            else{
                // DESENHA os 3 Triangulos Internos
                RetaGr retaInt;
                retaInt = new RetaGr((int)getP3().getX(),(int)getP3().getY(),(int)x,(int)y, cor1, getNomeFlor(),getEspFlor());
                retaInt.verificarReta(g);
                retaInt = new RetaGr((int)getP3().getX(),(int)getP3().getY(),(int)xAntInt,(int)yAntInt, cor1, getNomeFlor(),getEspFlor());
                retaInt.verificarReta(g);

                // DESENHA os 2 Triangulos Meio
                RetaGr retaMeio;
                retaMeio = new RetaGr((int)xProxExt, (int)yProxExt, (int)xAntExt, (int)yAntExt, cor1,getNomeFlor(),getEspFlor());
                retaMeio.verificarReta(g);
                retaMeio = new RetaGr((int)xAntExt2, (int)yAntExt2, (int)xExt, (int)yExt, cor1,getNomeFlor(),getEspFlor());
                retaMeio.verificarReta(g);

            }
            cont++;

            // DESENHA os 6 Circulos
            for(theta = 360; theta >= 0; theta-=0.1){
                // Calcula as posicoes dos pontos que formam cada circulo
                r2 = Math.sqrt(Math.pow(xc - x,2) + Math.pow(yc - y,2));
                radianos = Math.toRadians(theta);
                xCirculo = x + r2 * Math.cos(radianos);
                yCirculo = y + r2 * Math.sin(radianos);

                // Desenha o circulo
                ponto = new PontoGr((int)xCirculo, (int)yCirculo, cor2, getEspFlor());
                ponto.desenharPonto(g);
                g.setColor(getCorNomeFlor());
                g.drawString(getNomeFlor(), (int)getP3().getX() + getEspFlor(), (int)getP4().getY());
            }
        }

        // DESENHA circulo interno
        for(theta = 0; theta <= 360; theta+=0.1){
            // Calcula as posicoes dos pontos que formam cada circulo
            radianos = Math.toRadians(theta);
            xCirculo = xc + r * Math.cos(radianos);
            yCirculo = yc + r * Math.sin(radianos);

            // Desenha o circulo
            ponto = new PontoGr((int)xCirculo, (int)yCirculo, cor2, getEspFlor());
            ponto.desenharPonto(g);
            g.setColor(getCorNomeFlor());
            g.drawString(getNomeFlor(), (int)getP3().getX() + getEspFlor(), (int)getP3().getY());
        }
    }
}