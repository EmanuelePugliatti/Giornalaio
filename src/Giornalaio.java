import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Giornalaio {
    
   static Map<String, Rivista> rivista = new HashMap<>();
   static Map<String, Cliente> mcliente = new HashMap<>();
   static Map<String, Abbonamento> abbonamento = new HashMap<>();
   static List<String> giorniSettimana = new ArrayList<>();


    public static void main(String[] args) {
        
        giorniSettimana.add("lunedi");
        giorniSettimana.add("martedì");
        giorniSettimana.add("mercoledì");
        giorniSettimana.add("giovedì");
        giorniSettimana.add("venerdì");
        giorniSettimana.add("sabato");
        giorniSettimana.add("domenica");




        Rivista riviste = new Rivista("calcetto", "sport", 2, "R01");
        rivista.put(riviste.getIdRivista(), riviste);
        riviste = new Rivista("gossip", "Vip", 1, "R02");
        rivista.put(riviste.getIdRivista(), riviste);
        riviste = new Rivista("Faschion", "Moda", 3, "R03");
        rivista.put(riviste.getIdRivista(), riviste);


    Cliente cliente = new Cliente("Alessandro","Corsetti","Via Milino","C01");
    mcliente.put(cliente.getIdCliente(), cliente);
    cliente = new Cliente("Emanuele","Pugliatti","Via Napoli","C02");
    mcliente.put(cliente.getIdCliente(), cliente);
    cliente = new Cliente("Luca","Fransetti","Via Roma","C03");
    mcliente.put(cliente.getIdCliente(), cliente);

    Abbonamento abbonamenti = new Abbonamento("A001","C01", "R01", true,rivista.get("R01").getGiorno());
    abbonamento.put(abbonamenti.getIdAbbonamento(), abbonamenti);
    abbonamenti = new Abbonamento("A002","C02", "R02", true,rivista.get("R02").getGiorno());
    abbonamento.put(abbonamenti.getIdAbbonamento(), abbonamenti);
    abbonamenti = new Abbonamento("A003","C03", "R03", true,rivista.get("R03").getGiorno());
    abbonamento.put(abbonamenti.getIdAbbonamento(), abbonamenti);
    

    for(int i = 1;i<8;i++){
        for(String keyab: abbonamento.keySet()){
            Abbonamento ab = abbonamento.get(keyab);
            if(ab.getGiornodiuscita()==  i){
                String ncli;
                String nriv;
                String messaggio;
                ncli = mcliente.get(ab.getIdCliente()).getNome() + " " + mcliente.get(ab.getIdCliente()).getCognome();
                nriv = rivista.get(ab.getIdRivista()).getNome();
                messaggio = giorniSettimana.get(i-1);
                messaggio = messaggio + "\n=================\n";
                messaggio = messaggio + "Inviare a " + ncli + ":\n";
                messaggio = messaggio + nriv;
                
                System.out.println(messaggio);
            }
            
        }
    }
}


}