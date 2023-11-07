import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.*;

import dados.ILista;
import dados.ListaLigada;
import arquivo.JSONWriter;
import transformacoes.Rotacao;
import transformacoes.Escala;
import triangulo.FiguraTriangulo;

@SuppressWarnings("serial")
/**
 * Cria a interface com o usu�rio (GUI)
 *
 * @author Pedro Marques Prado, Giovana Akemi Maeda Mathias, Lucas Kenji Hayashi, Jo�o Pedro do Carmo Ribeiro
 * @version 1.0 06/09/2023
 */
class Gui extends JFrame {
    //Instancia um novo componente de save dos desenhos
    private HashMap<JButton, Object> HASHMAP = new HashMap<JButton, Object>();

    private JButton[] botoesErase = new JButton[50];

    ILista listaSave = new ListaLigada();

    Rotacao rotacao = new Rotacao();
    Escala escala = new Escala();

    // Tipo Atual de primitivo
    private TipoPrimitivo tipoAtual = TipoPrimitivo.LIVRE;

    // Cor atual
    private Color corAtual = Color.BLACK;

    // Espessura atual do primitivo
    private int espAtual = 2;

    // Componentes de GUI
    // barra de menu (inserir componente)
    private JToolBar barraComandos = new JToolBar();

    // mensagens
    private JLabel msg = new JLabel("Msg: ");

    // Painel de desenho
    private PainelDesenho areaDesenho = new PainelDesenho(msg, tipoAtual, corAtual, 10);

    // Botoes
    private JButton jbFiguras = new JButton("Selecionar Figura");
    private JButton jbFerramentas = new JButton("Selecionar Ferramenta");
    private JButton jbInformacoes = new JButton("Opcoes");
    private JButton jbSelecionarPrim = new JButton("Selecionar Figura");
    private JButton jbPonto = new JButton("Ponto");
    private JButton jbReta = new JButton("Reta");
    private JButton jbRetangulo = new JButton("Retangulo");
    private JButton jbTriangulo = new JButton("Triangulo");
    private JButton jbCirculo = new JButton("Circulo");
    private JButton jbEstrela = new JButton("Estrela");
    private JButton jbSeta = new JButton("Seta");
    private JButton jbPoligono = new JButton("Poligono");
    private JButton jbHexagono = new JButton("Hexagono");
    private JButton jbLimpar = new JButton("Limpar");
    private JButton jbCor = new JButton("Cor");
    private JButton jbPincel = new JButton("Pincel");
    private JButton jbLapis = new JButton("Lapis");
    private JButton jbBorracha = new JButton("Borracha");
    private JButton jbFlor = new JButton("Flor");
    private JButton jbRefazer = new JButton("Refazer");
    private JButton jbLivre = new JButton("Livre");
    private JButton jbSair = new JButton("Sair");
    private JButton jbSalvarArquivo = new JButton("Salvar");
    private JButton jbLerArquivo = new JButton("Ler");
    private JButton jbLimparArquivo = new JButton("Limpar");
    private JButton jbRotacionarFigura = new JButton("Rotacionar");
    private JButton jbEscalaFigura = new JButton("Escala");

    // Entrada (slider) para definir espessura dos primitivos
    private JLabel jlEsp = new JLabel("   Espessura: " + String.format("%-5s", 1));
    private JSlider jsEsp = new JSlider(1, 50, 1);

    //
    public class ComecarPonto extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.PONTO;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarReta extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.RETA;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarRetangulo extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.RETANGULO;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarTriangulo extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.TRIANGULO;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarCirculo extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.CIRCULO;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarFlor extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.FLOR;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarPentagono extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.PENTAGONO;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarHexagono extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.HEXAGONO;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarPincel extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.PINCEL;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarBorracha extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.BORRACHA;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    public class ComecarRefazer extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            tipoAtual = TipoPrimitivo.REFAZER;
            areaDesenho.setTipo(tipoAtual);
        }
    }

    /**
     * Constroi a GUI
     *
     * @param larg largura da janela
     * @param altura altura da janela
     */
    public void opcoesFiguras(int larg, int altura){
        JFrame frame = new JFrame("Escolha a sua Figura");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11,1));
        JLabel label = new JLabel("Escolha uma figura para desenhar:");
        panel.add(label);
        panel.add(jbPonto);
        panel.add(jbReta);
        panel.add(jbRetangulo);
        panel.add(jbTriangulo);
        panel.add(jbCirculo);
        panel.add(jbFlor);
        panel.add(jbEstrela);
        panel.add(jbSeta);
        panel.add(jbPoligono);
        panel.add(jbHexagono);
        frame.add(panel);
        frame.setSize(larg/2, altura);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Utiliza do comando action e keyStroke para que quando o bot�o F1 for pressionado crie um ponto.
        Action comecarPonto;
        comecarPonto = new ComecarPonto();
        jbPonto.getInputMap().put(KeyStroke.getKeyStroke("F1"),"comecarPonto");
        jbPonto.getActionMap().put("comecarPonto", comecarPonto);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbPonto.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.PONTO;
            areaDesenho.setTipo(tipoAtual);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o F2 for pressionado crie uma reta.
        Action comecarReta;
        comecarReta = new ComecarReta();
        jbReta.getInputMap().put(KeyStroke.getKeyStroke("F2"),"comecarReta");
        jbReta.getActionMap().put("comecarReta", comecarReta);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbReta.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETA;
            areaDesenho.setTipo(tipoAtual);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o F3 for pressionado crie uma retangulo.
        Action comecarRetangulo;
        comecarRetangulo = new ComecarRetangulo();
        jbRetangulo.getInputMap().put(KeyStroke.getKeyStroke("F3"),"comecarRetangulo");
        jbRetangulo.getActionMap().put("comecarRetangulo", comecarRetangulo);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbRetangulo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETANGULO;
            areaDesenho.setTipo(tipoAtual);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o F4 for pressionado crie uma triangulo.
        Action comecarTriangulo;
        comecarTriangulo = new ComecarTriangulo();
        jbTriangulo.getInputMap().put(KeyStroke.getKeyStroke("F4"),"comecarTriangulo");
        jbTriangulo.getActionMap().put("comecarTriangulo", comecarTriangulo);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbTriangulo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.TRIANGULO;
            areaDesenho.setTipo(tipoAtual);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o F5 for pressionado crie uma Circulo.
        Action comecarCirculo;
        comecarCirculo = new ComecarCirculo();
        jbCirculo.getInputMap().put(KeyStroke.getKeyStroke("F5"),"comecarCirculo");
        jbCirculo.getActionMap().put("comecarCirculo", comecarCirculo);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbCirculo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.CIRCULO;
            areaDesenho.setTipo(tipoAtual);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o F6 for pressionado crie uma flor.
        Action comecarFlor;
        comecarFlor = new ComecarFlor();
        jbFlor.getInputMap().put(KeyStroke.getKeyStroke("F6"),"comecarFlor");
        jbFlor.getActionMap().put("comecarFlor", comecarFlor);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbFlor.addActionListener(e -> {
            GuiFlor();
            tipoAtual = TipoPrimitivo.FLOR;
            areaDesenho.setTipo(tipoAtual);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o F7 for pressionado crie um pentagono.
        Action comecarPentagono;
        comecarPentagono = new ComecarPentagono();
        jbPoligono.getInputMap().put(KeyStroke.getKeyStroke("F7"),"comecarPentagono");
        jbPoligono.getActionMap().put("comecarPentagono", comecarPentagono);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbPoligono.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.PENTAGONO;
            areaDesenho.setTipo(tipoAtual);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o F8 for pressionado crie uma hexagono.
        Action comecarHexagono;
        comecarHexagono = new ComecarHexagono();
        jbHexagono.getInputMap().put(KeyStroke.getKeyStroke("F8"),"comecarHexagono");
        jbHexagono.getActionMap().put("comecarHexagono", comecarHexagono);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbHexagono.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.HEXAGONO;
            areaDesenho.setTipo(tipoAtual);
        });
    }

    /**
     * Constroi o GUI de ferramentas

     */
    public void opcoesFerramentas(int larg, int altura){
        JFrame frame = new JFrame("Escolha a sua Ferramenta");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8,1));
        JLabel label = new JLabel("Escolha uma ferramenta para utilizar:");
        panel.add(label);
        panel.add(jbPincel); // Botao de Pincel
        panel.add(jbLapis); // Botao de Lapis
        panel.add(jbBorracha); // Botao de Borracha
        panel.add(jbLimpar); // Botao de Limpar
        panel.add(jbLivre); // Botao de Livre
        panel.add(jbRotacionarFigura); //Bot�o de rota��o de figuras primitivas
        panel.add(jbEscalaFigura); //Bot�o de escala de figuras primitivas
        frame.add(panel);
        frame.setSize(larg/2, altura/2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Utiliza do comando action e keyStroke para que quando o bot�o p for pressionado usar o pincel.
        Action comecarPincel;
        comecarPincel = new ComecarPincel();
        jbPincel.getInputMap().put(KeyStroke.getKeyStroke("p"),"comecarPincel");
        jbPincel.getActionMap().put("comecarPincel", comecarPincel);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbPincel.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.PINCEL;
            areaDesenho.setTipo(tipoAtual);
        });

        jbRotacionarFigura.addActionListener(e -> {
            opcoesTransformarFigura(larg / 2, altura / 2, "ROTACIONA");
        });

        jbEscalaFigura.addActionListener(e -> {
            opcoesTransformarFigura(larg / 2, altura / 2, "ESCALA");
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o b for pressionado usar a borracha.
        Action comecarBorracha;
        comecarBorracha = new ComecarBorracha();
        jbBorracha.getInputMap().put(KeyStroke.getKeyStroke("b"),"comecarBorracha");
        jbBorracha.getActionMap().put("comecarBorracha", comecarBorracha);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbBorracha.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.BORRACHA;
            areaDesenho.setTipo(tipoAtual);
        });

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbLimpar.addActionListener(e -> {
            areaDesenho.removeAll();
            listaSave.limparLista();
            repaint();
        });

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbLivre.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.LIVRE;
            areaDesenho.setTipo(tipoAtual);
        });
    }
    public void opcoesSelFigura(int larg,int altura) {
        listaSave = areaDesenho.getLista();
        JFrame frame = new JFrame("Escolha o seu Primitivo");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 1));
        JLabel label = new JLabel("Escolha uma figura para apagar:");
        panel.add(label);

        for (int i = 0; i <= listaSave.tamanhoLista() - 1; i++) {
            botoesErase[i] = new JButton(listaSave.getTipo(i));
            panel.add(botoesErase[i]);
            HASHMAP.put(botoesErase[i], listaSave.getElemento(i));
            int finalI = i;
            botoesErase[i].addActionListener(e -> {
                eraseI(botoesErase[finalI]);
                frame.dispose();
                opcoesSelFigura(larg, altura);
            });
        }
        frame.add(panel);
        frame.setSize(larg / 2, altura);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public double painelQuantidade(){
        JFrame f;
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f,"Insira a quantidade (rota��o: graus, escala: pixels)");
        double qtd = Double.parseDouble(name);
        return qtd;
    }

    public Color preservaCor(String cor){
        //Fazendo o sistema de leitura de cores
        String corTexto = cor;
        corTexto = corTexto.trim();
        corTexto = corTexto.replace("java.awt.Color[", "");
        corTexto = corTexto.replace("]", "");
        corTexto = corTexto.replace("r=", "");
        corTexto = corTexto.replace("g=", "");
        corTexto = corTexto.replace("b=", "");
        String valoresCor[];
        valoresCor = corTexto.split(",");
        valoresCor[0] = valoresCor[0].trim();
        valoresCor[1] = valoresCor[1].trim();
        valoresCor[2] = valoresCor[2].trim();
        String red = valoresCor[0];
        String green = valoresCor[1];
        String blue = valoresCor[2];
        int couleurRouge = Integer.parseInt(red);
        int couleurVert = Integer.parseInt(green);
        int couleurBleu = Integer.parseInt(blue);
        Color corPreservada = new Color(couleurRouge, couleurVert, couleurBleu);

        return corPreservada;
    }

    public void opcoesTransformarFigura(int larg,int altura, String modo) {
        listaSave = areaDesenho.getLista();

        String[] separador;

        //Painel da selecao
        JFrame frame = new JFrame("Escolha o seu Primitivo");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 1));
        JLabel label = new JLabel("Escolha uma figura para rotacionar:");
        panel.add(label);

        for (int i = 0; i <= listaSave.tamanhoLista() - 1; i++) {
            botoesErase[i] = new JButton(listaSave.getTipo(i));
            panel.add(botoesErase[i]);
            HASHMAP.put(botoesErase[i], listaSave.getElemento(i));
            int finalI = i;
            Graphics graph = getGraphics();

            separador = listaSave.getElemento(i).toString().split(" , ", 9);

            String[] finalSeparador = separador;
            botoesErase[i].addActionListener(e -> {
                transformacao(finalI,modo);
                frame.dispose();
                opcoesTransformarFigura(larg, altura, modo);
            });
        }
        frame.add(panel);
        frame.setSize(larg / 2, altura);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void transformacao(int i,String modo){
        Graphics graph = getGraphics();
        String[] finalSeparador = listaSave.getElemento(i).toString().split(" , ", 9);
        if(modo.equals("ROTACIONA")){
            if(finalSeparador[0].equals("RETA")){
                double angulacao = painelQuantidade();
                Color corPreservada = preservaCor(finalSeparador[8]);

                double x1 = Double.parseDouble(finalSeparador[1]);
                int x1f = (int) x1;

                double y1 = Double.parseDouble(finalSeparador[2]);
                int y1f = (int) y1;

                double x2 = Double.parseDouble(finalSeparador[3]);
                int x2f = (int) x2;

                double y2 = Double.parseDouble(finalSeparador[4]);
                int y2f = (int) y2;

                int esp = Integer.parseInt(finalSeparador[7]);

                double angulo = rotacao.calcAngulo(angulacao);

                double x2modif = x1 + ((x2 - x1) * Math.cos(angulo)) - ((y2 - y1) * Math.sin(angulo));
                double y2modif = y1 + ((x2 - x1) * Math.sin(angulo)) + ((y2 - y1) * Math.cos(angulo));

                rotacao.rotacionarReta(graph, (int)x1, (int)y1, (int)x2modif, (int)y2modif, esp, angulacao, corPreservada);
                listaSave.adicionarRetaLista("RETA", x1f, y1f, x2modif, y2modif, esp, corPreservada);
            }
            else if(finalSeparador[0].equals("RETANGULO")){
                System.out.println(finalSeparador[1]);
                System.out.println(finalSeparador[2]);
                System.out.println(finalSeparador[3]);
                System.out.println(finalSeparador[4]);
                double angulacao = painelQuantidade();
                Color corPreservada = preservaCor(finalSeparador[8]);

                double x1 = Double.parseDouble(finalSeparador[1]);
                int x1f = (int) x1;

                double y1 = Double.parseDouble(finalSeparador[2]);
                int y1f = (int) y1;

                double x2 = Double.parseDouble(finalSeparador[3]);
                int x2f = (int) x2;

                double y2 = Double.parseDouble(finalSeparador[4]);
                int y2f = (int) y2;

                int esp = Integer.parseInt(finalSeparador[7]);

                double angulo = rotacao.calcAngulo(angulacao);

                double x2modif = x1 - ((y2 - y1) * Math.sin(angulo));
                double y2modif = y1 + ((y2 - y1) * Math.cos(angulo));
                double x3modif = x1 + ((x2 - x1) * Math.cos(angulo)) - ((y2 - y1) * Math.sin(angulo));
                double y3modif = y1 + ((x2 - x1) * Math.sin(angulo)) + ((y2 - y1) * Math.cos(angulo));
                double x4modif = x1 + ((x2 - x1) * Math.cos(angulo));
                double y4modif = y1 + ((x2 - x1) * Math.sin(angulo));

                rotacao.rotacionarRetangulo(graph, (int)x1, (int)y1, (int)x2modif, (int)y2modif, esp, angulacao, corPreservada);
                listaSave.adicionarRetaLista("RETANGULO", x1f, y1f, x2modif, y2modif, esp, corPreservada);
            }
            else if(finalSeparador[0].equals("TRIANGULO")){
                double angulacao = painelQuantidade();
                Color corPreservada = preservaCor(finalSeparador[8]);

                double x1 = Double.parseDouble(finalSeparador[1]);
                int x1f = (int) x1;

                double y1 = Double.parseDouble(finalSeparador[2]);
                int y1f = (int) y1;

                double x2 = Double.parseDouble(finalSeparador[3]);
                int x2f = (int) x2;

                double y2 = Double.parseDouble(finalSeparador[4]);
                int y2f = (int) y2;

                double x3 = Double.parseDouble(finalSeparador[5]);
                int x3f = (int) x3;

                double y3 = Double.parseDouble(finalSeparador[6]);
                int y3f = (int) y3;

                int esp = Integer.parseInt(finalSeparador[7]);

                double angulo = rotacao.calcAngulo(angulacao);

                double x2modif = x1 + (x2 - x1) * Math.cos(angulo) - (y2 - y1) * Math.sin(angulo);
                double y2modif = y1 + (x2 - x1) * Math.sin(angulo) + (y2 - y1) * Math.cos(angulo);
                double x3modif = x1 + (x3 - x1) * Math.cos(angulo) - (y3 - y1) * Math.sin(angulo);
                double y3modif = y1 + (x3 - x1) * Math.sin(angulo) + (y3 - y1) * Math.cos(angulo);

                //Desenha o novo triângulo
                FiguraTriangulo.desenharTriangulo(graph, (int)x1, (int)y1, (int)x2modif, (int)y2modif, (int)x3modif, (int)y3modif, "", esp, corPreservada);
                listaSave.adicionarTrianguloLista("TRIANGULO", x1, y1, x2modif, y2modif, x3modif, y3modif, esp, corPreservada);
                listaSave.remover(i);
                areaDesenho.ref();
            }
        }
        else if(modo.equals("ESCALA")){
            if(finalSeparador[0].equals("TRIANGULO")){
                double aumento = painelQuantidade();
                Color corPreservada = preservaCor(finalSeparador[8]);

                double x1ff = Double.parseDouble(finalSeparador[1]);
                int x1f = (int) x1ff;

                double y1ff = Double.parseDouble(finalSeparador[2]);
                int y1f = (int) y1ff;

                double x2ff = Double.parseDouble(finalSeparador[3]);
                int x2f = (int) x2ff;

                double y2ff = Double.parseDouble(finalSeparador[4]);
                int y2f = (int) y2ff;

                double x3ff = Double.parseDouble(finalSeparador[5]);
                int x3f = (int) x3ff;

                double y3ff = Double.parseDouble(finalSeparador[6]);
                int y3f = (int) y3ff;

                int esp = Integer.parseInt(finalSeparador[7]);

                escala.escalaTriangulo(graph, aumento / 2, aumento / 2, x1ff, y1ff, x2ff, y2ff, x3ff, y3ff, esp, corPreservada);
                listaSave.adicionarTrianguloLista("TRIANGULO", x1f, y1f, x2f, y2f, x3f, y3f, esp, corPreservada);
            }
        }

    }
    public void opcoesInformacoes(int larg, int alt){
        JFrame frame = new JFrame("Salvamento em JSON");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel("Escolha uma das opcoes");
        panel.add(label);
        panel.add(jbSalvarArquivo);
        panel.add(jbLerArquivo);
        panel.add(jbLimparArquivo);

        frame.add(panel);
        frame.setSize(larg/2, alt/2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //JSONWriter arquivo = new JSONWriter();
        jbSalvarArquivo.addActionListener(e -> {
            //areaDesenho.removeAll();
            repaint();
            tipoAtual = TipoPrimitivo.SALVARARQ;
            areaDesenho.setTipo(tipoAtual);
            //paint(getGraphics());
        });

        jbLerArquivo.addActionListener(e -> {
            areaDesenho.removeAll();
            repaint();
            tipoAtual = TipoPrimitivo.LERARQ;
            areaDesenho.setTipo(tipoAtual);
            //paint(getGraphics());
        });

        jbLimparArquivo.addActionListener(e -> {
           //arquivo.clear();
        });

    }

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
        barraComandos.add(jbFiguras);
        barraComandos.add(jbFerramentas);
        barraComandos.add(jbInformacoes);
        barraComandos.add(jbSelecionarPrim);
        barraComandos.add(jbRefazer); //Botao de refazer
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
        jbFiguras.addActionListener(e -> {
            opcoesFiguras(larg, alt);
        });

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbFerramentas.addActionListener(e -> {
            opcoesFerramentas(larg, alt);
        });

        jbSelecionarPrim.addActionListener(e -> {
            opcoesSelFigura(larg, alt);
        });

        jbInformacoes.addActionListener(e ->{
            opcoesInformacoes(larg, alt);
        });

        // Utiliza do comando action e keyStroke para que quando o bot�o r for pressionado para refazer a a��o
        Action comecarRefazer;
        comecarRefazer = new ComecarRefazer();
        jbRefazer.getInputMap().put(KeyStroke.getKeyStroke("r"),"comecarRefazer");
        jbRefazer.getActionMap().put("comecarRefazer", comecarRefazer);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbRefazer.addActionListener(e -> {
            areaDesenho.removeAll();
            repaint();
            tipoAtual = TipoPrimitivo.REFAZER;
            areaDesenho.setTipo(tipoAtual);
        });

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbCor.addActionListener(e -> {
            Color c = JColorChooser.showDialog(null, "Escolha uma cor", msg.getForeground());
            if (c != null) {
                corAtual = c; // pega do chooserColor 
            }
            areaDesenho.setCorAtual(corAtual); // cor atual
        });

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jsEsp.addChangeListener(e -> {
            espAtual = jsEsp.getValue();
            jlEsp.setText("   Espessura: " + String.format("%-5s", espAtual));
            areaDesenho.setEsp(espAtual);
        });

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente
        jbSair.addActionListener(e -> {
            System.exit(0);
        });
    }
    void GuiFlor(){

        Color cor1;
        Color cor2;

        System.out.println("ABRIU GUI FLOR");
        JFrame f = new JFrame("Cores do GUI");
        f.setSize(200, 400);
        f.setVisible(true);
        JPanel p = new JPanel();
        p.setBounds(40, 80, 200, 200);

        JLabel msg = new JLabel("  Selecione aqui as cores:  ");
        JButton btnCor1 = new JButton("Cor 1");
        JButton btnCor2 = new JButton("Cor 2");
        JButton btnConfirmar = new JButton("Confirmar");
        JButton btnCancelar = new JButton("Cancelar");

        p.add(msg);
        p.add(btnCor1);
        p.add(btnCor2);
        p.add(btnConfirmar);
        p.add(btnCancelar);

        f.add(p);

        // ===============

        btnCor1.addActionListener(e -> {
            Color c = JColorChooser.showDialog(null, "Escolha uma cor 1", msg.getForeground());
            if (c != null){
                areaDesenho.setCor1(c);
            }
        });
        btnCor2.addActionListener(e -> {
            Color c = JColorChooser.showDialog(null, "Escolha uma cor 2", msg.getForeground());
            if (c != null){
                areaDesenho.setCor2(c);
            }
        });

        btnConfirmar.addActionListener(e ->{
            f.dispose();

        });
        btnCancelar.addActionListener(e ->{
            f.dispose();
            areaDesenho.setCor1(Color.black);
            areaDesenho.setCor2(Color.black);
        });
    }
    public void eraseI(JButton bot){
        Object e = HASHMAP.get(bot);
        listaSave = areaDesenho.getLista();
        int i = 0;
        while(i <= listaSave.tamanhoLista() && listaSave.getElemento(i) != e) i++;
        if(i <= listaSave.tamanhoLista()){
            listaSave.remover(i);
            areaDesenho.ref();
        }
    }
}