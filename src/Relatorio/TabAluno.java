package Relatorio;
import javax.swing.table.AbstractTableModel;
import Model.Aluno;
import java.util.Vector;
import java.util.regex.Pattern;
public class TabAluno extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    public static final int INDEX_NOME = 0;
    public static final int INDEX_EMAIL = 1;
    public static final int INDEX_TELEFONE = 2;
    public static final int INDEX_DATANASCIMENTO = 3;
    public static final int INDEX_NOTA1 = 4;
    public static final int INDEX_NOTA2 = 5;
    public static final int INDEX_NOTA3 = 6;
    public static final int INDEX_NOTA4 = 7;
    public static final int INDEX_MEDIA = 8;
    public static final int INDEX_RESULTADO = 9;
    public static final int INDEX_FREQUENCIA = 10;
    public static final int INDEX_COLUNAESCONDIDA = 11;


    protected String[] nomeDasColunas;
    protected Vector<Aluno> vetorDeDados;

    public TabAluno(String[] nomeColunas, Vector<Aluno> vetorDados) {
        this.nomeDasColunas = nomeColunas;
        this.vetorDeDados = vetorDados;
    }

    @Override
    public String getColumnName(int column) {
        return nomeDasColunas[column];
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return coluna != INDEX_COLUNAESCONDIDA;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Aluno registroALuno = vetorDeDados.get(linha);

        switch (coluna) {
            case INDEX_NOME:
                return registroALuno.getNome();
            case INDEX_EMAIL:
                return registroALuno.getEmail();
            case INDEX_TELEFONE:
                return registroALuno.getTelefone();
            case INDEX_DATANASCIMENTO:
                return registroALuno.getDataNascimento();
            case INDEX_NOTA1:
                return registroALuno.getNota1();
            case INDEX_NOTA2:
                return registroALuno.getNota2();
            case INDEX_NOTA3:
                return registroALuno.getNota3();
            case INDEX_NOTA4:
                return registroALuno.getNota4();
            case INDEX_MEDIA:
                return registroALuno.getMedia();
            case INDEX_RESULTADO:
                return registroALuno.getResultado();
            case INDEX_FREQUENCIA:
                return registroALuno.getFrequencia();

            default:
                return new Object();
        }
    }


    @Override
    public int getRowCount() {
        return vetorDeDados.size();
    }

    @Override
    public int getColumnCount() {
        return nomeDasColunas.length;
    }


}
