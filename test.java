package sheet2;

/**
 * Foglio 2 - Esercizio 14: Crescita di un capitale nel tempo (interesse composto).
 * Calcolo dell'evoluzione periodale tramite ciclo 'for' senza librerie esterne.
 */
public class CrescitaCapitaleFor {

    public static void main(String[] args) {

        // Capitale iniziale investito
        double capitale = 1000.0;

        // Tasso di interesse periodale (es. 2% per periodo)
        double tassoPeriodo = 0.02;

        // Ciclo for su quattro periodi (da 1 a 4 compresi)
        for (int periodo = 1; periodo <= 4; periodo++) {
            // Calcolo dell'incremento (interesse maturato nel singolo periodo)
            double incremento = capitale * tassoPeriodo;

            // Aggiornamento del capitale accumulato (capitalizzazione periodica)
            capitale += incremento;

            // Stampa del valore del capitale aggiornato al termine di ciascun periodo
            System.out.println("Periodo " + periodo + " - Capitale aggiornato: " + capitale);
        }
    }
}
```[cite: 5, 7]

---

### Dettagli didattici dell'esercizio:
* **Evoluzione del montante**: a ogni iterazione, l'incremento viene calcolato sulla base del `capitale` aggiornato del periodo precedente ($C_t = C_{t-1} \cdot (1 + r)$), simulando la legge dell'interesse composto senza ricorrere a potenze o a `Math.pow`[cite: 7].
* **Controllo dell'iterazione**: il contatore `int periodo = 1; periodo <= 4; periodo++` gestisce esattamente i quattro periodi richiesti dalla traccia[cite: 7].

