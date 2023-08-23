package poligono;

import javax.swing.*;

/**
 * Escreva uma descri��o da classe PoligonoQtd aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class PoligonoQtd
{
    //Instancia uma nova janela
    JFrame frameQtd;
    JFrame frameErro;
    
    //Armazena a quantidade de lados sem tratamento
    String qtdLados;
    
    public int painelQuantidadePoligono(){
        //Armazena o valor de lados do poligono transformado em inteiro
        int qtdLadosTratado;
        
        frameQtd = new JFrame();
        
        qtdLados = JOptionPane.showInputDialog(frameQtd, "Quantidade de lados do pol�gono [5 - 9]");
        qtdLadosTratado = Integer.parseInt(qtdLados);
        
        return qtdLadosTratado;
    }
    
    public void painelNumeroInvalido(){
        frameErro = new JFrame();
        
        JOptionPane.showMessageDialog(frameErro,"O n�mero inserido � inv�lido","Erro",JOptionPane.ERROR_MESSAGE);
    }
}