public class Cliente {
   private String nome ;
   private String cognome;
   private String indirizzo;
   private String idCliente;


 
public Cliente(){
  }

  public Cliente(String nome, String cognome,String indirizzo,String idCliente){
      this.nome = nome;
      this.cognome = cognome;
      this.indirizzo = indirizzo;
      this.idCliente = idCliente;
  }


   public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCognome() {
    return cognome;
}
public void setCognome(String cognome) {
    this.cognome = cognome;
}
public String getIdCliente() {
    return idCliente;
}

public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
}

public String getIndirizzo() {
    return indirizzo;
}

public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
}

}
