package pincel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Contem metodos para desenhar figuras com ponto
 * 
 * @author Julio Arakaki
 * @version 20220815
 */
public class FiguraPinceis {
/**
     * Desenha uma reta de acordo com os pontos p1 e p2
     *
     * @param g biblioteca para desenhar o primitivo grafico
     * @param x1 coordenada x de p1
     * @param y1 coordenada y de p1
     * @param x2 coordenada x de p2
     * @param y2 coordenada y de p2
     * @param nome nome da reta
     * @param esp espessura da reta
     * @param cor cor da reta
     */
    public static void desenharPincel(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor){
        PincelGr r = new PincelGr(x1, y1, x2, y2, cor, nome, esp);
        r.verificarPincel(g );
        System.out.println("RODA");
    }
    
    /**
     * Desenha varias retas na area de desenho
     *
     * @param g biblioteca grafica para desenhar os primitivos
     * @param qtde quantidade de retas
     * @param esp espessura das retas
     */
    public static void desenharPincel(Graphics g, int qtde, int esp){
        for(int i=0; i < qtde; i++) {
            int x1 = (int) (Math.random() * 801);
            int y1 = (int) (Math.random() * 801);
            int x2 = (int) (Math.random() * 801);
            int y2 = (int) (Math.random() * 801);

            // Cor (R, G e   B) aleatorio
            Color cor = new Color((int) (Math.random() * 256),  
                    (int) (Math.random() * 256),  
                    (int) (Math.random() * 256));
            PincelGr r = new PincelGr(x1, y1, x2, y2, cor, "", esp);
            r.verificarPincel(g);
        }
    }
}
