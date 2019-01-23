package aula012;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Verduras");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emite som de Ave");
    }
}
