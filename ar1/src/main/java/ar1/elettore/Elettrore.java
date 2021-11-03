package ar1.elettore;
import java.util.*;

/*
 * ho pensato all'oggetto utente come un oggetto statico.
 * per la realizzaione della classe mi sono basato su un
 * esempio che aveva fatto a lezione di Prog II Santini, 
 * vove costruiva un oggetto NutitionFact.
 * in questa cartella carico anche il codice di quella classe,
 * in modo tale che si possa confrontare. per evitare conflitti,
 * cambio l'estensione, quindi il nome del file sarà "NutritionFacts.txt"
 */

/**
 * <p>
 *      questa classe implemente l'oggetto Elettore e tutti i suoi metodi.
 *      questo oggetto è adibito a contenere i dati dell'utente.
 * </p>
 * 
 * <p>
 *   l'oggetto è immutabile e contiene i seguenti campi:
 *   <ul>
 *      <li>nome: nome dell'utente</li>
 *      <li>cognome: cognome dell'utente</li>
 *      <li>dataDiNascita: data di nascita dell'utente</li>
 *      <li>mail: mail dell'utente</li>
 *      <li>residenza: città di residenza dell'utente</li>
 *      <li>
 *          accessToken: tocken di accesso ai dati dell'utente. una volta confermata
 *          l'identità dell'utente tramite username e password, il server genera un 
 *          tocken di accesso, con il quale è possibile accedere ai dati dell'utente
 *          nella singola sessione. grazie al tocken è possibile votare e accedere ai
 *          dati dell'account, semplicemente evita l'utilizzo ripetuto dell'username
 *          e password. aggiunge anche uno strato in più per garantire l'anomnimato
 *          dell'elettore.
 *      </li>
 *   </ul>
 * </p>
 * <p>
 *      tutti i campi sono osservabili con i relativi metodi get.
 * </p>
 */
public class Elettrore {
    
    private final String nome;                            //nome dell'utente
    private final String cognome;                         //cognome dell'utente
    private final String dataDiNascita;                   //data di nascita dell'utente
    private final String mail;                            //mail dell'utente
    private final String residenza;                       //città di residenza dell'utente
    
    private final String accessToken;                     //tocken di accesso ai dati dell'utente

    public static class Builder {
        //campi obbligatori
        private final String nome;
        private final String cognome;
        private final String dataDiNascita;

        //campi opzionali
        private String mail = "";
        private String residenza = "";
        private String accessToken = "";

        /**
         * istanzia un nuovo oggetto utente contenente le informazioni minime.
         * @param nome nome dell'utente
         * @param cognome cognome dell'utente
         * @param dataDiNascita data di nascita dell'utente
         */
        public Builder(String nome, String cognome, String dataDiNascita){
            this.nome = nome;
            this.cognome = cognome;
            this.dataDiNascita = dataDiNascita;
        }

        /**
         * imposta la mail all'oggetto utente che si sta creando
         * @param mail da assegnare all'utente
         * @return this
         */
        public Builder mail(String mail){
            this.mail = mail;
            return this;
        }

        /**
         * imposta la residenza all'oggetto utente che si sta creando
         * @param residenza da assegnare all'utente
         * @return this
         */
        public Builder residenza(String residenza){
            this.residenza = residenza;
            return this;
        }

        /**
         * imposta il tocken di accesso all'oggetto utente che si sta creando
         * @param accessToken da assegnare all'utente
         * @return this
         */
        public Builder accessToken(String accessToken){
            this.accessToken = accessToken;
            return this;
        }

        /**
         * chiude l'oggetto utente non permettendone più la mofica
         * @return utente.Utente
         */
        public Elettrore build() {
            return new Elettrore(this);
        }
    }

    private Elettrore(Builder builder) {
        nome = builder.nome;
        cognome = builder.cognome;
        dataDiNascita = builder.dataDiNascita;
        mail = builder.mail;
        residenza = builder.residenza;
        
        accessToken = builder.accessToken;
    }

    /**
     * crea un'oggetto utente contenete i dati dell'utente collegati agli username e password passati come parametri.
     * @param user username dell'account interessato.
     * @param pass password dell'account interessato.
     * @throws userNotFoundException quando l'utente non è presente nel database o l'username e password non corrispondono.
     */
    public Elettrore(String user, String pass) throws userNotFoundException{
        //TODO: implementare userNotFoundException.
        //TODO: collegarsi al DB, caricare i dati e riempire un oggetto vuoto.
    }

    //TODO: metodi get
    //TODO: toString, equals, clone, hashcode
    
    public String toString() {
        return "";
    }

    public boolean equals() {
        return true;
    }
    
}
