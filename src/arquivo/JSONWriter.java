package arquivo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONException;
import dados.ListaLigada;
import dados.Infos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.awt.Component;

public class JSONWriter {

    ListaLigada listaLig;
    public JSONWriter(ListaLigada listaLigada){
        setObj(listaLigada);
    }

    void setObj(ListaLigada obj){
        this.listaLig = obj;
    }

    public void escrever(){

        // Pega a linked list
        LinkedList<Object> listaLinked = listaLig.getListaPrincipal();

        // Cria os Objects e Arrays do JSON
        JSONObject root = new JSONObject();
        JSONObject desenho = new JSONObject();
        JSONArray tipoArPonto = new JSONArray();
        JSONArray tipoArReta = new JSONArray();
        JSONArray tipoArTriangulo = new JSONArray();
        JSONArray tipoArRetangulo = new JSONArray();
        JSONArray tipoArCirculo = new JSONArray();
        JSONArray tipoArMandala = new JSONArray();

        // Le a linked list elemento por elemento
        for (int i=1; i <= listaLinked.size(); i++){
            // pega o 1o elemento da string (o nome do tipo)
            String[] tipoObj = listaLinked.get(i-1).toString().split(" , ",10);
            tipoObj[0] = tipoObj[0].trim();
            System.out.println(listaLinked.get(i-1));

            // ESCREVE PONTOS
            if (tipoObj[0].equals("PONTO")) {
                JSONObject tipo = new JSONObject();

                // ID e ESP
                tipo.put("id", "ponto_" + i);
                tipo.put("esp", tipoObj[7]);

                // PONTOS
                tipo.put("x", tipoObj[1]);
                tipo.put("y", tipoObj[2]);

                // CORES
                JSONObject cor = new JSONObject();
                String corTexto = tipoObj[8];
                corTexto = corTexto.trim();
                inserirObjCor(corTexto, cor);
                tipo.put("cor", cor);

                // BOTA NO ARRAY
                tipoArPonto.put(tipo);
            }
            // ESCREVE RETAS
            else if (tipoObj[0].equals("RETA")){
                JSONObject tipo = new JSONObject();

                // ID e ESP
                tipo.put("id","reta_"+i);
                tipo.put("esp",tipoObj[7]);

                // PONTOS
                JSONObject p1 = new JSONObject();
                p1.put("x",tipoObj[1]);
                p1.put("y",tipoObj[2]);
                JSONObject p2 = new JSONObject();
                p2.put("x",tipoObj[3]);
                p2.put("y",tipoObj[4]);
                tipo.put("p1",p1);
                tipo.put("p2",p2);

                // CORES
                JSONObject cor = new JSONObject();
                String corTexto = tipoObj[8];
                corTexto = corTexto.trim();
                inserirObjCor(corTexto, cor);
                tipo.put("cor",cor);

                // BOTA NO ARRAY
                tipoArReta.put(tipo);
            }
            // ESCREVE TRIANGULOS
            else if (tipoObj[0].equals("TRIANGULO")){
                JSONObject tipo = new JSONObject();

                // ID e ESP
                tipo.put("id","triang_"+i);
                tipo.put("esp",tipoObj[7]);

                // PONTOS
                JSONObject p1 = new JSONObject();
                p1.put("x",tipoObj[1]);
                p1.put("y",tipoObj[2]);
                JSONObject p2 = new JSONObject();
                p2.put("x",tipoObj[3]);
                p2.put("y",tipoObj[4]);
                JSONObject p3 = new JSONObject();
                p3.put("x",tipoObj[5]);
                p3.put("y",tipoObj[6]);
                tipo.put("p1",p1);
                tipo.put("p2",p2);
                tipo.put("p3",p3);

                // CORES
                JSONObject cor = new JSONObject();
                String corTexto = tipoObj[8];
                corTexto = corTexto.trim();
                inserirObjCor(corTexto, cor);
                tipo.put("cor",cor);

                // BOTA NO ARRAY
                tipoArTriangulo.put(tipo);
            }
            // ESCREVE RETANGULOS
            else if (tipoObj[0].equals("RETANGULO")){
                JSONObject tipo = new JSONObject();

                // ID e ESP
                tipo.put("id","retang_"+i);
                tipo.put("esp",tipoObj[7]);

                // PONTOS
                JSONObject p1 = new JSONObject();
                p1.put("x",tipoObj[1]);
                p1.put("y",tipoObj[2]);
                JSONObject p2 = new JSONObject();
                p2.put("x",tipoObj[3]);
                p2.put("y",tipoObj[4]);
                tipo.put("p1",p1);
                tipo.put("p2",p2);

                // CORES
                JSONObject cor = new JSONObject();
                String corTexto = tipoObj[8];
                corTexto = corTexto.trim();
                inserirObjCor(corTexto, cor);
                tipo.put("cor",cor);

                // BOTA NO ARRAY
                tipoArRetangulo.put(tipo);
            }
            // ESCREVE CIRCULOS
            else if (tipoObj[0].equals("CIRCULO")){
                JSONObject tipo = new JSONObject();

                // ID e ESP
                tipo.put("id","circ_"+i);
                tipo.put("esp",tipoObj[7]);

                // CENTRO
                JSONObject centro = new JSONObject();
                centro.put("x",tipoObj[1]);
                centro.put("y",tipoObj[2]);
                tipo.put("centro",centro);

                // RAIO
                double raioX = Double.parseDouble(tipoObj[3]) - Double.parseDouble(tipoObj[1]);
                double raioY = Double.parseDouble(tipoObj[4]) - Double.parseDouble(tipoObj[2]);
                double raio = Math.sqrt(Math.pow(raioX, 2) + Math.pow(raioY, 2));
                tipo.put("raio",raio);

                // CORES
                JSONObject cor = new JSONObject();
                String corTexto = tipoObj[8];
                corTexto = corTexto.trim();
                inserirObjCor(corTexto, cor);
                tipo.put("cor",cor);

                // BOTA NO ARRAY
                tipoArCirculo.put(tipo);
            }
            // ESCREVE FLORES
            else if (tipoObj[0].equals("FLOR")){
                JSONObject tipo = new JSONObject();
                //String[] tipoObjFlorTemp = listaLinked.get(i-1).toString().split(" , ",10);

                // ID e ESP
                tipo.put("id","mand_"+i);
                tipo.put("esp",tipoObj[7]);

                // PONTOS
                JSONObject p1 = new JSONObject();
                p1.put("x",tipoObj[1]);
                p1.put("y",tipoObj[2]);
                JSONObject p2 = new JSONObject();
                p2.put("x",tipoObj[3]);
                p2.put("y",tipoObj[4]);
                tipo.put("p1",p1);
                tipo.put("p2",p2);

                // CORES
                JSONObject cor1 = new JSONObject();
                JSONObject cor2 = new JSONObject();
                String corTexto1 = tipoObj[8];;
                String corTexto2 = tipoObj[9];
                corTexto1 = corTexto1.trim();
                corTexto2 = corTexto2.trim();
                inserirObjCor(corTexto1, cor1);
                inserirObjCor(corTexto2, cor2);
                tipo.put("cor1",cor1);
                tipo.put("cor2",cor2);

                // BOTA NO ARRAY
                tipoArMandala.put(tipo);
            }

        }

        desenho.put("ponto",tipoArPonto);
        desenho.put("reta",tipoArReta);
        desenho.put("triangulo",tipoArTriangulo);
        desenho.put("retangulo",tipoArRetangulo);
        desenho.put("circulo",tipoArCirculo);
        desenho.put("mandala",tipoArMandala);
        root.put("desenho", desenho);

        // ESCREVE o arquivo json
        try(FileWriter writer2 = new FileWriter("ArquivoJSON.json");){
            writer2.write(root.toString());
            writer2.flush();

        }catch(Exception e){
            System.out.println("Erro ao salvar arquivo JSON");
        }

    }

    public void inserirObjCor(String corTexto, JSONObject cor){
        corTexto = corTexto.replace("java.awt.Color[", "");
        corTexto = corTexto.replace("]", "");
        corTexto = corTexto.replace("r=", "");
        corTexto = corTexto.replace("g=", "");
        corTexto = corTexto.replace("b=", "");
        String valoresCor[];
        valoresCor = corTexto.split(",");
        String red = valoresCor[0].trim();
        String green = valoresCor[1].trim();
        String blue = valoresCor[2].trim();
        int couleurRouge = Integer.parseInt(red);
        int couleurVert = Integer.parseInt(green);
        int couleurBleu = Integer.parseInt(blue);
        cor.put("r",couleurRouge);
        cor.put("g",couleurVert);
        cor.put("b",couleurBleu);
    }

    public void limpar(){
        JSONObject limpo = new JSONObject();
        try(FileWriter file = new FileWriter("ArquivoJSON.json")){

            file.write(limpo.toString());
            file.flush();

        }catch(Exception e){
            System.out.println("Erro ao salvar arquivo JSON");
        }
    }

}