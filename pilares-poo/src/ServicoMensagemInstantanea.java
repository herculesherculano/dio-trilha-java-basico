public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();
    

   //métodos privados, visíveis somente na classe
   protected void validarConectadoInternet(){
    System.out.println("Validando se está conectado a internet");
   }

   protected abstract void salvarHistoricoMensagem();

}