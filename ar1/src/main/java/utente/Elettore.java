package utente;

/**
 * 	<p>
 * 		La classe Elettore raccoglie tutti i dati dell'utente in grado di efetuare votazioni.
 * 		questa classe estende Utente, aggiungendo altri campi utili a rappresentare questo tipo di utenza.
 * 	</p>
 * 	<p>
 * 		<ul>
 * 			<li>Nome: nome dell'elettore.</li>
 * 			<li>dataDiNascita: data di nascita dell'elettore nella forma (gg/mm/aaaa).</li>
 * 		</ul>
 * 	</p>
 * 	<p>
 * 		tutti i campi sono privati, quindi accessibili dai metodi get.
 * 	</p>
 * 
 */
public class Elettore extends Utente {
		 
	private String nome;
	private String dataDiNascita;
	
	/**
	 * restituisce un nuovo oggetto Elettore, contnente i dati passati come parametri.
	 * @param nome nome dell'elettore.
	 * @param dataDiNascita data di nascita dell'elettore (gg/mm/aaaa).
	 * @param username username dell'account dell'elettore.
	 * @param password password dell'account dell'elettore.
	 */
	public Elettore (String nome, String dataDiNascita, String username, String password) {
		super(username, password);
		this.dataDiNascita = dataDiNascita;
		this.nome = nome;
	}
	
	/**
	 * restituise il nome dell'elettore sul quale `e stato invocato.
	 * @return nome dell'elettore.
	 */
	public String getNome(){
		return this.nome;
	}

	/**
	 * restituise la data di nascita dell'elettore sul quale `e stato invocato,
	 * sottoforma di stringa, nel formato (gg/mm/aaaa).
	 * @return data di nascita dell'elettore dell'elettore.
	 */
	public String getDataDiNascita(){
		return this.dataDiNascita;
	}
	
	/**
	 * Restituisce una stringa di caratteri che descrive l'Elettore
	 * rappresentato dall'oggetto che esegue il metodo.
	 * @return la stringa che rappresenta l'Elettore.
	 */
	public String toString(){
		return "{Elettore:[User:"+this.getUsername()+"], [Nome:"+this.nome+"], [Data di Nascita:"+this.dataDiNascita+"]}";
	}



}