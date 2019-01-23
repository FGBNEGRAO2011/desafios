package heranca;

public class ProjetoPessoa {
    public static void main (String [] args) {
        Pessoa  p1  = new Pessoa();
        Aluno   p2  = new Aluno();
        Professor  p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p2.setNome("Pedro Aluno");
        p2.setSexo("M");

        p3.setNome("Paulo Professor");
        p4.setNome("Maria Funcionario");

        p2.setCurso("Contabilidade");
        p3.setSexo("M");
        p3.setIdade(45);
        p4.setIdade(70);
        p4.fazerAniv();

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
