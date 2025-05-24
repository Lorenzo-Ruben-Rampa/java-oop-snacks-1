import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Lorenzo", "Rampa", 32); 
        
        System.out.println("-------------------------------------");
        System.out.println("Studente 1: " + s1.getData());
    
        ContoBancario cb1 = new ContoBancario(new String("IT"), BigDecimal.ZERO);

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
    }

}
