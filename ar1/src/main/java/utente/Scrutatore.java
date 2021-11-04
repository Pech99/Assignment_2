package utente;

/**
 * 	<p>
 * 		La classe Scrutatore raccoglie tutti i dati dell'utente in grado di creare, aprire e chiudere votazioni.
 * 		questa classe estende Utente, aggiungendo altri campi e metodi utili a rappresentare questo tipo di utenza.
 * 	</p>
 * 	<p>
 * 		<ul>
 * 			<li>IDimpiegato: codice identificativo dell'impiegato.</li>
 * 		</ul>
 * 	</p>
 * 	<p>
 * 		tutti i campi sono privati, quindi accessibili dai metodi get.
 * 	</p>
 * 
 */
public class Scrutatore extends Utente {
	
	private String IDimpiegato;
	
	/**
	 * restituisce un nuovo oggetto Scrutatore, contnente i dati passati come parametri.
	 * @param IDimpiegato
	 * @param username
	 * @param password
	 */
	public Scrutatore (String IDimpiegato, String username, String password) {
		super(username, password);
		this.IDimpiegato = IDimpiegato;
	}

	public String getIDimpiegato(){
		return this.IDimpiegato;
	}

	public String toString(){
		return "{Scrutatore:[User:"+this.getUsername()+"], [ID:"+this.IDimpiegato+"]}";
	}
}