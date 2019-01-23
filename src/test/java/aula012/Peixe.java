package aula012;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Substancias Marinhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não emite Som");
    }
}
