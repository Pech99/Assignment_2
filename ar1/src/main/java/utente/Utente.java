package utente;

/**
 * questa classe implementa un sistema di utenti per l'applicativo
 */
public class Utente {
	private String username;
	private String password;
	
	/**
	 * 
	 * @param u
	 * @param p
	 */
	public Utente(String u, String p) {
		this.username = u;
		this.password = p;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getUsername(){
		return this.username;
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword(){
		return this.password;
	}
		
}
