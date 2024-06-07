public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("Atendendo");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
        
    }

    @Override
    public void pausar() {
        System.out.println("Música em pausa");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
        
    }
    
}
