import java.math.BigDecimal;
import java.util.Random;

public class ContoBancario {
    private String iban;
    private BigDecimal saldo;

    // Costruttore
    public ContoBancario(String iban, BigDecimal saldo) {
        this.iban = generateIban();
        this.saldo = BigDecimal.ZERO; // saldo iniziale
    }

 // capacità prodotto

    // --- METODI PRIVATI (utilità interna) ---

    private String randomCode() {
        Random random = new Random();
        String result = "";
        // Restanti 21 cifre (0-9)
        for (int i = 0; i < 22; i++) {
            result += random.nextInt(10);
        }
        return result;
    }

    private String randomLetter() {
        Random random = new Random();
        int letterIndex = random.nextInt(26); // 26 lettere nell'alfabeto
        return String.valueOf((char) ('A' + letterIndex)); // Converte l'indice in una lettera
    }

    private int miniCode() {
        Random random = new Random();
        return random.nextInt(99);
    }
    // --- METODI PUBBLICI ---
    // Generatore IBAN randomici
        public String generateIban() {
        String countryCode = "IT"; // Codice paese per l'Italia
        String bankCode = String.format("%02d", miniCode()); // Codice della banca (2 cifre)
        return countryCode + bankCode + randomLetter() + randomCode(); // Restituisce l'IBAN completo
    }

    //Metodo per depositare denaro
    public void deposita(BigDecimal importo) {
        if (importo.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(importo);
        } else {
            System.out.println("Importo non valido per il deposito.");
        }
    }

    // Metodo per prelevare denaro
    public void preleva(BigDecimal importo) {
        if (importo.compareTo(BigDecimal.ZERO) > 0 && importo.compareTo(saldo) <= 0) {
            saldo = saldo.subtract(importo);
        } else {
            System.out.println("Importo non valido per il prelievo o saldo insufficiente.");
        }
    }

    // Getters
    public BigDecimal getSaldo() {
        return saldo;
    }
}

// Commented out code for iban generation and validation
    // public String getIban() {
    //     if (iban != null) {
    //         return String.format("%2d", miniCode()) + String.format("%1d", randomLetter()) + String.format("%22d", randomCode());
    //     }
    //     return "Iban errato";
    // }

    //  public static boolean isValidIban(String iban) {
    //     iban = iban.replace(" ", "").toUpperCase(); // Rimuove spazi e converte in maiuscolo

    //     if (iban.length() != 27 || !iban.startsWith("IT")) {
    //         return false;
    //     }
