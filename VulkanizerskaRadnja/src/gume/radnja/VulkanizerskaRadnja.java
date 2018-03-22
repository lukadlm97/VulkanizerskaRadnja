package gume.radnja;

/**
 * Klasa koja predstavlja vulkanizersku radnju.
 * 
 * @author Luka Radovanovic
 * @version 1.0
 */
import java.util.LinkedList;

import gume.AutoGuma;

public class VulkanizerskaRadnja {
	/**
	 * Gume koje predstavljaju asortiman vulkanizerske radnje.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	/**
	 * Metoda koja dodaje novu vrednost u asortiman vulkanizerske radnje.
	 * @param a ima vrednost gume koja se dodaje
	 * @throws java.lang.RuntimeException ako guma vec postoji u asortimanu
	 * @throws java.lang.NullPointerException ako je prosledjni parametar za gumu null
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * Metoda koja na osnovu marke modela prikazuje sve modele guma iz asortimana vulkanizerske radnje.
	 * @param markaModel predstavlja marku koja se trazi u asortimanu
	 * @return modele u asortimanu kao LinkedList ili null ukoliko je prosledjena marka null
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for(int i=0;i<gume.size();i++)
		if (gume.get(i).getMarkaModel().equals(markaModel))
			novaLista.add(gume.get(i));
		return novaLista;
	}
	
	
	public LinkedList<AutoGuma> getGume() {
		return gume;
	}
	
	
	
}
