package equipamentos.reprodutorMusica;

public class ipod implements reprodutorMusical {
    public void tocar (){
        System.out.println("Tocando Música");
    }
    public void pausar (){
        System.out.println("Pausando Música");
    }

    public void selecionarMusica (){
        System.out.println("Selecionando Música");
    }
}
