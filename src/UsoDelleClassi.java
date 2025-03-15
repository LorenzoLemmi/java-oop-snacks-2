import java.util.Scanner;

public class UsoDelleClassi {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Fiat Panda");
        Auto auto2 = new Auto("BMW X5");
        Auto auto3 = new Auto("Peugeot 208");

        System.out.println("Auto 1: "+auto1.getModello()+" "+auto1.getNumeroDiTelaio());
        System.out.println("Auto 2: "+auto2.getModello()+" "+auto2.getNumeroDiTelaio());
        System.out.println("Auto 3: "+auto3.getModello()+" "+auto3.getNumeroDiTelaio());

        System.out.println("Numero totale di auto: "+Auto.getNumeroTotaleAuto());



        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la valuta di partenza (EUR, USD, GBP, JPY): ");
        String da = scanner.next().toUpperCase();

        System.out.print("Inserisci la valuta di destinazione (EUR, USD, GBP, JPY): ");
        String a = scanner.next().toUpperCase();

        System.out.print("Inserisci l'importo da convertire: ");
        double importo = scanner.nextDouble();

        double risultato = ConvertitoreValute.converti(da, a, importo);
        System.out.println("Importo convertito: " + risultato);

        scanner.close();

    }
}
