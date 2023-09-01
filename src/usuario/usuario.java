package usuario;

import equipamentos.aparelhoTelefonico.aparelhoTelefonico;
import equipamentos.iphone.iphone;
import equipamentos.navegadorInternet.navegadorInternet;
import equipamentos.reprodutorMusica.reprodutorMusical;

public class usuario {
    public static <equipamentos> void main(String[] args) {
        aparelhoTelefonico aparelhoTelefonico = new iphone();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet navegadorInternet = new iphone();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina();

        reprodutorMusical reprodutorMusical = new iphone();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

    }
}
