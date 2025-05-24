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
    //CAPACITÀ:
    //metodo per ottenere i dati dello studente
    public String getData() {
        if (nome != null & cognome != null & età > 0) {
            return String.format("%s, %s, %d;", nome, cognome, età);
        }
        return "Dati errati";
        }

     // Getters & setters
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

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }
}

    

