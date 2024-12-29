public class Celular implements MusicPlayer, Navegador, Telefone {


    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
        
    }
    
    @Override
    public void parar() {
        System.out.println("Parando a música...");
        
    }

    @Override
    public void navegar() {
        System.out.println("Entrando no site...");
        
    }

    @Override
    public void pesquisar() {
        System.out.println("Fazendo pesquisa no google...");
        
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação...");
        
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
        
    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligando chamada...");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova aba...");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página...");
        
    }



}
