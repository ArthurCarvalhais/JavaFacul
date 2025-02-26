import javax.swing.*;

class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;

    // Construtor
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void realizarDeposito(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para realizar saque
    public void realizarSaque(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    // Método para retornar informações do cliente
    public String dadosCliente() {
        return "Conta: " + numeroConta + ", Agência: " + numeroAgencia + ", Nome: " + nome + ", Saldo: R$" + saldo;
    }
}

