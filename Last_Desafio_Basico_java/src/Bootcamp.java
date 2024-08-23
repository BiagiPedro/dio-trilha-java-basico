import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Set<Conteudo> conteudos = new HashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public Bootcamp(String nome, String descricao, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
        for (Conteudo conteudo : conteudos) {
            dev.inscreverConteudo(conteudo);
        }
    }

    public double calcularTotalXP() {
        return devsInscritos.stream()
                .mapToDouble(Dev::calcularTotalXP)
                .sum();
    }

    @Override
    public String toString() {
        return "Bootcamp: " + nome + " (" + descricao + ")";
    }

}
