package heranca;

public class Aluno extends Pessoa{
    private boolean matr;
    private String curso;

    public void cancelarMatr() {
        this.setMatr(false);
    }

    public boolean getMatr() {
        return matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
