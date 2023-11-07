package ponto;

/**
 * Write a description of class TestaPonto here.
 *
 * @author Lucas Kenji Hayashi, João Pedro do Carmo Ribeiro, Giovana Akemi Maeda Mathias, Pedro Marques Prado
 * @version 1.4 14/09/2023
 */
public class TestaPonto{
    public static void main(String args[]) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(1, 1);
        Ponto p3 = new Ponto(2.0, 2.0);
        Ponto p4 = new Ponto(p3);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
        System.out.println("p4 = " + p4);
        System.out.println("distancia entre p2 e p3 = " + p2.calcularDistancia(p3));
    }
}
