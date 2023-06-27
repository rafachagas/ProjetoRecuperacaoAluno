package Repository;

import Model.Aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    static List<Aluno> listAlunos = new ArrayList<>();

    public static void salvarAluno(Aluno aluno){
        listAlunos.add(aluno);
        getVerificaResultado();
    }

    public static List<Aluno> buscaAlunos(){
        return listAlunos;
    }

    public static String getVerificaResultado(){
        Double calculoMedia= 0.0;

        for (Aluno aluno : listAlunos) {
            calculoMedia= (aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4()) / 4;
            // aluno.setMedia(calculoMedia);

            if(calculoMedia >= 7 && aluno.getFrequencia() >= 75.0){
                aluno.setMedia(calculoMedia);
                aluno.setResultado("Aprovado");
                JOptionPane.showMessageDialog(null, aluno.getNome() + "\nAprovado com média " + calculoMedia);
            }
            else if (calculoMedia >= 5.0 && calculoMedia < 7.0 && aluno.getFrequencia() >= 75.0){
                aluno.setMedia(calculoMedia);
                aluno.setResultado("Recuperação");
                JOptionPane.showMessageDialog(null, aluno.getNome() + "\nem Recuperação com média " + calculoMedia);
            }
            else {
                aluno.setMedia(calculoMedia);
                aluno.setResultado("Reprovado");
                JOptionPane.showMessageDialog(null, aluno.getNome() + "\nReprovado com média " + calculoMedia);
            }
        }
        return null;
    }


    public static Integer insereCodigo(){
        return listAlunos.size() + 1;
    }
}
