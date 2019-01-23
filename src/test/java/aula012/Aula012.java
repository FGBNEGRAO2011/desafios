package aula012;

public class Aula012 {
    public static void main(String [] args) {
        Mamifero m = new Mamifero();
        m.idade = 10;
        m.peso = 12;
        m.membros = 4;
        m.locomover();
        m.alimentar();
        m.emitirSom();

        Reptil r = new Reptil();
        r.idade =200;
        r.locomover();
        r.alimentar();
        r.emitirSom();

        Peixe p = new Peixe();
        p.locomover();
        p.alimentar();
        p.emitirSom();

        Ave a = new Ave();
        a.locomover();
        a.alimentar();
        a.emitirSom();

        Canguru c = new Canguru();
        c.locomover();

        Cobra k = new Cobra();
        k.locomover();

        Tubarao t = new Tubarao();
        t.locomover();
    }
}
