package aula011;

public class Aula011 {
    public static void main(String [] args) {
       // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal Visitante");
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Marcos Aluno");
        a1.setCurso("Informatica");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.PagarMensalidade();
      //  System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Paulo Bolsista");
        b1.setBolsa(10);
        b1.setIdade(15);
        b1.PagarMensalidade();

    }

}
