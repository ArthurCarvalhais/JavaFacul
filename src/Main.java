//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criando objetos da classe Carro
        //instanciar a classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2015;
        obj1.velocidade = 0.0f;
        obj1.marca = "Chevrolet ";
        obj1.modelo = "Onix ";
        obj1.exibirDetalhes(); //o obj chama o método, sem o obj antes do exibirdetalhes não dá pra chamar o método

        Carro obj2 = new Carro();
        obj2.ano = 2018;
        obj2.velocidade = 0.0f;
        obj2.marca = "Volks ";
        obj2.modelo = "Gol ";
        obj2.exibirDetalhes();
        obj2.acelerar(50);
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();

        obj3.exibirDetalhes();

        Carro obj4 = new Carro (2015, 30.0f, "Toyota ", "Corolla ");
        obj4.exibirDetalhes();
        obj4.acelerar(50);
        obj4.exibirDetalhes();
        obj4.frear(150);
        obj4.exibirDetalhes();
        //acelaração começou com 30 e somou mais 50 e terminou com 80
        //se a freagem não for permitida, a velocidade exibida será a mesma da soma da aceleração, ou seja 80
    }
}