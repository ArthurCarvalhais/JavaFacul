//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
       Aluno aluno1 = new Aluno(15, "Arthur", 20, 7.5f, 8.5f);
       System.out.println(aluno1.dadosAluno());
       System.out.println("Média Final: " + aluno1.notaFinal());

       if(aluno1.passou()){
           System.out.println("Aluno Aprovado!");
       } else{
           System.out.println("Aluno Reprovado!");
       }

    }
}