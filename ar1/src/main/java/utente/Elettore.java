package utente;

/**
 * 
 */
public class Elettore extends Utente {
		 
	private String nome;
	private String dataDiNascita;
	
	/**
	 * 
	 * @param nome
	 * @param dataDiNascita
	 * @param username
	 * @param password
	 */
	public Elettore (String nome, String dataDiNascita, String username, String password) {
		super(username, password);
		this.dataDiNascita = dataDiNascita;
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNome(){
		return this.nome;
	}

	/**
	 * 
	 * @return
	 */
	public String getDataDiNascita(){
		return this.dataDiNascita;
	}

}