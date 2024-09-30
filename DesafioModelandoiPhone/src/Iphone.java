public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero" + numero);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");    
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina" + url);
    }

    @Override
    public void pausar() {
        System.out.println("A música foi pausada");    
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A Música " + musica + " foi selecionada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }
    
}
