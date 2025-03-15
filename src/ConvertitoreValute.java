/*Snack 2:
	Sistema di Conversione Valute
Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, 
GBP, JPY...) dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la 
valuta di partenza, quella di destinazione e l'importo da convertire, restituendo il valore 
convertito.
Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, 
importo) e restituire l’importo convertito. */

public class ConvertitoreValute {

    private final static double [] TASSI_DI_CAMBIO = {
        1.0, // EUR -> EUR
        1.12, // EUR -> USD
        0.86, // EUR -> GBP
        130.0, // EUR -> JPY
    };

    private final static String[] VALUTE = {
        "EUR", "USD", "GBP", "JPY"
    };

    private static double getTasso(String valuta) {
        
        for (int i = 0; i < VALUTE.length; i++) {
            if (VALUTE[i].equals(valuta)) {
                return TASSI_DI_CAMBIO[i];
            }
        }
        return -1;
    }

    public static double converti (String da, String a, double importo) {
        
        double tassoDa = getTasso(da);
        double tassoA = getTasso(a);

        if (tassoDa == -1 || tassoA == -1) {
            System.out.println("Errore: Valuta non supportata.");
            return -1;
        }

        return ((importo / tassoDa) * tassoA);
    }

}
