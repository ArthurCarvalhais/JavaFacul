//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestaCliente {
    public static void main (String[] args){
        Cliente fulano = new Cliente(175896, 77, "Arthur", 2500.0f);
        System.out.println(fulano.dadosCliente());
        fulano.realizarDeposito(500.0f);
        fulano.realizarSaque(250.0f);
        System.out.println(fulano.dadosCliente());

        Cliente beltrano = new Cliente(177859, 77, "Beatriz", 1500.0f);
        System.out.println(beltrano.dadosCliente());
        beltrano.realizarDeposito(1500.0f);
        beltrano.realizarSaque(450.0f);
        System.out.println(beltrano.dadosCliente());

    }
}



