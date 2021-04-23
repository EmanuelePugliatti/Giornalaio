public class Abbonamento {
    
    private String idAbbonamento;
    private String idCliente;
    private String idRivista;
    private boolean attivo;
    private int giornodiuscita;



    public int getGiornodiuscita() {
        return giornodiuscita;
    }

    public void setGiornodiuscita(int giornodiuscita) {
        this.giornodiuscita = giornodiuscita;
    }

    public Abbonamento(){

    
    }
    
     public Abbonamento(String idAbbonamento, String idCliente,String idRivista, boolean attivo,int giornodiuscita){
         this.idRivista = idRivista;
         this.idAbbonamento = idAbbonamento;
         this.attivo = attivo;
         this.giornodiuscita = giornodiuscita;
        
      
    }
  
   public String getIdAbbonamento() {
        return idAbbonamento;
    }

    public void setIdAbbonamento(String idAbbonamento) {
        this.idAbbonamento = idAbbonamento;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdRivista() {
        return idRivista;
    }

    public void setIdRivista(String idRivista) {
        this.idRivista = idRivista;
    }
    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }


}
