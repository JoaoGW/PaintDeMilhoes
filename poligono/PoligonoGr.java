package poligono;

import java.awt.*;

import reta.RetaGr;
import ponto.PontoGr; 

/**
 * Escreva uma descrição da classe PoligonoGr aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class PoligonoGr extends Poligono
{
    //Instanciação do painel de quantidade de lados
    PoligonoQtd paineisPoligono = new PoligonoQtd();
    
    //Cor inicial padrão do triângulo
    Color corPoligono = Color.BLACK;
    //Nome do retângulo
    String nomePoligono = "";
    //A cor que vai no nome do poligono
    Color corNomePoligono  = Color.BLACK; 
    //Espessura do poligono
    int espPoligono = 1;
    
    public PoligonoGr(int x1, int y1, int x2, int y2,int x3,int y3, int x4,int y4,int x5,int y5,int x6,int y6,int x7,int y7, int x8,int y8,Color cor, String nome, int esp){
        super(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8);
        
        setCorPoligono(cor);
        setNomePoligono(nome);
        setEspPoligono(esp);
    }
    
    /**
     * Altera a cor da reta.
     *
     * @param cor Color. Cor da reta.
     */
    public void setCorPoligono(Color cor) {
        this.corPoligono = cor;
    }

    /**
     * Altera o nome da reta.
     *
     * @param str String. Nome da reta.
     */
    public void setNomePoligono(String str) {
        this.nomePoligono = str;
    }

    /**
     * Altera a espessura da reta.
     *
     * @param esp int. Espessura da reta.
     */
    public void setEspPoligono(int esp) {
        this.espPoligono = esp;
    }

    /**
     * Retorna a espessura da reta.
     *
     * @return int. Espessura da reta.
     */
    public int getEspPoligono() {
        return(this.espPoligono);
    }

    /**
     * Retorna a cor da reta.
     *
     * @return Color. Cor da reta.
     */
    public Color getCorPoligono() {
        return corPoligono;
    }

    /**
     * Retorna o nome da reta.
     *
     * @return String. Nome da reta.
     */
    public String getNomePoligono() {
        return nomePoligono;
    }

    /**
     * @return the corNomeReta
     */
    public Color getCorNomePoligono() {
        return corNomePoligono;
    }

    /**
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomePoligono(Color corNomePoligono) {
        this.corNomePoligono = corNomePoligono;
    }
    
    /**
     * Método desenharRetangulo
     *
     * @param g Um parâmetro
     */
    public void desenharPoligono(Graphics g){
        RetaGr reta;
        
        int qtdLados = paineisPoligono.painelQuantidadePoligono();
        
        //Definindo a quantidade de lados que este poligono terá
        try{
            switch(qtdLados){
                //Caso sejam 5 lados
                case 5:
                    reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                        
                    reta = new RetaGr((int)getP2().getX(),(int)getP2().getY(),(int)getP3().getX(),(int)getP3().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP3().getX(),(int)getP3().getY(),(int)getP4().getX(),(int)getP4().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP4().getX(),(int)getP4().getY(),(int)getP1().getX(),(int)getP1().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    break;
                //Caso sejam 6 lados
                case 6:
                    reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                        
                    reta = new RetaGr((int)getP2().getX(),(int)getP2().getY(),(int)getP3().getX(),(int)getP3().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP3().getX(),(int)getP3().getY(),(int)getP4().getX(),(int)getP4().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP4().getX(),(int)getP4().getY(),(int)getP5().getX(),(int)getP5().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP5().getX(),(int)getP5().getY(),(int)getP1().getX(),(int)getP1().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    break;
                //Caso sejam 7 lados
                case 7:
                    reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                        
                    reta = new RetaGr((int)getP2().getX(),(int)getP2().getY(),(int)getP3().getX(),(int)getP3().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP3().getX(),(int)getP3().getY(),(int)getP4().getX(),(int)getP4().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP4().getX(),(int)getP4().getY(),(int)getP5().getX(),(int)getP5().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP5().getX(),(int)getP5().getY(),(int)getP6().getX(),(int)getP6().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP6().getX(),(int)getP6().getY(),(int)getP1().getX(),(int)getP1().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    break;
                //Caso sejam 8 lados   
                case 8:
                    reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                        
                    reta = new RetaGr((int)getP2().getX(),(int)getP2().getY(),(int)getP3().getX(),(int)getP3().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP3().getX(),(int)getP3().getY(),(int)getP4().getX(),(int)getP4().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP4().getX(),(int)getP4().getY(),(int)getP5().getX(),(int)getP5().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP5().getX(),(int)getP5().getY(),(int)getP6().getX(),(int)getP6().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP6().getX(),(int)getP6().getY(),(int)getP7().getX(),(int)getP7().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP7().getX(),(int)getP7().getY(),(int)getP1().getX(),(int)getP1().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr(0, 0, 0, 0, getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    break;
                //Caso sejam 9 lados  
                case 9:
                    reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                        
                    reta = new RetaGr((int)getP2().getX(),(int)getP2().getY(),(int)getP3().getX(),(int)getP3().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP3().getX(),(int)getP3().getY(),(int)getP4().getX(),(int)getP4().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP4().getX(),(int)getP4().getY(),(int)getP5().getX(),(int)getP5().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP5().getX(),(int)getP5().getY(),(int)getP6().getX(),(int)getP6().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP6().getX(),(int)getP6().getY(),(int)getP7().getX(),(int)getP7().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP7().getX(),(int)getP7().getY(),(int)getP8().getX(),(int)getP8().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    
                    reta = new RetaGr((int)getP8().getX(),(int)getP8().getY(),(int)getP1().getX(),(int)getP1().getY(), getCorPoligono(), getNomePoligono(),getEspPoligono());
                    reta.verificarReta(g);
                    break;
            }
        }catch(Exception e){
            paineisPoligono.painelNumeroInvalido();
        }
    }
}