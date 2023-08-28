package retangulo;

import java.awt.Color;
import java.awt.Graphics;

import reta.RetaGr;
import ponto.PontoGr;

/**
 * Possui os métodos de captura de retorno de um valor e definição de um novo
 * valor (gets e sets), todos estes serão referentes apenas a classe principal
 * do retângulo
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023)
 */
public class RetanguloGr extends Retangulo
{
    //Cor do retângulo
    Color corRetangulo = Color.BLACK;
    
    //Nome do retângulo
    String nomeRetangulo = "";
    
    //Cor da label do nome do retângulo
    Color corNomeRetangulo  = Color.BLACK;
    
    //Espessura do retângulo
    int espRetangulo = 1;
    
    /**
     * RetanguloGr Construtor estrutural do retângulo a ser formado com todas
     * as suas características
     *
     * @param x1 Um parâmetro do tipo número inteiro que contém o primeiro ponto no plano cartesiano no eixo x
     * @param y1 Um parâmetro do tipo número inteiro que contém o primeiro ponto no plano cartesiano no eixo y
     * @param x2 Um parâmetro do tipo número inteiro que contém o segundo ponto no plano cartesiano no eixo x
     * @param y2 Um parâmetro do tipo número inteiro que contém o segundo ponto no plano cartesiano no eixo y
     * @param cor Um parâmetro do tipo cor que define qual será a cor do retângulo
     * @param nome Um parâmetro do tipo string que contém o nome do retângulo que será criado
     * @param esp Um parâmetro do tipo inteiro que contém a espessura em pixels do retângulo que será criado
     */
    public RetanguloGr(int x1, int y1, int x2, int y2, Color cor, String nome, int esp){
        super(x1, y1, x2, y2);
        
        setCorRetangulo(cor);
        setNomeRetangulo(nome);
        setEspRetangulo(esp);
    }
    
    /**
     * Define uma nova cor para o retângulo que será criado
     *
     * @param cor Color. Cor do retângulo.
     */
    public void setCorRetangulo(Color cor) {
        this.corRetangulo = cor;
    }

    /**
     * Define uma nova nome para o retângulo que será criado
     *
     * @param str String. Nome do retângulo.
     */
    public void setNomeRetangulo(String str) {
        this.nomeRetangulo = str;
    }

    /**
     * Define uma nova espessura para o retângulo que será criado
     *
     * @param esp int. Espessura do retângulo.
     */
    public void setEspRetangulo(int esp) {
        this.espRetangulo = esp;
    }
    
    /**
     * Define uma nova cor para nome do retângulo que será criado
     * 
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomeRetangulo(Color corNomeRetangulo) {
        this.corNomeRetangulo = corNomeRetangulo;
    }

    /**
     * Retorna a espessura do retângulo.
     *
     * @return int. Espessura do retângulo.
     */
    public int getEspRetangulo() {
        return(this.espRetangulo);
    }

    /**
     * Retorna a cor do retângulo.
     *
     * @return Color. Cor do retângulo.
     */
    public Color getCorRetangulo() {
        return corRetangulo;
    }

    /**
     * Retorna o nome do retângulo.
     *
     * @return String. Nome do retângulo.
     */
    public String getNomeRetangulo() {
        return nomeRetangulo;
    }

    /**
     * Retorna a cor que está o nome do retângulo que será craido
     * 
     * @return Color corNomeRetangulo. Cor do nome do retângulo
     */
    public Color getCorNomeRetangulo() {
        return corNomeRetangulo;
    }
    
    /**
     * Método desenharRetangulo é responsável por criar novas retas e desenhá-las
     * de acordo com os parâmetros de reta que forem dados a ela
     *
     * @param g Um parâmetro do tipo Graphics pertencente a uma biblioteca de
     * desenho que faz com que a texturização e renderização ocorram propriamente
     * de acordo com os valores que forem atribuídos a ela
     */
    public void desenharRetangulo(Graphics g){
        RetaGr reta;
        
        reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP1().getX(),(int)getP2().getY(), getCorRetangulo(), getNomeRetangulo(),getEspRetangulo());
        reta.verificarReta(g);
            
        reta = new RetaGr((int)getP2().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorRetangulo(), getNomeRetangulo(),getEspRetangulo());
        reta.verificarReta(g);
        
        reta = new RetaGr((int)getP1().getX(),(int)getP1().getY(),(int)getP2().getX(),(int)getP1().getY(), getCorRetangulo(), getNomeRetangulo(),getEspRetangulo());
        reta.verificarReta(g);
        
        reta = new RetaGr((int)getP1().getX(),(int)getP2().getY(),(int)getP2().getX(),(int)getP2().getY(), getCorRetangulo(), getNomeRetangulo(),getEspRetangulo());
        reta.verificarReta(g);
    }
}