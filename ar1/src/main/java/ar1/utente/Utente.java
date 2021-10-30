package ar1.utente;
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
 *      questa classe implemente l'oggetto utente e tutti i suoi metodi.
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
 *      </li>
 *          permessi: lista di permessi dell'utente. agli utenti con ruoli organizzativi
 *          ed amministrativi, sono asociati dei permessi (creare votazioi, aprire sessioni
 *          di voto, chiudere sessioni di voto, generare i risultati finali...). questi
 *          permessi sono memorizzati nel campo peressi. ogni permesso è identificato da
 *          una chiave String e da un valore Object.
 *          vengono scaricati all'accesso all'applicazione solo per agioni di efficenza,
 *          perchè il DB dovrebbe efetuare un controllo sui permessi dell'utente prima
 *          di procedere ad aplicare gli effetti della richiesta efetuata da esso.
 *      </li>
 *   </ul>
 * </p>
 * <p>
 *      tutti i campi sono osservabili con i relativi metodi get.
 * </p>
 */
public class Utente {
    
    private final String nome;                            //nome dell'utente
    private final String cognome;                         //cognome dell'utente
    private final String dataDiNascita;                   //data di nascita dell'utente
    private final String mail;                            //mail dell'utente
    private final String residenza;                       //città di residenza dell'utente
    
    private final String accessToken;                     //tocken di accesso ai dati dell'utente
    private final Hashtable<String, Object> permessi;     //lista di permessi dell'utente sull'applicazione
    
    public static class Builder {
        //campi obbligatori
        private final String nome;
        private final String cognome;
        private final String dataDiNascita;

        //campi opzionali
        private String mail = "";
        private String residenza = "";
        private String accessToken = "";
        private Hashtable<String, Object> permessi;

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

            this.permessi = new Hashtable<String, Object>();
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
         * aggiunge un permesso all'oggetto utente che si sta creando
         * @param name nome del permesso
         * @param perm valore del permesso
         * @return this
         */
        public Builder addPerm(String name, Object perm){
            this.permessi.put(name, perm);
            return this;
        }

        /**
         * chiude l'oggetto utente non permettendone più la mofica
         * @return utente.Utente
         */
        public Utente build() {
            return new Utente(this);
        }
    }

    private Utente(Builder builder) {
        nome = builder.nome;
        cognome = builder.cognome;
        dataDiNascita = builder.dataDiNascita;
        mail = builder.mail;
        residenza = builder.residenza;
        
        accessToken = builder.accessToken;
        permessi = builder.permessi;
    }

    /**
     * crea un'oggetto utente contenete i dati dell'utente collegati agli username e password passati come parametri.
     * @param user username dell'account interessato.
     * @param pass password dell'account interessato.
     * @throws userNotFoundException quando l'utente non è presente nel database o l'username e password non corrispondono.
     */
    public Utente(String user, String pass) throws userNotFoundException{
        //TODO: implementare userNotFoundException.
        //TODO: collegarsi al DB, caricare i dati e riempire un oggetto vuoto.
    }

    //TODO: metodi get
    //TODO: toString, equals, clone, hashcode
    
    public String toString() {
        return "";
    }

    public bool equals() {
        return "";
    }
    
}
