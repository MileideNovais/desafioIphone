package equipamentos.aparelhoTelefonico;

import equipamentos.aparelhoTelefonico.aparelhoTelefonico;

public class moblilePhone implements aparelhoTelefonico {
    public void ligar(){
        System.out.println("Realizando chamada telefônica");
    }
    public void atender(){
        System.out.println("Atendendo Ligação");
    }

    public void iniciarCorreioVoz () {
        System.out.println("Iniciando  Correio de Voz");
    }

}
