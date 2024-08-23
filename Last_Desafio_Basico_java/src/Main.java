import java.time.LocalDate;

public class Main {

        public static void main(String[] args) {
            // Criar cursos e mentorias
            Curso cursoJava = new Curso("Curso de Java", "Aprenda Java do básico ao avançado", 40);
            Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Mentoria sobre conceitos avançados de Java", LocalDate.of(2024, 8, 23));

            // Criar Bootcamp
            Bootcamp bootcampJava = new Bootcamp("Bootcamp Java", "Bootcamp completo para se tornar um especialista em Java", LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 31));
            bootcampJava.adicionarConteudo(cursoJava);
            bootcampJava.adicionarConteudo(mentoriaJava);

            // Criar desenvolvedores
            Dev devAlice = new Dev("Alice");
            Dev devBob = new Dev("Bob");

            // Inscrever desenvolvedores no Bootcamp
            bootcampJava.inscreverDev(devAlice);
            bootcampJava.inscreverDev(devBob);

            // Progredir e calcular XP
            devAlice.progredir(); // Conclui o primeiro conteúdo inscrito
            devBob.progredir();   // Conclui o primeiro conteúdo inscrito

            // Exibir resultados
            System.out.println(bootcampJava);
            System.out.println("Total XP no Bootcamp: " + bootcampJava.calcularTotalXP());
            System.out.println(devAlice.getNome());
            System.out.println("XP total de Alice: " + devAlice.calcularTotalXP());
            System.out.println(devBob.getNome());
            System.out.println("XP total de Bob: " + devBob.calcularTotalXP());
        }
}
