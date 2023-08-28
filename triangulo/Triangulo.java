package triangulo;

import ponto.Ponto;
import reta.Reta;

/**
 * Escreva uma descrição da classe Triangulo aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class Triangulo
{
    // Atributos da reta
    public Ponto p1, p2, p3;    
    
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
    public Triangulo(int x1, int y1, int x2, int y2, int x3,int y3) {
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
        setP3(new Ponto(x3, y3));
    }
    
    /**
     * Constroi uma reta com valores (double) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
        setP3(new Ponto(x3, y3));
    }
    
    /**
     * Controi uma reta com valores de p1 e p2 (externos)
     *
     * @param p1 Um parâmetro
     * @param p2 Um parâmetro
     */
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        setP1(p1);
        setP2(p2);
        setP3(p3);
    }
    
    /**
     * Constroi uma reta com dados de outra (externa)
     *
     * @param r reta externa
     */
    public Triangulo(Triangulo r){
        setP1(r.getP1());
        setP2(r.getP2());
        setP3(r.getP3());
    }
    
    /**
     * Altera valor de p1 de acordo com o parametro
     *
     * @param p valor de p1 (externo)
     */
    public void setP1(Ponto p){
        this.p1 = p;
    }
    
    public void setP3(Ponto p){
        this.p3 = p;
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
    
    public Ponto getP3(){
        return this.p3;
    }
}
