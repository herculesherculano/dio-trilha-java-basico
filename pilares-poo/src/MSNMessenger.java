public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
        salvarHistoricoMensagem();        
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem do MSN");
    }
     
}
