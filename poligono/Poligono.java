package poligono;

import ponto.Ponto;
import reta.Reta;

/**
 * Escreva uma descrição da classe Poligono aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class Poligono
{
    // Atributos da reta
    public Ponto p1, p2, p3, p4, p5, p6, p7, p8;    
    
    /**
     * Constroi uma reta com valores (int) de x1, y1 e x2, y2 e x3, y3
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     * @param x3 coordenada x de p3
     * @param y3 coordenada y de p3
     */
    public Poligono(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int x7, int y7, int x8, int y8){
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
        setP3(new Ponto(x3, y3));
        setP4(new Ponto(x4, y4));
        setP5(new Ponto(x5, y5));
        setP6(new Ponto(x6, y6));
        setP7(new Ponto(x7, y7));
        setP8(new Ponto(x8, y8));
    }
    
    /**
     * Constroi uma reta com valores (double) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Poligono(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5, double x6, double y6, double x7, double y7, double x8, double y8){
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
        setP3(new Ponto(x3, y3));
        setP4(new Ponto(x4, y4));
        setP5(new Ponto(x5, y5));
        setP6(new Ponto(x6, y6));
        setP7(new Ponto(x7, y7));
        setP8(new Ponto(x8, y8));
    }
    
    /**
     * Controi uma reta com valores de p1 e p2 (externos)
     *
     * @param p1 Um parâmetro
     * @param p2 Um parâmetro
     */
    public Poligono(Ponto p1, Ponto p2, Ponto p3, Ponto p4, Ponto p5, Ponto p6, Ponto p7, Ponto p8) {
        setP1(p1);
        setP2(p2);
        setP3(p3);
        setP4(p4);
        setP5(p5);
        setP6(p6);
        setP7(p7);
        setP8(p8);
    }
    
    /**
     * Constroi uma reta com dados de outra (externa)
     *
     * @param r reta externa
     */
    public Poligono(Poligono r){
        setP1(r.getP1());
        setP2(r.getP2());
        setP3(r.getP3());
        setP4(r.getP4());
        setP5(r.getP5());
        setP6(r.getP6());
        setP7(r.getP7());
        setP8(r.getP8());
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
     * Altera valor de p3 de acordo com o parametro
     *
     * @param p valor de p3 (externo)
     */
    public void setP3(Ponto p){
        this.p3 = p;
    }
    
    /**
     * Altera valor de p4 de acordo com o parametro
     *
     * @param p valor de p4 (externo)
     */
    public void setP4(Ponto p){
        this.p4 = p;
    }
    
    /**
     * Altera valor de p5 de acordo com o parametro
     *
     * @param p valor de p5 (externo)
     */
    public void setP5(Ponto p){
        this.p5 = p;
    }
    
    /**
     * Altera valor de p6 de acordo com o parametro
     *
     * @param p valor de p6 (externo)
     */
    public void setP6(Ponto p){
        this.p6 = p;
    }
    
    /**
     * Altera valor de p7 de acordo com o parametro
     *
     * @param p valor de p7 (externo)
     */
    public void setP7(Ponto p){
        this.p7 = p;
    }
    
    /**
     * Altera valor de p8 de acordo com o parametro
     *
     * @param p valor de p8 (externo)
     */
    public void setP8(Ponto p){
        this.p8 = p;
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
     * Retorna p3
     *
     * @return valor de p3
     */
    public Ponto getP3(){
        return this.p3;
    }
    
    /**
     * Retorna p4
     *
     * @return valor de p4
     */
    public Ponto getP4(){
        return this.p4;
    }
    
    /**
     * Retorna p5
     *
     * @return valor de p5
     */
    public Ponto getP5(){
        return this.p5;
    }
    
    /**
     * Retorna p6
     *
     * @return valor de p6
     */
    public Ponto getP6(){
        return this.p6;
    }
    
    /**
     * Retorna p7
     *
     * @return valor de p7
     */
    public Ponto getP7(){
        return this.p7;
    }
    
    /**
     * Retorna p8
     *
     * @return valor de p8
     */
    public Ponto getP8(){
        return this.p8;
    }
}