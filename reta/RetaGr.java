package reta;
import java.awt.Color;
import java.awt.Graphics;

import ponto.PontoGr;

/**
 * Implementacao da classe reta grafica.
 *
 * @author Julio Arakaki
 * @version 1.0 - 24/08/2020
 */
public class RetaGr extends Reta{
    // Atributos da reta grafica
    Color corReta = Color.BLACK;   // cor da reta
    String nomeReta = ""; // nome da reta
    Color corNomeReta  = Color.BLACK;
    int espReta = 1; // espessura da reta

    // Construtores
    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     * @param nome String. Nome da reta
     * @param esp int. Espessura da reta
     */
    public RetaGr(int x1, int y1, int x2, int y2, Color cor, String nome, int esp){
        super (x1, y1, x2, y2);
        setCorReta(cor);
        setNomeReta(nome);
        setEspReta(esp);
    }    

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     */
    public RetaGr(int x1, int y1, int x2, int y2, Color cor){
        super (x1, y1, x2, y2);
        setCorReta(cor);
        setNomeReta("");
    }   

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     * @param esp int. Espessura da reta
     */
    public RetaGr(int x1, int y1, int x2, int y2, Color cor, int esp){
        super (x1, y1, x2, y2);
        setCorReta(cor);
        setNomeReta("");
        setEspReta(esp);
    }   

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     */
    public RetaGr(int x1, int y1, int x2, int y2){
        super (x1, y1, x2, y2);
        setCorReta(Color.black);
        setNomeReta("");
    }   

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     */
    public RetaGr(PontoGr p1, PontoGr p2){
        super(p1, p2);
        setCorReta(Color.black);
        setNomeReta("");
    }    

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     */
    public RetaGr(PontoGr p1, PontoGr p2, Color cor){
        super(p1, p2);
        setCorReta(cor);
        setNomeReta("");
    }    

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     * @param nome String. Nome da reta
     */
    public RetaGr(PontoGr p1, PontoGr p2, Color cor, String str){
        super(p1, p2);
        setCorReta(cor);
        setNomeReta(str);
    }    

    /**
     * Altera a cor da reta.
     *
     * @param cor Color. Cor da reta.
     */
    public void setCorReta(Color cor) {
        this.corReta = cor;
    }

    /**
     * Altera o nome da reta.
     *
     * @param str String. Nome da reta.
     */
    public void setNomeReta(String str) {
        this.nomeReta = str;
    }

    /**
     * Altera a espessura da reta.
     *
     * @param esp int. Espessura da reta.
     */
    public void setEspReta(int esp) {
        this.espReta = esp;
    }

    /**
     * Retorna a espessura da reta.
     *
     * @return int. Espessura da reta.
     */
    public int getEspReta() {
        return(this.espReta);
    }

    /**
     * Retorna a cor da reta.
     *
     * @return Color. Cor da reta.
     */
    public Color getCorReta() {
        return corReta;
    }

    /**
     * Retorna o nome da reta.
     *
     * @return String. Nome da reta.
     */
    public String getNomeReta() {
        return nomeReta;
    }

    /**
     * @return the corNomeReta
     */
    public Color getCorNomeReta() {
        return corNomeReta;
    }

    /**
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomeReta(Color corNomeReta) {
        this.corNomeReta = corNomeReta;
    }

    public void verificarReta(Graphics g){
        if(p1.getX() < p2.getX()){
            desenharReta1(g);
        }
        else if(p1.getX() > p2.getX()){
            desenharReta2(g);
        }
        else{
            if(p1.getY() > p2.getY()){
                desenharReta3(g);    
            }
            else{
                desenharReta4(g);
            }
        }
    }

    /**
     * Desenha reta grafica utilizando a equacao da reta: y = mx + b
     * Para o caso de x1 > x2
     * @param g Graphics. Classe com os metodos graficos do Java
     */

    // ESQ pra DIR
    public void desenharReta1(Graphics g){
        // calcula m e b da equacao da reta y = mx + b
        double m = calcularM();
        double b = calcularB();
        double m2 = calcularM2();
        double b2 = calcularB2();

        // Variaveis auxiliares
        PontoGr ponto; 
        double x = 0, y = 0;

        double pIniX;
        double pFimX;
        double pIniY;
        double pFimY;

        // desenha nome do ponto
        g.setColor(getCorNomeReta());
        g.drawString(getNomeReta(), (int)getP1().getX() + getEspReta(), (int)getP1().getY());

        pIniX = p1.getX();
        pFimX = p2.getX();
        pIniY = p1.getY();
        pFimY = p2.getY();

        double difX = pIniX - pFimX;
        if (difX < 0){
            difX = difX * -1;
        }
        
        double difY = pIniY - pFimY;
        if (difY < 0){
            difY = difY * -1;
        }

        // se a dif entre os 2 x for maior
        if (difX > difY){
            // percorre de x1 ate x2. 
            // y e´ calculado pela equacao: y = mx + b
            for(x = pIniX; x <= pFimX; x++){

                // Calculo de y pela equacao da reta
                y = (m*x + b);

                // Define ponto grafico
                ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                // Desenha ponto grafico
                ponto.desenharPonto(g);
            }
        }
        // senao, se a dif entre os 2 y for maior
        else{
            // percorre de y1 ate y2. 
            // y e´ calculado pela equacao: y = mx + bv
            if (pIniY < pFimY)
                for(y = pIniY; y <= pFimY; y++){ 
                    // Calculo de y pela equacao da reta
                    x = (m2*y + b2);

                    // Define ponto grafico
                    ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                    
                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            else{
                for(y = pFimY; y <= pIniY; y++){ 
                    // Calculo de y pela equacao da reta
                    x = (m2*y + b2);

                    // Define ponto grafico
                    ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                    
                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            }
        }
    }

    // DIR pra ESQ
    public void desenharReta2(Graphics g){
        // calcula m e b da equacao da reta y = mx + b
        double m = calcularM();
        double b = calcularB();
        double m2 = calcularM2();
        double b2 = calcularB2();

        // Variaveis auxiliares
        PontoGr ponto; 
        double x = 0, y = 0;

        double pIniX;
        double pFimX;
        double pIniY;
        double pFimY;

        // desenha nome do ponto
        g.setColor(getCorNomeReta());
        g.drawString(getNomeReta(), (int)getP1().getX() + getEspReta(), (int)getP1().getY());

        pIniX = p1.getX();
        pFimX = p2.getX();
        pIniY = p1.getY();
        pFimY = p2.getY();

        double difX = pIniX - pFimX;
        if (difX < 0){
            difX = difX * -1;
        }
        double difY = pIniY - pFimY;
        if (difY < 0){
            difY = difY * -1;
        }

        // se a dif entre os 2 x for maior
        if (difX > difY){
            // percorre de x1 ate x2. 
            // y e´ calculado pela equacao: y = mx + b
            for(x = pIniX; x >= pFimX; x--){
                // Calculo de y pela equacao da reta
                y = (m*x + b);

                // Define ponto grafico
                ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                // Desenha ponto grafico
                ponto.desenharPonto(g);
            }
        }

        // senao, se a dif entre os 2 y for maior
        else{
            // percorre de y1 ate y2. 
            // y e´ calculado pela equacao: y = mx + bv
            if(pIniY > pFimY){
                for(y = pIniY; y >= pFimY; y--){ 
                    // Calculo de y pela equacao da reta
                    x = (m2*y + b2);

                    // Define ponto grafico
                    ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            }
            else{
                for(y = pFimY; y >= pIniY; y--){ 
                    // Calculo de y pela equacao da reta
                    x = (m2*y + b2);

                    // Define ponto grafico
                    ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            }
        }
    }

    // CIMA pra BAIXO caso perfeitamente vertical
    public void desenharReta3(Graphics g){
        // calcula m e b da equacao da reta y = mx + b
        double m = calcularM();
        double b = calcularB();

        // Variaveis auxiliares
        PontoGr ponto; 
        double x = 0, y = 0;

        double pIni;
        double pFim;

        // desenha nome do ponto
        g.setColor(getCorNomeReta());
        g.drawString(getNomeReta(), (int)getP1().getX() + getEspReta(), (int)getP1().getY());

        // percorre de x1 ate x2. 
        // y e´ calculado pela equacao: y = mx + b
        pIni = p1.getY();
        pFim = p2.getY();
        x = p1.getX();
        
        for(y = pIni; y >= pFim; y--){ 
            // Calculo de y pela equacao da reta
            //y = (m*x + b);
            // Define ponto grafico
            ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());

            // Desenha ponto grafico
            ponto.desenharPonto(g);
        }
    }

    // BAIXO pra CIMA caso perfeitamente vertical
    public void desenharReta4(Graphics g){
        // calcula m e b da equacao da reta y = mx + b
        double m = calcularM();
        double b = calcularB();

        // Variaveis auxiliares
        PontoGr ponto; 
        double x = 0, y = 0;

        double pIni;
        double pFim;

        // desenha nome do ponto
        g.setColor(getCorNomeReta());
        g.drawString(getNomeReta(), (int)getP1().getX() + getEspReta(), (int)getP1().getY());

        // percorre de x1 ate x2. 
        // y e´ calculado pela equacao: y = mx + b
        pIni = p1.getY();
        pFim = p2.getY();
        x = p1.getX();
        
        for(y = pFim; y >= pIni; y--){ 
            // Calculo de y pela equacao da reta
            //y = (m*x + b);
            // Define ponto grafico
            ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());

            // Desenha ponto grafico
            ponto.desenharPonto(g);
        }
    }
}