public class RegistroStudenti {
    private Studente[] registro;

    // Costruttore che inizializza il registro con un array vuoto
    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    //CAPACITÀ:
    //------ METODI PUBBLICI ------
    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(Studente studente) {
        if (studente != null) {
            Studente[] nuovoRegistro = new Studente[this.registro.length +1];
            // Copia gli studenti esistenti nel nuovo array
            for (int i = 0; i < registro.length; i++) {
                nuovoRegistro[i] = this.registro[i];
            }
            // Aggiungi il nuovo studente all'ultimo posto dell'array
            nuovoRegistro[nuovoRegistro.length -1] = studente;
            // Sovrascrivi il registro con il nuovo array
            this.registro = nuovoRegistro;
        } else {
            System.out.println("Studente non valido.");
        }
    }

    //Metodo per stampare tutti gli studenti del registro
    public String toString() {
        String output = "Registro Studenti: ";
        for (Studente studente : this.registro) {
                output += String.format(" %s",studente.getData());
            }
            return output;
        }

    //Getters & setters
    public Studente[] getRegistro() {
        return registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

}
