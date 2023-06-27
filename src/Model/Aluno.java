package Model;

import java.time.LocalDate;

public class Aluno {
    private Integer codigo;
    private String nome, email, telefone, resultado;
    private LocalDate dataNascimento;
    private Double nota1, nota2, nota3, nota4, media, frequencia;

    public Aluno(Integer codigo, String nome, String email, String telefone, LocalDate dataNascimento, Double nota1, Double nota2, Double nota3, Double nota4, Double media, String resultado, Double frequencia) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = media;
        this.resultado = resultado;
        this.frequencia = frequencia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public Double getMedia() {
        return media;
    }

    public String getResultado() {
        return resultado;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                ", media=" + media +
                ", resultado='" + resultado + '\'' +
                ", frequencia=" + frequencia +
                '}';
    }
}
