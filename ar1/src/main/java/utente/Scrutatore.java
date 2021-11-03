package utente;

/**
 * 
 */
public class Scrutatore extends Utente {
	
	private String IDimpiegato;
	
	/**
	 * 
	 * @param IDimpiegato
	 * @param username
	 * @param password
	 */
	public Scrutatore (String IDimpiegato, String username, String password) {
		super(username, password);
		this.IDimpiegato = IDimpiegato;
	}
}