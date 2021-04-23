
public class Rivista{
    
    private String nome;
    private String genere;
    private int giorno; // da 1 a 7 giorni
    private String idRivista;
   


    public Rivista(){
    
    }

    public Rivista(String nome, String genere, int giorno ,String idRivista){
    this.nome = nome;
    this.genere = genere;
    this.giorno = giorno;
    this.idRivista = idRivista;
    }


    
    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public String getIdRivista() {
        return idRivista;
    }

    public void setIdRivista(String idRivista) {
        this.idRivista = idRivista;
    }
}
