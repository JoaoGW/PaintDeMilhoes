package flor;

import ponto.Ponto;

/**
 * Escreva uma descri??o da classe Circulo aqui.
 *
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, Jo?o Pedro do Carmo Ribeiro
 * @version 1.0 14/08/2023
 */
public class Flor
{
    // Atributos da reta
    public Ponto p3, p4, p5;

    /**
     * Constroi uma reta com valores (int) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Flor(int x, int y, int xc, int yc) {
        setP3(new Ponto(x, y));
        setP4(new Ponto(xc, yc));
    }

    /**
     * Constroi uma reta com valores (double) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Flor(double x, double y, double xc, double yc) {
        setP3(new Ponto(x, y));
        setP4(new Ponto(xc, yc));
    }

    /**
     * Controi uma reta com valores de p1 e p2 (externos)
     *
     * @param p1 Um par?metro
     * @param p2 Um par?metro
     */
    public Flor(Ponto p3, Ponto p4) {
        setP3(p3);
        setP4(p4);
    }

    // TRIANGULOS DA FLOR
    public Flor(int x, int y, int xc, int yc, int xd, int yd) {
        setP3(new Ponto(x, y));
        setP4(new Ponto(xc, yc));
        setP5(new Ponto(xd, yd));
    }

    public Flor(double x, double y, double xc, double yc, double xd, double yd) {
        setP3(new Ponto(x, y));
        setP4(new Ponto(xc, yc));
        setP5(new Ponto(xd, yd));
    }

    public Flor(Ponto p3, Ponto p4, Ponto p5) {
        setP3(p3);
        setP4(p4);
        setP5(p5);
    }

    /**
     * Constroi uma reta com dados de outra (externa)
     *
     * @param r reta externa
     */
    public Flor(Flor r){
        setP3(r.getP3());
        setP4(r.getP4());
    }

    /**
     * Altera valor de p1 de acordo com o parametro
     *
     * @param p valor de p1 (externo)
     */
    public void setP3(Ponto p){
        this.p3 = p;
    }

    /**
     * Altera valor de p2 de acordo com o parametro
     *
     * @param p valor de p2 (externo)
     */
    public void setP4(Ponto p){
        this.p4 = p;
    }

    public void setP5(Ponto p){
        this.p5 = p;
    }

    /**
     * Retorna valor de p1
     *
     * @return valor de p1
     */
    public Ponto getP3(){
        return this.p3;
    }

    /**
     * Retorna p2
     *
     * @return valor de p2
     */
    public Ponto getP4(){
        return this.p4;
    }

    public Ponto getP5(){
        return this.p5;
    }

    /**
     * Imprime a equacao de reta no formato (y = mx + b)
     *
     * @return string que representa a reta
     */
    public String toString(){
        String s = "P3: " + getP3().toString() + " P4: " + getP4().toString() + " P5: " + getP5().toString();
        return s;
    }
}