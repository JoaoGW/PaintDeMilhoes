package dados;

import java.util.*;

/**
 * A estrutura de dados possui todos os métodos que ajudarão na construção de dados
 * salvos e dados já existentes no momento do desenho
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class ListaLigada implements ILista
{
    //Instancia uma nova lista ligada que conterá outras listas ligadas do tipo String
    LinkedList<LinkedList<String>> listaPrincipal = new LinkedList<LinkedList<String>>();
    
    /**
     * Método adicionarPontoLista
     * 
     * Adiciona um novo ponto a lista 
     *
     * @param tipo Um parâmetro do tipo string que diz qual o tipo de elemento que foi criado. Ex.: Ponto, reta, triangulo, retangulo, etc
     * @param x Um parâmetro do tipo double que armazena qual o valor do ponto X
     * @param y Um parâmetro do tipo double que armazena qual o valor do ponto Y
     */
    public void adicionarPontoLista(String tipo, double x, double y){
        //Instancia uma nova lista ligada a ser adicionada
        LinkedList<String> novaLista = new LinkedList<String>();
        
        //Transforma os pontos x e y em tipo string para adicionar a lista
        String pontoX = Double.toString(x);
        String pontoY = Double.toString(y);
        
        //Adiciona os valores a lista
        novaLista.add(pontoY);
        novaLista.add(pontoX);
        novaLista.add(tipo);
        
        //Adiciona a lista nova sempre no início da lista principal
        listaPrincipal.addFirst(novaLista);
    }
    
    /**
     * Método adicionarRetaLista
     * 
     * Adiciona uma nova reta a lista 
     *
     * @param tipo Um parâmetro do tipo string que diz qual o tipo de elemento que foi criado. Ex.: Ponto, reta, triangulo, retangulo, etc
     * @param x1 Um parâmetro do tipo double que armazena qual o valor do ponto X1
     * @param y1 Um parâmetro do tipo double que armazena qual o valor do ponto Y1
     * @param x2 Um parâmetro do tipo double que armazena qual o valor do ponto X2
     * @param y2 Um parâmetro do tipo double que armazena qual o valor do ponto Y2
     */
    public void adicionarRetaLista(String tipo, double x1, double y1, double x2, double y2){
        //Instancia uma nova lista ligada a ser adicionada
        LinkedList<String> novaLista = new LinkedList<String>();
        
        //Transforma os pontos x e y em tipo string para adicionar a lista
        String pontoX1 = Double.toString(x1);
        String pontoY1 = Double.toString(y1);
        String pontoX2 = Double.toString(x2);
        String pontoY2 = Double.toString(y2);
        
        //Adiciona os valores a lista
        novaLista.add(pontoY1);
        novaLista.add(pontoX1);
        novaLista.add(pontoY2);
        novaLista.add(pontoX2);
        novaLista.add(tipo);
        
        //Adiciona a lista nova sempre no início da lista principal
        listaPrincipal.addFirst(novaLista);
    }
    
    /**
     * Método adicionarTrianguloLista
     * 
     * Adiciona um novo triangulo a lista 
     *
     * @param tipo Um parâmetro do tipo string que diz qual o tipo de elemento que foi criado. Ex.: Ponto, reta, triangulo, retangulo, etc
     * @param x1 Um parâmetro do tipo double que armazena qual o valor do ponto X1
     * @param y1 Um parâmetro do tipo double que armazena qual o valor do ponto Y1
     * @param x2 Um parâmetro do tipo double que armazena qual o valor do ponto X2
     * @param y2 Um parâmetro do tipo double que armazena qual o valor do ponto Y2
     * @param x3 Um parâmetro do tipo double que armazena qual o valor do ponto X3
     * @param y3 Um parâmetro do tipo double que armazena qual o valor do ponto Y3
     */
    public void adicionarTrianguloLista(String tipo, double x1, double y1, double x2, double y2, double x3, double y3){
        //Instancia uma nova lista ligada a ser adicionada
        LinkedList<String> novaLista = new LinkedList<String>();
        
        //Transforma os pontos x e y em tipo string para adicionar a lista
        String pontoX1 = Double.toString(x1);
        String pontoY1 = Double.toString(y1);
        String pontoX2 = Double.toString(x2);
        String pontoY2 = Double.toString(y2);
        String pontoX3 = Double.toString(x3);
        String pontoY3 = Double.toString(y3);
        
        //Adiciona os valores a lista
        novaLista.add(pontoY1);
        novaLista.add(pontoX1);
        novaLista.add(pontoY2);
        novaLista.add(pontoX2);
        novaLista.add(pontoY3);
        novaLista.add(pontoX3);
        novaLista.add(tipo);
        
        //Adiciona a lista nova sempre no início da lista principal
        listaPrincipal.addFirst(novaLista);
    }
    
    /**
     * Método limparLista
     * Limpa por completo todos os elementos da lista principal
     */
    public void limparLista(){
        listaPrincipal.clear();
    }
    
    /**
     * Método removerUltimoInserido
     * Remove o último elemento que foi inserido na lista principal
     */
    public void removerUltimoInserido(){
        listaPrincipal.removeFirst();
    }
    
    /**
     * Método tamanhoLista
     * Devolve o tamanho total da lista principal
     *
     * @return O valor de retorno sera do tipo inteiro e conterá o tamanho total da lista principal
     */
    public int tamanhoLista(){
        int tamanho;
        
        tamanho = listaPrincipal.size();
        
        return tamanho;
    }
    
    /**
     * Método mostrarHistoricoLista
     * Mostra todos os elementos que foram adicionados a aquela lista
     *
     * @return O valor de retorno é do tipo string e contem todos os elementos em 
     * formato de texto
     */
    public String mostrarHistoricoLista(){
        int tamanho = listaPrincipal.size();
        String historicoLista = "";
        
        if(tamanho != 0){
            for(int i = 1; i <= tamanho; i++){
                historicoLista = historicoLista + listaPrincipal.get(i) + "\n";
            }
        }
        
        return historicoLista;
    }
}