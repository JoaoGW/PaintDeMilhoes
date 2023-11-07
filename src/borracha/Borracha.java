package borracha;

import ponto.Ponto;

/**
 * Possui os m�todos de captura de retorno de um valor e defini��o de um novo
 * valor (gets e sets). Tamb�m cont�m as equa��es para que seja poss�vel a cria��o da borracha.
 *
 * @author Pedro Marques Prado, Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */
public class Borracha
{
    // Atributos da reta
    public Ponto p1, p2;

    /**
     * Constroi uma reta com valores (int) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Borracha(int x1, int y1, int x2, int y2) {
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
    }
    
    /**
     * Constroi uma reta com valores (double) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Borracha(double x1, double y1, double x2, double y2) {
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
    }
    
    /**
     * Controi uma reta com valores de p1 e p2 (externos)
     *
     * @param p1 Um par�metro
     * @param p2 Um par�metro
     */
    public Borracha(Ponto p1, Ponto p2) {
        setP1(p1);
        setP2(p2);
    }
    
    /**
     * Constroi uma reta com dados de outra (externa)
     *
     * @param r reta externa
     */
    public Borracha(Borracha r){
        setP1(r.getP1());
        setP2(r.getP2());
    }
    
    /**
     * Altera valor de p1 de acordo com o parametro
     *
     * @param p valor de p1 (externo)
     */
    public void setP1(Ponto p){
        this.p1 = p;
    }
    
    /**
     * Altera valor de p2 de acordo com o parametro
     *
     * @param p valor de p2 (externo)
     */
    public void setP2(Ponto p){
        this.p2 = p;
    }
    
    /**
     * Retorna valor de p1
     *
     * @return valor de p1
     */
    public Ponto getP1(){
        return this.p1;
    }
    
    /**
     * Retorna p2
     *
     * @return valor de p2
     */
    public Ponto getP2(){
        return this.p2;
    }
    
    /**
     * Calcula o valor de m (da equacao reduzida de reta: y = mx + b)
     *
     * @return valor de m
     */
    public double calcularM(){
        // m = (y2-y1)/(x2-x1)
        double m = (getP2().getY() - getP1().getY())/(getP2().getX() - getP1().getX());
        return m;
    }
    
    public double calcularM2(){
        // m = (y2-y1)/(x2-x1)
        double m = (getP2().getX() - getP1().getX())/(getP2().getY() - getP1().getY());
        return m;
    }
    
     /**
      * Calcula o valor de b (y = mx + b)
      *
      * @return valor de b
      */
    public double calcularB(){
        //b = y1 - mx1
        double b = getP1().getY() - calcularM()*getP1().getX();
        return b;
    }
    
    public double calcularB2(){
        //b = y1 - mx1
        double b = getP1().getX() - calcularM2()*getP1().getY();
        return b;
    }
    
    /**
     * Imprime a equacao de reta no formato (y = mx + b)
     *
     * @return string que representa a reta
     */
    public String toString(){
        String s = "P1: " + getP1().toString() + " P2: " + getP2().toString();
        s = s + "\nEq. da reta: y = " + calcularM() + "*x + " + calcularB();
        return s;
    }
}