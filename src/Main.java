import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Lorenzo", "Rampa", 32); 
        
        System.out.println("-------------------------------------");
        System.out.println("Studente 1: " + s1.getData());

        Scanner scanner = new Scanner(System.in);
        
        // Richiesta all'utente di inserire un IBAN
        System.out.print("Inserisci un IBAN italiano (formato ITXXY...): ");
        String ibanInserito = scanner.nextLine().trim();
        
// Verifica validità IBAN
        if (isValidIban(ibanInserito)) {
            System.out.println("IBAN valido!");
    
            ContoBancario cb1 = new ContoBancario(ibanInserito, BigDecimal.ZERO);

            System.out.println("-------------------------------------");
            System.out.println("Conto Bancario 1: " + cb1.generateIban());
            System.out.println("Saldo iniziale " + cb1.getSaldo() + " euro");
            
            // Effettua un deposito di 1000€
            cb1.deposita(new BigDecimal("1000"));
            System.out.println("Deposito effettuato: +1000 euro");
         
            // Effettua un prelievo di 600€
            cb1.preleva(new BigDecimal("600"));
            System.out.println("Prelievo effettuato: -600 euro");
            System.out.println("Saldo dopo prelievo: " + cb1.getSaldo() + " euro");
        } else {
            System.out.println("IBAN non valido!");
        }

        scanner.close();
    }

    public static boolean isValidIban(String iban) {
        iban = iban.replace(" ", "").toUpperCase();
        
        // Verifica lunghezza e prefisso
        if (iban.length() != 27 || !iban.startsWith("IT")) {
            return false;
        }
        
        // Verifica che i caratteri siano validi
        for (int i = 2; i < iban.length(); i++) {
            char c = iban.charAt(i);
            if (i == 4) { // 5° carattere (pos 4) deve essere una lettera
                if (!Character.isLetter(c)) {
                    return false;
                }
            } else { // Tutti gli altri devono essere cifre
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}


//   ContoBancario cb1 = new ContoBancario(ibanInserito, BigDecimal.ZERO);

//         System.out.println("-------------------------------------");
//         System.out.println("Conto Bancario 1: " + cb1.generateIban());
//         System.out.println("Saldo iniziale " + cb1.getSaldo() + " euro");
            
//         // Effettua un deposito di 1000€
//         cb1.deposita(new BigDecimal("1000"));
//         System.out.println("Deposito effettuato: +1000 euro");
     
//         // Effettua un prelievo di 600€
//         cb1.preleva(new BigDecimal("600"));
//         System.out.println("Prelievo effettuato: -600 euro");
//         System.out.println("Saldo dopo prelievo: " + cb1.getSaldo() + " euro");


