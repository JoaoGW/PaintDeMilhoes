package retangulo;

import ponto.Ponto;
import reta.Reta;

/**
 * Aqui estão presentes os construtores do retângulo, com parâmetros dinâmicos.
 * Além disso também pode-se encontrar a lógica do cálculo para o funcionamento
 * dos pontos alternados no plano cartesiano do canvas
 *
 * @author Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
 */
public class Retangulo
{
    // Atributos da reta do retângulo
    public Ponto p1, p2;

    /**
     * Constroi um retângulo com valores (int) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Retangulo(int x1, int y1, int x2, int y2) {
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
    }
    
    /**
     * Constroi um retângulo com valores (double) de x1, y1 e x2, y2
     *
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     */
    public Retangulo(double x1, double y1, double x2, double y2) {
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
    }
    
    /**
     * Controi um retângulo com valores de p1 e p2 (externos)
     *
     * @param p1 Um parâmetro do tipo Ponto que contém as informações do ponto
     * que serão criados para formar uma das retas do retângulo
     * @param p2 Um parâmetro Um parâmetro do tipo Ponto que contém as informações do ponto
     * que serão criados para formar uma das retas do retângulo
     */
    public Retangulo(Ponto p1, Ponto p2) {
        setP1(p1);
        setP2(p2);
    }
    
    /**
     * Constroi um retângulo com dados de outra (externa)
     *
     * @param r reta externa
     */
    public Retangulo (Retangulo r){
        setP1(r.getP1());
        setP2(r.getP2());
    }
    
    /**
     * Altera valor de p1 de acordo com o parâmetro
     *
     * @param p valor de p1 (externo)
     */
    public void setP1(Ponto p){
        this.p1 = p;
    }
    
    /**
     * Altera valor de p2 de acordo com o parâmetro
     *
     * @param p valor de p2 (externo)
     */
    public void setP2(Ponto p){
        this.p2 = p;
    }
    
    /**
     * Retorna valor de p1
     *
     * @return valor de p1 sendo ele do tipo Ponto
     */
    public Ponto getP1(){
        return this.p1;
    }
    
    /**
     * Retorna p2
     *
     * @return valor de p2 sendo ele do tipo Ponto
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
        double m = (getP2().getY() - getP1().getY())/(getP2().getX() - getP1().getX());
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