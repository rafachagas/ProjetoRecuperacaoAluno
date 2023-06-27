package View;

import Form.RelatorioAluno;
import Model.Aluno;
import Repository.AlunoDAO;

import javax.swing.*;
import java.time.LocalDate;

public class ViewController {
    public static void menuPrincipal(){
        String[] opcaoAcesso ={"Cadastro", "Relatório", "Sair"};
        int opcao= JOptionPane.showOptionDialog(null, "Acesso opção desejada",
                "Acesso principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcaoAcesso,opcaoAcesso[0]);

        switch (opcao){
            case 0: // cadastro
                cadastroAluno();
                break;
            case 1: // relatório
                RelatorioAluno.exibirRelatorio(AlunoDAO.buscaAlunos());
                break;
            case 2: // sair
                int sair= JOptionPane.showOptionDialog(null, "Deseja realmente sair do sistema?",
                        "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (sair == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    menuPrincipal();
                }
                break;
        }
    }

    public static void cadastroAluno(){
        Integer codigo= AlunoDAO.insereCodigo();

        String nome= JOptionPane.showInputDialog(null, "Digite o nome do aluno");

        while (nome.isEmpty()){
            nome= JOptionPane.showInputDialog(null, "Digite o nome do aluno");

            if(nome == null){
                menuPrincipal();
            }
        }

        String email= JOptionPane.showInputDialog(null, "Digite o email do aluno");

        while (email.isEmpty()){
            email= JOptionPane.showInputDialog(null, "Digite o email do aluno");

            if(email == null){
                menuPrincipal();
            }
        }

        String telefone= JOptionPane.showInputDialog(null, "Digite o telefone do aluno");

        while (telefone.isEmpty()){
            telefone= JOptionPane.showInputDialog(null, "Digite o telefone do aluno");

            if(telefone == null){
                menuPrincipal();
            }
        }

//        LocalDate dataNascimento= LocalDate.parse(JOptionPane.showInputDialog(null, "Digite a data de nascimento"));
        LocalDate dataNascimento = LocalDate.now();
        String dataNasc = JOptionPane.showInputDialog(null,"Informe a data de nascimento? (formato: dd/MM/yyyy)");

        if(dataNasc == null){
            menuPrincipal();
        }

        Double nota1= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
        Double nota2= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
        Double nota3= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota"));
        Double nota4= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quarta nota"));

        Double frequencia= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a frequência"));

        Double media= 0.0;
        String resultado= "";
        Aluno aluno= new Aluno(codigo, nome, email, telefone, dataNascimento, nota1, nota2, nota3, nota4, media, resultado, frequencia);
        AlunoDAO.salvarAluno(aluno);
        menuPrincipal();
    }

}
