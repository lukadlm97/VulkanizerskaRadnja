package gume;
/**
 *Klasa koja predstavlja auto gumu.
 * 
 * 
 * @author Luka Radovanovic
 * @version 1.0
 */


public class AutoGuma {
	/**
	 * Marka modela auto gume.
	 */
	private String markaModel = null;
	/**
	 * Precnik modela auto gume.
	 */
	private int precnik = 0;
	/**
	 * Sirina modela auto gume.
	 */
	private int sirina = 0;
	/**
	 * Visina modela auto gume.
	 */
	private int visina = 0;
	/**
	 * Vraca vrednost marke modela gume.
	 * @return marku modela gume kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * Postavlja novu vrednost za marku modela.
	 * @param markaModel ima vrednost za marku modela
	 * @throws java.lang.RuntimeException ako je uneta marka modela null ili 
	 * String kraci od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	*Vraca vrednost precnika modela gume.
	*@return precnik modela gume kao Integer
	*/
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Postavlja novu vrednost za precnik modela gume.
	 * @param precnik ima vrednost precnika modela gume
	 * @throws java.lang.RuntimeException ako je unet precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Vraca vrednost sirine modela gume.
	 * @return sirinu modela gume kao Integer
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Postavlja novu vrednost za sirinu modela gume.
	 * @param sirina ima vrednost sirine modela gume
	 * @throws java.lang.RuntimeException ako je uneta sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Vraca vrednost visine modela gume.
	 * @return visinu modela gume kao Integer
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja novu vrednost za visinu modela gume.
	 * @param visina ima vrednost visine gume
	 * @throws java.lang.RuntimeException ako je uneta visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina=" + visina + "]";
	}
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
		return false;
	} else if (!markaModel.equals(other.markaModel))
		return false;
	if (precnik != other.precnik)
		return false;
	if (sirina != other.sirina)
		return false;
	if (visina != other.visina)
		return false;
		return true;
	}
}
