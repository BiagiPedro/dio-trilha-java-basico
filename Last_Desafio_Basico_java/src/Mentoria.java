import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private String data;

    public Mentoria(String mentoriaJava, String s, LocalDate of) {
        super();
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public String getData() {
        return data;
    }


}
