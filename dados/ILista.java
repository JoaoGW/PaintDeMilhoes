package dados;


/**
 * Escreva a descrição da interface ILista aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public interface ILista
{
    public void adicionarPontoLista(String tipo, double x, double y);
    public void adicionarRetaLista(String tipo, double x1, double y1, double x2, double y2);
    public void adicionarTrianguloLista(String tipo, double x1, double y1, double x2, double y2, double x3, double y3);
    public void limparLista();
    public void removerUltimoInserido();
    public int tamanhoLista();
    public String mostrarHistoricoLista();
}
