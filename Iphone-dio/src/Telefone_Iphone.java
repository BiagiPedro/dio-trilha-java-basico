import java.util.Scanner;

public class Telefone_Iphone implements ReprodutorMusical,Internet,FuncaoTelefone  {
    public static void main(String[] args) {

        Telefone_Iphone Iphone15 = new Telefone_Iphone();

        Scanner sc = new Scanner(System.in);
        System.out.println("numero para ligar");
        String numero = sc.nextLine();
        System.out.println(" Qual pagina voce quer acessar");
        String url = sc.nextLine();
        System.out.println("Qual musica voce quer escutar");
        String musica = sc.nextLine();

        Iphone15.ligar(numero);
        Iphone15.atender();
        Iphone15.iniciarCorreioVoz();
        Iphone15.exibirpagina(url);
        Iphone15.adcionarNovaAba();
        Iphone15.atualizarPagina();
        Iphone15.tocar();
        Iphone15.pausar();
        Iphone15.selecionarMusica(musica);





    }


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a Ligacao rs");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Gravando um correio , com sua voz linda");
    }

    @Override
    public void exibirpagina(String url) {
        System.out.println("exibindo a pagina "+ url);
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando essa pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando um belo som");
    }

    @Override
    public void pausar() {
        System.out.println("Sytem.pause");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("tocando a musica "+ musica);
    }
}
