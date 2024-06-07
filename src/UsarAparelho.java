public class UsarAparelho {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        System.out.println(">> Métodos da interface ReprodutorMusical");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Música 1");

        System.out.println(">> Métodos da interface Aparelho Telefonico");
        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println(">> Métodos da interface Navegador de Internet");
        iPhone.exibirPagina("dio.me");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
