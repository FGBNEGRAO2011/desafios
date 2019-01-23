package aula011;

public class Bolsista extends Aluno {
    private float bolsa;

    public void RenovarBolsa () {

    }
    @Override
    public void PagarMensalidade() {
        System.out.println("Pagando Mensalidade do bolsista é diferente  " + this.nome);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
