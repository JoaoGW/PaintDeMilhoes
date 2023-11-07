package arquivo;

import java.io.*;
import java.awt.Color;

/**
 * Essa classe permite que voc� salve e leia o conte�do de um arquivo.
 * 
 * @author Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
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