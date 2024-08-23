public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String cursoDeJava, String s, int i) {
        super();
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
