package dados;

import java.util.*;
import java.awt.Color;
import java.awt.Graphics;

import ponto.FiguraPontos;
import reta.FiguraRetas;
import triangulo.FiguraTriangulo;
import retangulo.FiguraRetangulo;
import circulo.FiguraCirculo;
import flor.FiguraFlor;

/**
 * A estrutura de dados possui todos os métodos que ajudarão na construção de dados
 * salvos e dados já existentes no momento do desenho
 *
 * @author Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
 */
public class ListaLigada implements ILista
{
    //Instancia uma nova lista ligada que conterá outras listas ligadas do tipo String
    LinkedList<Object> listaPrincipal = new LinkedList<Object>();

    public LinkedList<Object> getListaPrincipal(){
        return this.listaPrincipal;
    }

    /**
     * Método adicionarPontoLista
     *
     * Adiciona um novo ponto a lista 
     *
     * @param tipo Um parâmetro do tipo string que diz qual o tipo de elemento que foi criado. Ex.: Ponto, reta, triangulo, retangulo, etc
     * @param x Um parâmetro do tipo double que armazena qual o valor do ponto X
     * @param y Um parâmetro do tipo double que armazena qual o valor do ponto Y
     */
    public void adicionarPontoLista(String tipo, double x, double y, int esp, Color cor){
        Infos infos = new Infos();

        infos.setTipo(tipo);
        infos.setX1(x);
        infos.setY1(y);
        infos.setX2(0.0);
        infos.setY2(0.0);
        infos.setX3(0.0);
        infos.setY3(0.0);
        infos.setEspessura(esp);
        infos.setCor1(cor);
        infos.setCor2(null);

        listaPrincipal.add(infos.getTipo() + " , " + infos.getX1() + " , " + infos.getY1() + " , " + infos.getX2() + " , " + infos.getY2() + " , " + infos.getX3() + " , " + infos.getY3() + " , " + infos.getEspessura() + " , " + infos.getCor1() + " , " + infos.getCor2());
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
    public void adicionarRetaLista(String tipo, double x1, double y1, double x2, double y2, int esp, Color cor){
        Infos infos = new Infos();

        infos.setTipo(tipo);
        infos.setX1(x1);
        infos.setY1(y1);
        infos.setX2(x2);
        infos.setY2(y2);
        infos.setX3(0.0);
        infos.setY3(0.0);
        infos.setEspessura(esp);
        infos.setCor1(cor);
        infos.setCor2(null);

        listaPrincipal.add(infos.getTipo() + " , " + infos.getX1() + " , " + infos.getY1() + " , " + infos.getX2() + " , " + infos.getY2() + " , " + infos.getX3() + " , " + infos.getY3() + " , " + infos.getEspessura() + " , " + infos.getCor1() + " , " + infos.getCor2());
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
    public void adicionarTrianguloLista(String tipo, double x1, double y1, double x2, double y2, double x3, double y3, int esp, Color cor){
        Infos infos = new Infos();

        infos.setTipo(tipo);
        infos.setX1(x1);
        infos.setY1(y1);
        infos.setX2(x2);
        infos.setY2(y2);
        infos.setX3(x3);
        infos.setY3(y3);
        infos.setEspessura(esp);
        infos.setCor1(cor);
        infos.setCor2(null);

        listaPrincipal.add(infos.getTipo() + " , " + infos.getX1() + " , " + infos.getY1() + " , " + infos.getX2() + " , " + infos.getY2() + " , " + infos.getX3() + " , " + infos.getY3() + " , " + infos.getEspessura() + " , " + infos.getCor1() + " , " + infos.getCor2());
    }

    public void adicionarFlorLista(String tipo, double x1, double y1, double x2, double y2, int esp, Color cor1, Color cor2){
        Infos infos = new Infos();

        infos.setTipo(tipo);
        infos.setX1(x1);
        infos.setY1(y1);
        infos.setX2(x2);
        infos.setY2(y2);
        infos.setX3(0.0);
        infos.setY3(0.0);
        infos.setEspessura(esp);
        infos.setCor1(cor1);
        infos.setCor2(cor2);

        listaPrincipal.add(infos.getTipo() + " , " + infos.getX1() + " , " + infos.getY1() + " , " + infos.getX2() + " , " + infos.getY2() + " , " + infos.getX3() + " , " + infos.getY3() + " , " + infos.getEspessura() + " , " + infos.getCor1() + " , " + infos.getCor2());
    }

    /**
     * Método limparLista
     * Limpa por completo todos os elementos da lista principal
     */
    public void limparLista(){
        listaPrincipal.clear();
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

    /**
     * Método removerUltimo
     * Remove o ultimo elemento daquela lista
     *
     */
    public void removerUltimo(){
        int tamanho = listaPrincipal.size();

        if(tamanho != 0){
            listaPrincipal.removeLast();
        }
    }

    /**
     * Método refazerAcao
     * Esse método refaz as ações
     *
     */
    public void refazerAcao(Graphics g){
        String separador[];
        String parte;

        removerUltimo();

        for(int i = 1; i <= tamanhoLista(); i++){
            Object temp = listaPrincipal.get(i-1);

            parte = temp.toString();
            separador = parte.split(" , ", 2);

            //Pegar o object e ver qual o tipo dele. Para cada tipo fazer um desenho diferente respectivo a ele (tipo)
            if(separador[0].equals("PONTO")){
                separador = parte.split(" , ", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]) * 950;
                double y1 = Double.parseDouble(separador[2]) * 600;
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1);
                int y1f = (int)Math.round(y1);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenha ponto
                FiguraPontos.desenharPonto(g, x1f, y1f, "", espessura, corPreservada);

            }if(separador[0].equals("RETA")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]) * 950;
                double y1 = Double.parseDouble(separador[2]) * 600;
                double x2 = Double.parseDouble(separador[3]) * 950;
                double y2 = Double.parseDouble(separador[4]) * 600;
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1);
                int y1f = (int)Math.round(y1);
                int x2f = (int)Math.round(x2);
                int y2f = (int)Math.round(y2);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar reta
                FiguraRetas.desenharReta(g, x1f, y1f, x2f, y2f, "", espessura, corPreservada);
            }if(separador[0].equals("TRIANGULO")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[5] = separador[5].trim();
                separador[6] = separador[6].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]) * 950;
                double y1 = Double.parseDouble(separador[2]) * 600;
                double x2 = Double.parseDouble(separador[3]) * 950;
                double y2 = Double.parseDouble(separador[4]) * 600;
                double x3 = Double.parseDouble(separador[5]) * 950;
                double y3 = Double.parseDouble(separador[6]) * 600;
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1);
                int y1f = (int)Math.round(y1);
                int x2f = (int)Math.round(x2);
                int y2f = (int)Math.round(y2);
                int x3f = (int)Math.round(x3);
                int y3f = (int)Math.round(y3);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar triangulo
                FiguraTriangulo.desenharTriangulo(g, x1f, y1f, x2f, y2f, x3f, y3f, "", espessura, corPreservada);
            }if(separador[0].equals("RETANGULO")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]) * 950;
                double y1 = Double.parseDouble(separador[2]) * 600;
                double x2 = Double.parseDouble(separador[3]) * 950;
                double y2 = Double.parseDouble(separador[4]) * 600;
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1);
                int y1f = (int)Math.round(y1);
                int x2f = (int)Math.round(x2);
                int y2f = (int)Math.round(y2);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar retangulo
                FiguraRetangulo.desenharRetangulo(g, x1f, y1f, x2f, y2f, "", espessura, corPreservada);
            }if(separador[0].equals("CIRCULO")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]) * 950;
                double y1 = Double.parseDouble(separador[2]) * 600;
                double x2 = Double.parseDouble(separador[3]) * 950;
                double y2 = Double.parseDouble(separador[4]) * 600;
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1);
                int y1f = (int)Math.round(y1);
                int x2f = (int)Math.round(x2);
                int y2f = (int)Math.round(y2);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar circulo
                FiguraCirculo.desenharCirculo(g, x1f, y1f, x2f, y2f, "", espessura, corPreservada);
            }if(separador[0].equals("FLOR")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]) * 950;
                double y1 = Double.parseDouble(separador[2]) * 600;
                double x2 = Double.parseDouble(separador[3]) * 950;
                double y2 = Double.parseDouble(separador[4]) * 600;
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para numeros inteiros tratados
                int x1f = (int)Math.round(x1);
                int y1f = (int)Math.round(y1);
                int x2f = (int)Math.round(x2);
                int y2f = (int)Math.round(y2);

                //Fazendo o sistema de leitura de cores 1
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                //Fazendo o sistema de leitura de cores 2
                String corTexto2 = separador[8];
                corTexto2 = corTexto2.trim();
                corTexto2 = corTexto2.replace("java.awt.Color[", "");
                corTexto2 = corTexto2.replace("]", "");
                corTexto2 = corTexto2.replace("r=", "");
                corTexto2 = corTexto2.replace("g=", "");
                corTexto2 = corTexto2.replace("b=", "");
                String valoresCor2[];
                valoresCor2 = corTexto2.split(",");
                valoresCor2[0] = valoresCor2[0].trim();
                valoresCor2[1] = valoresCor2[1].trim();
                valoresCor2[2] = valoresCor2[2].trim();
                String red2 = valoresCor2[0];
                String green2 = valoresCor2[1];
                String blue2 = valoresCor2[2];
                int couleurRouge2 = Integer.parseInt(red2);
                int couleurVert2 = Integer.parseInt(green2);
                int couleurBleu2 = Integer.parseInt(blue2);


                Color corPreservada1 = new Color(couleurRouge, couleurVert, couleurBleu);
                Color corPreservada2 = new Color(couleurRouge2, couleurVert2, couleurBleu2);

                //Desenhar flor
                FiguraFlor.desenharFlor(g, x1f, y1f, x2f, y2f, "", corPreservada1, corPreservada2, espessura);

            }
        }
    }

    public void repintar(Graphics g){
        String separador[];
        String parte;
        for(int i = 1; i <= tamanhoLista(); i++){
            Object temp = listaPrincipal.get(i-1);

            parte = temp.toString();
            separador = parte.split(" , ", 2);

            //Pegar o object e ver qual o tipo dele. Para cada tipo fazer um desenho diferente respectivo a ele (tipo)
            if(separador[0].equals("PONTO")){
                separador = parte.split(" , ", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]);
                double y1 = Double.parseDouble(separador[2]);
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1*950);
                int y1f = (int)Math.round(y1*600);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenha ponto
                FiguraPontos.desenharPonto(g, x1f, y1f, "", espessura, corPreservada);
            }if(separador[0].equals("RETA")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]);
                double y1 = Double.parseDouble(separador[2]);
                double x2 = Double.parseDouble(separador[3]);
                double y2 = Double.parseDouble(separador[4]);
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1*950);
                int y1f = (int)Math.round(y1*600);
                int x2f = (int)Math.round(x2*950);
                int y2f = (int)Math.round(y2*600);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar reta
                FiguraRetas.desenharReta(g, x1f, y1f, x2f, y2f, "", espessura, corPreservada);
            }if(separador[0].equals("TRIANGULO")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[5] = separador[5].trim();
                separador[6] = separador[6].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]);
                double y1 = Double.parseDouble(separador[2]);
                double x2 = Double.parseDouble(separador[3]);
                double y2 = Double.parseDouble(separador[4]);
                double x3 = Double.parseDouble(separador[5]);
                double y3 = Double.parseDouble(separador[6]);
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1*950);
                int y1f = (int)Math.round(y1*600);
                int x2f = (int)Math.round(x2*950);
                int y2f = (int)Math.round(y2*600);
                int x3f = (int)Math.round(x3*950);
                int y3f = (int)Math.round(y3*600);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar triangulo
                FiguraTriangulo.desenharTriangulo(g, x1f, y1f, x2f, y2f, x3f, y3f, "", espessura, corPreservada);
            }if(separador[0].equals("RETANGULO")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]);
                double y1 = Double.parseDouble(separador[2]);
                double x2 = Double.parseDouble(separador[3]);
                double y2 = Double.parseDouble(separador[4]);
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1*950);
                int y1f = (int)Math.round(y1*600);
                int x2f = (int)Math.round(x2*950);
                int y2f = (int)Math.round(y2*600);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar retangulo
                FiguraRetangulo.desenharRetangulo(g, x1f, y1f, x2f, y2f, "", espessura, corPreservada);
            }if(separador[0].equals("CIRCULO")){
                separador = parte.split(",", 9);

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]);
                double y1 = Double.parseDouble(separador[2]);
                double x2 = Double.parseDouble(separador[3]);
                double y2 = Double.parseDouble(separador[4]);
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1*950);
                int y1f = (int)Math.round(y1*600);
                int x2f = (int)Math.round(x2*950);
                int y2f = (int)Math.round(y2*600);

                //Fazendo o sistema de leitura de cores
                String corTexto = separador[8];
                corTexto = corTexto.trim();
                corTexto = corTexto.replace("java.awt.Color[", "");
                corTexto = corTexto.replace("]", "");
                corTexto = corTexto.replace("r=", "");
                corTexto = corTexto.replace("g=", "");
                corTexto = corTexto.replace("b=", "");
                String valoresCor[];
                valoresCor = corTexto.split(",");
                valoresCor[0] = valoresCor[0].trim();
                valoresCor[1] = valoresCor[1].trim();
                valoresCor[2] = valoresCor[2].trim();
                String red = valoresCor[0];
                String green = valoresCor[1];
                String blue = valoresCor[2];
                int couleurRouge = Integer.parseInt(red);
                int couleurVert = Integer.parseInt(green);
                int couleurBleu = Integer.parseInt(blue);

                Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

                //Desenhar circulo
                FiguraCirculo.desenharCirculo(g, x1f, y1f, x2f, y2f, "", espessura, corPreservada);
            }if(separador[0].equals("FLOR")){
                separador = parte.split(",");

                //Valores numericos das coordenadas e valores das caracter?sticas
                separador[1] = separador[1].trim();
                separador[2] = separador[2].trim();
                separador[3] = separador[3].trim();
                separador[4] = separador[4].trim();
                separador[7] = separador[7].trim();

                //Convertendo os valores do Objeto em string para double
                double x1 = Double.parseDouble(separador[1]);
                double y1 = Double.parseDouble(separador[2]);
                double x2 = Double.parseDouble(separador[3]);
                double y2 = Double.parseDouble(separador[4]);
                int espessura = Integer.parseInt(separador[7]);

                //Arredondando os valores de Double para n?meros inteiros tratados
                int x1f = (int)Math.round(x1*950);
                int y1f = (int)Math.round(y1*600);
                int x2f = (int)Math.round(x2*950);
                int y2f = (int)Math.round(y2*600);

                //Fazendo o sistema de leitura de cores
                int r1 = Integer.parseInt(separador[8].trim().replace("java.awt.Color[r=",""));
                int g1 = Integer.parseInt(separador[9].trim().replace("g=",""));
                int b1 = Integer.parseInt(separador[10].trim().replace("b=","").replace("]",""));
                int r2 = Integer.parseInt(separador[11].trim().replace("java.awt.Color[r=",""));
                int g2 = Integer.parseInt(separador[12].trim().replace("g=",""));
                int b2 = Integer.parseInt(separador[13].trim().replace("b=","").replace("]",""));

                Color corPreservada1 = new Color(r1, g1, b1);
                Color corPreservada2 = new Color(r2, g2, b2);

                //Desenhar flor
                FiguraFlor.desenharFlor(g, x1f, y1f, x2f, y2f, "", corPreservada1, corPreservada2, espessura);

            }
        }

    }
    public String getTipo(int i){
        Object temp = listaPrincipal.get(i);
        String[] separador;
        String elemento = temp.toString();
        separador = elemento.split(" , ", 2);
        return separador[0];
    }
    public void remover(int i){
        listaPrincipal.remove(i);
    }
    public Object getElemento(int i){return listaPrincipal.get(i);}
}