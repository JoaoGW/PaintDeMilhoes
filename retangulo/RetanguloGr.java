package retangulo;

import java.awt.Color;
import java.awt.Graphics;

import reta.RetaGr;
import ponto.PontoGr;

/**
 * Possui os m�todos de captura de retorno de um valor e defini��o de um novo
 * valor (gets e sets), todos estes ser�o referentes apenas a classe principal
 * do ret�ngulo
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023)
 */
public class RetanguloGr extends Retangulo
{
    //Cor do ret�ngulo
    Color corRetangulo = Color.BLACK;
    
    //Nome do ret�ngulo
    String nomeRetangulo = "";
    
    //Cor da label do nome do ret�ngulo
    Color corNomeRetangulo  = Color.BLACK;
    
    //Espessura do ret�ngulo
    int espRetangulo = 1;
    
    /**
     * RetanguloGr Construtor estrutural do ret�ngulo a ser formado com todas
     * as suas caracter�sticas
     *
     * @param x1 Um par�metro do tipo n�mero inteiro que cont�m o primeiro ponto no plano cartesiano no eixo x
     * @param y1 Um par�metro do tipo n�mero inteiro que cont�m o primeiro ponto no plano cartesiano no eixo y
     * @param x2 Um par�metro do tipo n�mero inteiro que cont�m o segundo ponto no plano cartesiano no eixo x
     * @param y2 Um par�metro do tipo n�mero inteiro que cont�m o segundo ponto no plano cartesiano no eixo y
     * @param cor Um par�metro do tipo cor que define qual ser� a cor do ret�ngulo
     * @param nome Um par�metro do tipo string que cont�m o nome do ret�ngulo que ser� criado
     * @param esp Um par�metro do tipo inteiro que cont�m a espessura em pixels do ret�ngulo que ser� criado
     */
    public RetanguloGr(int x1, int y1, int x2, int y2, Color cor, String nome, int esp){
        super(x1, y1, x2, y2);
        
        setCorRetangulo(cor);
        setNomeRetangulo(nome);
        setEspRetangulo(esp);
    }
    
    /**
     * Define uma nova cor para o ret�ngulo que ser� criado
     *
     * @param cor Color. Cor do ret�ngulo.
     */
    public void setCorRetangulo(Color cor) {
        this.corRetangulo = cor;
    }

    /**
     * Define uma nova nome para o ret�ngulo que ser� criado
     *
     * @param str String. Nome do ret�ngulo.
     */
    public void setNomeRetangulo(String str) {
        this.nomeRetangulo = str;
    }

    /**
     * Define uma nova espessura para o ret�ngulo que ser� criado
     *
     * @param esp int. Espessura do ret�ngulo.
     */
    public void setEspRetangulo(int esp) {
        this.espRetangulo = esp;
    }
    
    /**
     * Define uma nova cor para nome do ret�ngulo que ser� criado
     * 
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomeRetangulo(Color corNomeRetangulo) {
        this.corNomeRetangulo = corNomeRetangulo;
    }

    /**
     * Retorna a espessura do ret�ngulo.
     *
     * @return int. Espessura do ret�ngulo.
     */
    public int getEspRetangulo() {
        return(this.espRetangulo);
    }

    /**
     * Retorna a cor do ret�ngulo.
     *
     * @return Color. Cor do ret�ngulo.
     */
    public Color getCorRetangulo() {
        return corRetangulo;
    }

    /**
     * Retorna o nome do ret�ngulo.
     *
     * @return String. Nome do ret�ngulo.
     */
    public String getNomeRetangulo() {
        return nomeRetangulo;
    }

    /**
     * Retorna a cor que est� o nome do ret�ngulo que ser� craido
     * 
     * @return Color corNomeRetangulo. Cor do nome do ret�ngulo
     */
    public Color getCorNomeRetangulo() {
        return corNomeRetangulo;
    }
    
    /**
     * M�todo desenharRetangulo � respons�vel por criar novas retas e desenh�-las
     * de acordo com os par�metros de reta que forem dados a ela
     *
     * @param g Um par�metro do tipo Graphics pertencente a uma biblioteca de
     * desenho que faz com que a texturiza��o e renderiza��o ocorram propriamente
     * de acordo com os valores que forem atribu�dos a ela
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