package equipamentos.navegadorInternet;

import equipamentos.navegadorInternet.navegadorInternet;

public class desktop implements navegadorInternet {
    public void exibirPagina (){
        System.out.println("Exibindo Página");
    }
    public void adicionarNovaAba (){
        System.out.println("Abrindo Nova Aba");
    }

    public void atualizarPagina (){
        System.out.println("atualizando Página");
    }
}
