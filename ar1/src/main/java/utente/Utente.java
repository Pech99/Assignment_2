package utente;

/**
 * 	<p>
 * 		questa classe implementa il sistema di utenti per l'applicativo.
 * 		l'oggetto Utente è un oggetto generico in grado di contenere i dati
 * 		minimali delgi utenti.
 * 		il suo scopo principale è quello di fornire una base di partenza 
 * 		comune per tutti i tipi differenti di utenti da implementare nell'applicativo.
 * 		pertanto il set di campi e metodi è minimale.
 * 	</p>
 * 	<p>
 * 		<ul>
 * 			<li>Username: nome utente dell'utente</li>
 * 			<li>Password: password dell'utente</li>
 * 		</ul>
 * 	</p>
 */
public class Utente {
	private String username;
	private String password;
	
	/**
	 * restituisce un nuovo oggetto Utente, contnente i dati passati come parametri.
	 * @param u username dell'utente.
	 * @param p password dell'utente.
	 */
	public Utente(String u, String p) {
		this.username = u;
		this.password = p;
	}
	
	/**
	 * restituise l'username dell'utente sul quale è stato invocato.
	 * @return username dell'utente.
	 */
	public String getUsername(){
		return this.username;
	}

	/**
	 * restituise la password dell'utente sul quale è stato invocato.
	 * @return password dell'utente.
	 */
	public String getPassword(){
		return this.password;
	}
		
}
