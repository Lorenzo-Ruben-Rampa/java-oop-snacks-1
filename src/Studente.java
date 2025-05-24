public class Studente {
    private String nome;
    private String cognome;
    private int età;

    //costruttore
    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    //metodo
    public String getData() {
        if (nome != null & cognome != null & età > 0) {
            return nome + " " + cognome + ", " + età;
        }
        return "Dati errati";
        }
}
