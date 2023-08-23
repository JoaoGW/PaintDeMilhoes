package arquivo;

import java.io.*;
import java.awt.Color;

/**
 * Escreva uma descri��o da classe fileManager aqui.
 * 
 * @author Pedro Marques Prado, Giovana Akemi, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro 
 * @version 1.0 14/08/2023
 */
public class FileManager implements IFile
{
    final String fileName = "lastmodification.txt";
    
    //Permite que voc� insira um novo conte�do para aquele arquivo
    public void escrevaArquivo(String drawContent){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        
            writer.append(drawContent);
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    
    //Permite que voc� leia cada linha daquele arquivo
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