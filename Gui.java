import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * Cria a interface com o usuario (GUI)
 * 
 * @author Julio Arakaki 
 * @version 20220815
 */
class Gui extends JFrame {
    // Tipo Atual de primitivo
    private TipoPrimitivo tipoAtual = TipoPrimitivo.NENHUM;

    // Cor atual
    private Color corAtual = Color.BLACK;

    // Espessura atual do primitivo
    private int espAtual = 1;

    // Componentes de GUI
    // barra de menu (inserir componente)
    private JToolBar barraComandos = new JToolBar();

    // mensagens
    private JLabel msg = new JLabel("Msg: ");

    // Painel de desenho
    private PainelDesenho areaDesenho = new PainelDesenho(msg, tipoAtual, corAtual, 10);

    // Botoes
    private JButton jbPonto = new JButton("Ponto");
    private JButton jbReta = new JButton("Reta");
    private JButton jbRetangulo = new JButton("Retangulo");
    private JButton jbTriangulo = new JButton("Triangulo");
    private JButton jbCirculo = new JButton("Circulo");
    private JButton jbLimpar = new JButton("Limpar");
    private JButton jbCor = new JButton("Cor");
    private JButton jbPincel = new JButton("Pincel");
    private JButton jbPoligono = new JButton("Poligono");
    private JButton jbRefazer = new JButton("Refazer");
    private JButton jbSair = new JButton("Sair");

    // Entrada (slider) para definir espessura dos primitivos
    private JLabel jlEsp = new JLabel("   Espessura: " + String.format("%-5s", 1));
    private JSlider jsEsp = new JSlider(1, 50, 1);

    /**
     * Constroi a GUI
     *
     * @param larg largura da janela
     * @param alt altura da janela
     */
    public Gui(int larg, int alt) {
        /**
         * Definicoes de janela
         */
        super("Testa Primitivos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(larg, alt);
        setVisible(true);
        setResizable(false);

        // Adicionando os componentes
        barraComandos.add(jbPonto);
        barraComandos.add(jbReta);
        barraComandos.add(jbRetangulo);
        barraComandos.add(jbTriangulo);
        barraComandos.add(jbCirculo);
        barraComandos.add(jbPincel);
        barraComandos.add(jbPoligono);
        barraComandos.add(jbRefazer); //Botao de refazer
        barraComandos.add(jbLimpar); // Botao de Limpar
        barraComandos.add(jbCor); // Botao de Cores

        barraComandos.add(jlEsp); // Label para espessura
        barraComandos.add(jsEsp);    // Slider para espacamento
        areaDesenho.setEsp(espAtual); // define a espessura inicial
        barraComandos.add(jbSair); // Botao de Cores

        // adiciona os componentes com os respectivos layouts
        add(barraComandos, BorderLayout.NORTH);                
        add(areaDesenho, BorderLayout.CENTER);                
        add(msg, BorderLayout.SOUTH);

        // Adiciona "tratador" ("ouvidor") de eventos para 
        // cada componente
        jbPonto.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.PONTO;
            areaDesenho.setTipo(tipoAtual);
        }); 
        
        jbReta.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETA;
            areaDesenho.setTipo(tipoAtual);
        });
        
        jbRetangulo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETANGULO;
            areaDesenho.setTipo(tipoAtual);
        });
        
        jbTriangulo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.TRIANGULO;
            areaDesenho.setTipo(tipoAtual);
        });
        
        jbCirculo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.CIRCULO;
            areaDesenho.setTipo(tipoAtual);
        }); 
        
        jbPincel.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.PINCEL;
            areaDesenho.setTipo(tipoAtual);
        }); 
        
        jbPoligono.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.POLIGONO;
            areaDesenho.setTipo(tipoAtual);
        }); 
        
        jbRefazer.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.REFAZER;
            areaDesenho.setTipo(tipoAtual);
        });
        
        jbLimpar.addActionListener(e -> {
            areaDesenho.removeAll();
            jsEsp.setValue(1); // inicia slider (necessario para limpar ultimo primitivoda tela) 
            repaint();        
        }); 
        
        jbCor.addActionListener(e -> {
            Color c = JColorChooser.showDialog(null, "Escolha uma cor", msg.getForeground()); 
            if (c != null){ 
                corAtual = c; // pega do chooserColor 
            }
            areaDesenho.setCorAtual(corAtual); // cor atual
        });
        
        jsEsp.addChangeListener(e -> {
            espAtual = jsEsp.getValue();
            jlEsp.setText("   Espessura: " + String.format("%-5s", espAtual));
            areaDesenho.setEsp(espAtual);        
        });

        jbSair.addActionListener(e -> {
            System.exit(0);
        });        
    }
}