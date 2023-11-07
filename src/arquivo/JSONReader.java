package arquivo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONException;
import dados.ListaLigada;
import dados.Infos;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class JSONReader {

    public JSONReader(){

    }


    public ListaLigada ler(){

        ListaLigada listaLig = new ListaLigada();

        try {

            // Ler o arquivo JSON
            FileReader reader = new FileReader("ArquivoJSON.json");

            // Criar um objeto JSON a partir do arquivo
            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));

            // Acessar a chave "desenho"
            JSONObject desenho = jsonObject.getJSONObject("desenho");

            // Acessar as chaves dentro de "desenho"
            if(!desenho.isNull("ponto")){
                JSONArray pontoArray = desenho.getJSONArray("ponto");
                // Processar os PONTOS
                for (int i = 0; i < pontoArray.length(); i++) {
                    JSONObject ponto = pontoArray.getJSONObject(i);
                    String id = ponto.getString("id");
                    int esp = ponto.getInt("esp");
                    double x = ponto.getDouble("x");
                    double y = ponto.getDouble("y");
                    // Acessar a chave "cor" para obter os valores de R, G e B
                    JSONObject cor = ponto.getJSONObject("cor");
                    int r = cor.getInt("r");
                    int g = cor.getInt("g");
                    int b = cor.getInt("b");
                    Color corClass = new Color(r,g,b);

                    // Mostrar os valores lidos
                    System.out.println("Ponto " + id + ": Espessura=" + esp + ", X=" + x + ", Y=" + y + ", Cor (R, G, B)=" + r + ", " + g + ", " + b);

                    // Adiciona o objeto a listaLig
                    listaLig.adicionarPontoLista("PONTO",x,y,esp,corClass);
                }
            }
            // Processar as RETAS
            if(!desenho.isNull("reta")){
                JSONArray retaArray = desenho.getJSONArray("reta");
                for (int i = 0; i < retaArray.length(); i++) {
                    JSONObject reta = retaArray.getJSONObject(i);
                    String id = reta.getString("id");
                    int esp = reta.getInt("esp");

                    // Acessar os pontos p1 e p2
                    JSONObject p1 = reta.getJSONObject("p1");
                    JSONObject p2 = reta.getJSONObject("p2");

                    double p1x = p1.getDouble("x");
                    double p1y = p1.getDouble("y");
                    double p2x = p2.getDouble("x");
                    double p2y = p2.getDouble("y");

                    // Acessar a chave "cor" para obter os valores de R, G e B
                    JSONObject cor = reta.getJSONObject("cor");
                    int r = cor.getInt("r");
                    int g = cor.getInt("g");
                    int b = cor.getInt("b");
                    Color corClass = new Color(r,g,b);

                    // Mostrar os valores lidos
                    System.out.println("Reta " + id + ": Espessura=" + esp);
                    System.out.println("Ponto 1 (X, Y): " + p1x + ", " + p1y);
                    System.out.println("Ponto 2 (X, Y): " + p2x + ", " + p2y);
                    System.out.println("Cor (R, G, B): " + r + ", " + g + ", " + b);

                    // Adiciona o objeto a listaLig
                    listaLig.adicionarRetaLista("RETA",p1x,p1y,p2x,p2y,esp,corClass);
                }
            }
            // Processar os CIRCULOS
            if(!desenho.isNull("circulo")){
                JSONArray circuloArray = desenho.getJSONArray("circulo");
                for (int i = 0; i < circuloArray.length(); i++) {
                    JSONObject circulo = circuloArray.getJSONObject(i);
                    String id = circulo.getString("id");
                    int esp = circulo.getInt("esp");

                    // Acessar informacoes do circulo
                    JSONObject centro = circulo.getJSONObject("centro");
                    double centroX = centro.getDouble("x");
                    double centroY = centro.getDouble("y");
                    double raio = circulo.getDouble("raio");

                    // Acessar a chave "cor" para obter os valores de R, G e B
                    JSONObject cor = circulo.getJSONObject("cor");
                    int r = cor.getInt("r");
                    int g = cor.getInt("g");
                    int b = cor.getInt("b");
                    Color corClass = new Color(r,g,b);

                    // Mostrar os valores lidos
                    System.out.println("Circulo " + id + ": Espessura=" + esp);
                    System.out.println("Centro (X, Y): " + centroX + ", " + centroY);
                    System.out.println("Raio: " + raio);
                    System.out.println("Cor (R, G, B): " + r + ", " + g + ", " + b);

                    // Adiciona o objeto a listaLig
                    listaLig.adicionarRetaLista("CIRCULO",centroX,centroY,raio+centroX,centroY,esp,corClass);
                }
            }
            // Processar os TRIANGULOS
            if(!desenho.isNull("triangulo")){
                JSONArray trianguloArray = desenho.getJSONArray("triangulo");
                for (int i = 0; i < trianguloArray.length(); i++) {
                    JSONObject triangulo = trianguloArray.getJSONObject(i);
                    String id = triangulo.getString("id");
                    int esp = triangulo.getInt("esp");

                    // Acessar informacoes dos tres pontos do triangulo
                    JSONObject p1 = triangulo.getJSONObject("p1");
                    JSONObject p2 = triangulo.getJSONObject("p2");
                    JSONObject p3 = triangulo.getJSONObject("p3");

                    double p1x = p1.getDouble("x");
                    double p1y = p1.getDouble("y");
                    double p2x = p2.getDouble("x");
                    double p2y = p2.getDouble("y");
                    double p3x = p3.getDouble("x");
                    double p3y = p3.getDouble("y");

                    // Acessar a chave "cor" para obter os valores de R, G e B
                    JSONObject cor = triangulo.getJSONObject("cor");
                    int r = cor.getInt("r");
                    int g = cor.getInt("g");
                    int b = cor.getInt("b");
                    Color corClass = new Color(r,g,b);

                    // Mostrar os valores lidos
                    System.out.println("Triangulo " + id + ": Espessura=" + esp);
                    System.out.println("Ponto 1 (X, Y): " + p1x + ", " + p1y);
                    System.out.println("Ponto 2 (X, Y): " + p2x + ", " + p2y);
                    System.out.println("Ponto 3 (X, Y): " + p3x + ", " + p3y);
                    System.out.println("Cor (R, G, B): " + r + ", " + g + ", " + b);

                    // Adiciona o objeto a listaLig
                    listaLig.adicionarTrianguloLista("TRIANGULO",p1x,p1y,p2x,p2y,p3x,p3y,esp,corClass);
                }
            }
            // Processar RETANGULOS
            if(!desenho.isNull("retangulo")){
                JSONArray retanguloArray = desenho.getJSONArray("retangulo");
                for (int i = 0; i < retanguloArray.length(); i++) {
                    JSONObject retangulo = retanguloArray.getJSONObject(i);
                    String id = retangulo.getString("id");
                    int esp = retangulo.getInt("esp");

                    // Acessar informacoes dos dois pontos do retangulo
                    JSONObject p1 = retangulo.getJSONObject("p1");
                    JSONObject p2 = retangulo.getJSONObject("p2");

                    double p1x = p1.getDouble("x");
                    double p1y = p1.getDouble("y");
                    double p2x = p2.getDouble("x");
                    double p2y = p2.getDouble("y");

                    // Acessar a chave "cor" para obter os valores de R, G e B
                    JSONObject cor = retangulo.getJSONObject("cor");
                    int r = cor.getInt("r");
                    int g = cor.getInt("g");
                    int b = cor.getInt("b");
                    Color corClass = new Color(r,g,b);

                    // Mostrar os valores lidos
                    System.out.println("Retangulo " + id + ": Espessura=" + esp);
                    System.out.println("Ponto 1 (X, Y): " + p1x + ", " + p1y);
                    System.out.println("Ponto 2 (X, Y): " + p2x + ", " + p2y);
                    System.out.println("Cor (R, G, B): " + r + ", " + g + ", " + b);

                    // Adiciona o objeto a listaLig
                    listaLig.adicionarRetaLista("RETANGULO",p1x,p1y,p2x,p2y,esp,corClass);
                }
            }
            // Processar MANDALAS
            if(!desenho.isNull("mandala")){
                JSONArray mandalaArray = desenho.getJSONArray("mandala");
                for (int i = 0; i < mandalaArray.length(); i++) {
                    JSONObject mandala = mandalaArray.getJSONObject(i);
                    String id = mandala.getString("id");
                    int esp = mandala.getInt("esp");

                    // Acessar informacoes dos pontos da mandala
                    JSONObject p1 = mandala.getJSONObject("p1");
                    JSONObject p2 = mandala.getJSONObject("p2");

                    double p1x = p1.getDouble("x");
                    double p1y = p1.getDouble("y");
                    double p2x = p2.getDouble("x");
                    double p2y = p2.getDouble("y");

                    // Acessar informacoes das cores da mandala
                    JSONObject cor1 = mandala.getJSONObject("cor1");
                    JSONObject cor2 = mandala.getJSONObject("cor2");

                    int r1 = cor1.getInt("r");
                    int g1 = cor1.getInt("g");
                    int b1 = cor1.getInt("b");
                    Color corClass1 = new Color(r1,g1,b1);

                    int r2 = cor2.getInt("r");
                    int g2 = cor2.getInt("g");
                    int b2 = cor2.getInt("b");
                    Color corClass2 = new Color(r2,g2,b2);

                    // Mostrar os valores lidos
                    System.out.println("Mandala " + id + ": Espessura=" + esp);
                    System.out.println("Ponto 1 (X, Y): " + p1x + ", " + p1y);
                    System.out.println("Ponto 2 (X, Y): " + p2x + ", " + p2y);
                    System.out.println("Cor 1 (R, G, B): " + r1 + ", " + g1 + ", " + b1);
                    System.out.println("Cor 2 (R, G, B): " + r2 + ", " + g2 + ", " + b2);

                    listaLig.adicionarFlorLista("FLOR",p1x,p1y,p2x,p2y,esp,corClass1,corClass2);
                }
            }

            // Feche o leitor
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Devolve objeto da lista ligada
        return listaLig;
    }
}