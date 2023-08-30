package arquivo;

import java.io.*;
import java.awt.Color;

/**
 * Escreva uma descrição da classe fileManager aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class FileManager implements IFile
{
    final String fileName = "lastmodification.txt";
    
    //Permite que você insira um novo conteúdo para aquele arquivo
    public void escrevaArquivo(String drawContent){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        
            writer.append(drawContent);
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    
    //Permite que você leia cada linha daquele arquivo
    public void leiaArquivo(){
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        
            String line;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}