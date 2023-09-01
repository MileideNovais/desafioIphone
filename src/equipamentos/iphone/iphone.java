package equipamentos.iphone;

import equipamentos.aparelhoTelefonico.aparelhoTelefonico;
import equipamentos.navegadorInternet.navegadorInternet;
import equipamentos.reprodutorMusica.reprodutorMusical;

public class iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {

    public void exibirPagina() {
        System.out.println("Exibindo página no Iphone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone");
    }
    public void tocar() {
        System.out.println("Tocando Música no Iphone");
    }
    public void pausar() {
        System.out.println("Pausando Música no Iphone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando Musica no Iphone");
    }

    public void ligar() {
        System.out.println("Realizando chamada no Iphone");
    }

    public void atender() {
        System.out.println("Atendendo Ligação no Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no Iphone");
    }
}
