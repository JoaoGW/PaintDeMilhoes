import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

import ponto.FiguraPontos;
import reta.FiguraRetas;
import retangulo.FiguraRetangulo;
import triangulo.FiguraTriangulo;
import pincel.FiguraPinceis;
import circulo.FiguraCirculo;

import arquivo.IFile;
import arquivo.FileManager;
import dados.ILista;
import dados.ListaLigada;
import dados.Refazer;

/**
 * Cria desenhos de acordo com o tipo e eventos do mouse
 * 
 * @author Julio Arakaki 
 * @version 20220815
 */
public class PainelDesenho extends JPanel implements MouseListener, MouseMotionListener {
    JLabel msg;           // Label para mensagens
    TipoPrimitivo tipo; // Tipo do primitivo
    Color corAtual;       // Cor atual do primitivo
    int esp;              // Diametro do ponto

    // Para ponto
    int x, y;

    // Para reta
    int x1, y1, x2, y2, x3, y3;

    // selecionar primeiro click do mouse
    boolean primeiraVez = true;
    boolean primeiraVezP = true;
    boolean primeiraVezB = true;
    boolean segundaVez = true;
    boolean terceiraVez = true;
    boolean quartaVez = true;
    boolean quintaVez = true;
    boolean sextaVez = true;
    boolean setimaVez = true;
    
    //Cor personalizada para a borracha
    Color corBorracha = new Color(238,238,238);

    //Instancia um novo componente de modificação de arquivo
    IFile fileM = new FileManager();

    //Instancia um novo componente de save dos desenhos
    ILista listaSave = new ListaLigada();

    //Instancia um novo componente de refacção de desenho
    Refazer refazer = new Refazer();

    /**
     * Constroi o painel de desenho
     *
     * @param msg mensagem a ser escrita no rodape do painel
     * @param tipo tipo atual do primitivo
     * @param corAtual cor atual do primitivo
     * @param esp espessura atual do primitivo
     */
    public PainelDesenho(JLabel msg, TipoPrimitivo tipo, Color corAtual, int esp){
        setTipo(tipo);
        setMsg(msg);
        setCorAtual(corAtual);
        setEsp(esp);

        // Adiciona "ouvidor" de eventos de mouse
        this.addMouseListener(this); 
        this.addMouseMotionListener(this);
    }

    /**
     * Altera o tipo atual do primitivo
     *
     * @param tipo tipo do primitivo
     */
    public void setTipo(TipoPrimitivo tipo){
        this.tipo = tipo;
    }

    /**
     * Retorna o tipo do primitivo
     *
     * @return tipo do primitivo
     */
    public TipoPrimitivo getTipo(){
        return this.tipo;
    }

    /**
     * Altera a espessura do primitivo
     *
     * @param esp espessura do primitivo
     */
    public void setEsp(int esp){
        this.esp = esp;
    }

    /**
     * Retorna a espessura do primitivo
     *
     * @return espessura do primitivo
     */
    public int getEsp(){
        return this.esp;
    }

    /**
     * Altera a cor atual do primitivo
     *
     * @param corAtual cor atual do primitivo
     */
    public void setCorAtual(Color corAtual){
        this.corAtual = corAtual;
    }

    /**
     * retorna a cor atual do primitivo
     *
     * @return cor atual do primitivo
     */
    public Color getCorAtual(){
        return this.corAtual;
    }

    /**
     * Altera a msg a ser apresentada no rodape
     *
     * @param msg mensagem a ser apresentada
     */
    public void setMsg(JLabel msg){
        this.msg = msg;
    }

    /**
     * Retorna a mensagem
     *
     * @return mensagem as ser apresentada no rodape
     */
    public JLabel getMsg(){
        return this.msg;
    }

    /**
     * Metodo chamado quando o paint eh acionado
     *
     * @param g biblioteca para desenhar em modo grafico
     */
    public void paintComponent(Graphics g) {   
        desenharPrimitivos(g);
    }

    /**
     * Evento: pressionar do mouse
     *
     * @param e dados do evento
     */
    public void mousePressed(MouseEvent e) { 
        Graphics g = getGraphics(); 

        if (tipo == TipoPrimitivo.PONTO){
            x = e.getX();
            y = e.getY();
            paint(g);
        } else if (tipo == TipoPrimitivo.RETA){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                paint(g);
            }
        }  else if (tipo == TipoPrimitivo.RETANGULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                paint(g);
            }
        }  else if (tipo == TipoPrimitivo.TRIANGULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else if(segundaVez == true){
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                segundaVez = false;
            } else if(primeiraVez == false && segundaVez == false){
                x3 = (int)e.getX();
                y3 = (int)e.getY();
                primeiraVez = true;
                segundaVez = true;
                paint(g);
            }
        } else if (tipo == TipoPrimitivo.CIRCULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                paint(g);
            }
        }
    }     

    public void mouseReleased(MouseEvent e) { 
        if (tipo == TipoPrimitivo.PINCEL){
            //System.out.println("MOUSE RELEASED");
            primeiraVezP = true;
        }
        else if (tipo == TipoPrimitivo.BORRACHA){
            //System.out.println("MOUSE RELEASED");
            primeiraVezB = true;
        }
    }           

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();

        if (tipo == TipoPrimitivo.PINCEL){
            if (primeiraVezP == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVezP = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                paint(g);
                
                x1 = x2;
                y1 = y2;
            }
        }
        else if (tipo == TipoPrimitivo.BORRACHA){
            if (primeiraVezB == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVezB = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                paint(g);
                
                x1 = x2;
                y1 = y2;
            }
        }
    }

    /**
     * Evento mouseMoved: escreve mensagem no rodape (x, y) do mouse
     *
     * @param e dados do evento do mouse
     */
    public void mouseMoved(MouseEvent e) {
        this.msg.setText("("+e.getX() + ", " + e.getY() + ") - " + getTipo());
    }

    /**
     * Desenha os primitivos
     *
     * @param g biblioteca para desenhar em modo grafico
     */
    public void desenharPrimitivos(Graphics g){
        //Caso a opção selecionada seja o ponto
        if (tipo == TipoPrimitivo.PONTO){
            FiguraPontos.desenharPonto(g, x, y, "", getEsp(), getCorAtual());

            //Salva o ponto que foi desenhado
            String pontoDesenhado = "PONTO: " + "x(" + x + "), y(" + y + "), " + "esp(" + getEsp() + "), " + "cor(" + getCorAtual() + ")" + " --> ";
            fileM.escrevaArquivo(pontoDesenhado);

            //Registra um novo elemento a lista ligada
            listaSave.adicionarPontoLista("PONTO", x, y, getEsp(), getCorAtual());
        }

        //Caso a opção selecionada seja a reta
        if (tipo == TipoPrimitivo.RETA){
            FiguraRetas.desenharReta(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());

            //Salva a reta que foi desenhada
            String pontoDesenhado = "RETA: " + "x1(" + x1 + "), y1(" + y1 + "), " + "x2(" + x2 + "), y2(" + y2 + "), " + "esp(" + getEsp() + "), " + "cor(" + getCorAtual() + ")" + " --> ";
            fileM.escrevaArquivo(pontoDesenhado);

            //Registra um novo elemento a lista ligada
            listaSave.adicionarRetaLista("RETA", x1, y1, x2, y2, getEsp(), getCorAtual());
        }

        //Caso a opção selecionada seja o retangulo
        if (tipo == TipoPrimitivo.RETANGULO){
            FiguraRetangulo.desenharRetangulo(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());

            //Salva o retângulo que foi desenhado
            String pontoDesenhado = "RETANGULO: " + "x1(" + x1 + "), y1(" + y1 + "), " + "x2(" + x2 + "), y2(" + y2 + "), " + "esp(" + getEsp() + "), " + "cor(" + getCorAtual() + ")" + " --> ";
            fileM.escrevaArquivo(pontoDesenhado);

            //Registra um novo elemento a lista ligada
            listaSave.adicionarRetaLista("RETANGULO", x1, y1, x2, y2, getEsp(), getCorAtual());
        }

        //Caso a opção selecionada seja o triangulo
        if (tipo == TipoPrimitivo.TRIANGULO){
            FiguraTriangulo.desenharTriangulo(g, x1, y1, x2, y2, x3, y3, "", getEsp(), getCorAtual());

            //Salva o triângulo que foi desenhado
            String pontoDesenhado = "TRIANGULO: " + "x1(" + x1 + "), y1(" + y1 + "), " + "x2(" + x2 + "), y2(" + y2 + "), " + "x3(" + x3 + "), y3(" + y3 + "), " + "esp(" + getEsp() + "), " + "cor(" + getCorAtual() + ")" + " --> ";
            fileM.escrevaArquivo(pontoDesenhado);

            //Registra um novo elemento a lista ligada
            listaSave.adicionarTrianguloLista("TRIANGULO", x1, y1, x2, y2, x3, y3, getEsp(), getCorAtual());
        }   

        //Caso a opção selecionada seja o circulo
        if (tipo == TipoPrimitivo.CIRCULO){
            FiguraCirculo.desenharCirculo(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());

            //Salva o circulo que foi desenhado
            String pontoDesenhado = "CIRCULO: " + "x1(" + x1 + "), y1(" + y1 + "), " + "x2(" + x2 + "), y2(" + y2 + "), " + "esp(" + getEsp() + "), " + "cor(" + getCorAtual() + ")" + " --> ";
            fileM.escrevaArquivo(pontoDesenhado);

            //Registra um novo elemento a lista ligada
            listaSave.adicionarRetaLista("CIRCULO", x1, y1, x2, y2, getEsp(), getCorAtual());
        }

        //Caso a opção selecionada seja o pincel
        if (tipo == TipoPrimitivo.PINCEL){
            FiguraPinceis.desenharPincel(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());
        }
        
        //Caso a opção selecionada seja a borracha
        if (tipo == TipoPrimitivo.BORRACHA){
            FiguraPinceis.desenharPincel(g, x1, y1, x2, y2, "", getEsp(), corBorracha);
        }

        //Caso a opção selecionada seja o refazer
        if (tipo == TipoPrimitivo.REFAZER){
            refazer.refazerAcao();
        }
    }
}