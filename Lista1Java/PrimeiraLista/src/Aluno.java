import javax.swing.*;

public class Aluno {
    int numeroAluno;
    String nome;
    int idade;
    float p1, p2;

    // Construtor
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Método para calcular a média final
    public float notaFinal() {
        return (p1 + p2) / 2;
    }

    // Método para retornar os dados do aluno
    public String dadosAluno() {
        return "Número: " + numeroAluno + ", Nome: " + nome + ", Idade: " + idade;
    }

    // Método para verificar se o aluno passou
    public boolean passou() {
        return notaFinal() >= 6.0;
    }
}
