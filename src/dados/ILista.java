package dados;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
 */

public interface ILista
{
    public void adicionarPontoLista(String tipo, double x, double y, int esp, Color cor);
    public void adicionarRetaLista(String tipo, double x1, double y1, double x2, double y2, int esp, Color cor);
    public void adicionarTrianguloLista(String tipo, double x1, double y1, double x2, double y2, double x3, double y3, int esp, Color cor);
    public void limparLista();
    public int tamanhoLista();
    public String mostrarHistoricoLista();
    public void removerUltimo();
    public void refazerAcao(Graphics g);
    public String getTipo(int i);
    public void remover(int i);
    public Object getElemento(int i);
}