/*Snack 1:
	Contatore di Auto
Crea una classe Auto con:
Un numero di telaio (final int numeroTelaio) univoco assegnato automaticamente alla creazione.
Una variabile static int contatoreAuto per tenere traccia del numero totale di auto create.
Un modello (final String modello) assegnato al momento della creazione e non modificabile.
Ogni volta che viene creata una nuova Auto, il contatore deve aumentare e il numero di telaio 
deve essere assegnato in modo incrementale.
Implementa un metodo static int getNumeroTotaleAuto() che restituisca il numero totale di auto 
create.
Scrivi un programma che:
Crea alcune auto e stampi il loro numero di telaio e modello.
Stampi il numero totale di auto create. */

import java.util.Random;
public class Auto {

    private final int NUMERO_DI_TELAIO;
    private static int contatoreAuto = 0;
    private final String MODELLO;
    private static int nextNumeroDitelaio = 0;

    public Auto(String modello) {

        this.NUMERO_DI_TELAIO = generaNumeroDiTelaio();
        this.MODELLO = modello;
        contatoreAuto++;
    
    }

    public static int getNumeroTotaleAuto() {
        return contatoreAuto;
    }

    public static int generaNumeroDiTelaio() {

        if (nextNumeroDitelaio == 0) {
        Random ran = new Random();
        nextNumeroDitelaio = ran.nextInt(100000);
        return nextNumeroDitelaio;
        }
        return nextNumeroDitelaio++;

    }

    public int getNumeroDiTelaio() {
        return NUMERO_DI_TELAIO;
    }

    public String getModello() {
        return MODELLO;
    }
   
}
