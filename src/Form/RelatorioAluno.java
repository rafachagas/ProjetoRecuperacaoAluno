package Form;

import Relatorio.TabAluno;
import Model.Aluno;
import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Vector;
import static View.ViewController.menuPrincipal;


public class RelatorioAluno extends JPanel {

    private static final long serialVersionUID = 1L;
    public static final String[] nomeDasColunas = {"Nome", "Email", "Tefone","Data de Nasc","Nota 1"," Nota 2", "Nota 3", "Nota 4", "Média", "Resultado", "Frequência", ""};

    protected JTable table;
    protected JScrollPane scroller;
    protected TabAluno tabela;

    public RelatorioAluno(Vector<Aluno> vetorDados){
        iniciarVetorDeComponentes(vetorDados);
    }
    public void iniciarVetorDeComponentes(Vector<Aluno> vetorDados){
        tabela = new TabAluno(nomeDasColunas, vetorDados);
        table = new JTable(); table.setModel(tabela);
        table.setSurrendersFocusOnKeystroke(true);
        scroller = new javax.swing.JScrollPane(table);
        table.setPreferredScrollableViewportSize(new java.awt.Dimension(500,300));

        TableColumn colunaEscondida = table.getColumnModel().getColumn(TabAluno.INDEX_COLUNAESCONDIDA);
        colunaEscondida.setMinWidth(11);
        colunaEscondida.setPreferredWidth(11);
        colunaEscondida.setMaxWidth(11);
        setLayout(new BorderLayout());
        add(scroller, BorderLayout.CENTER);
    }


    public static void  exibirRelatorio(List<Aluno> alunos){

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            JFrame frame = new JFrame("Relatório - Alunos");

            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent evt) {
                    frame.setVisible(false);
                    menuPrincipal();
                }
            });
            Vector<Aluno>vetorDados = new Vector<Aluno>();
            for (Aluno aluno: alunos ) {
                vetorDados.add(aluno);
            }

            frame.getContentPane().add(new RelatorioAluno(vetorDados));
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
