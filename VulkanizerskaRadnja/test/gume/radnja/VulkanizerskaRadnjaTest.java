package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	private VulkanizerskaRadnja v;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		v = null;
	}

	@Test
	public void testDodajGumu() {
		AutoGuma a = new AutoGuma();
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		v.dodajGumu(a);
		
		LinkedList<AutoGuma> gumeURadnji = v.getGume();
		
		for(int i = 0; i < gumeURadnji.size(); i++) {
			assertTrue(a.equals(gumeURadnji.get(i)));
		}
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuSaExeptionOdSetera() {
		AutoGuma a = new AutoGuma();
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(1);
		a.setSirina(150);
		a.setVisina(50);
		
		v.dodajGumu(a);
		
	}
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		AutoGuma a = new AutoGuma();
		a = null;
		
		v.dodajGumu(a);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostojiVec() {
		AutoGuma a = new AutoGuma();
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		v.dodajGumu(a);
		AutoGuma a1 = new AutoGuma();
		
		a1.setMarkaModel("Tigar");
		a1.setPrecnik(15);
		a1.setSirina(150);
		a1.setVisina(50);
		
		v.dodajGumu(a1);
	}
	
	// Sobzirom da se u metodi poredi ceo obekat sa Stringom, ovde je izbacivana greska. U metodi je prevaceno poredjenje stringova 

	@Test
	public void testPronadjiGumuTrue() {
		AutoGuma a = new AutoGuma();
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		v.dodajGumu(a);
		AutoGuma a1 = new AutoGuma();
		
		a1.setMarkaModel("Vintera");
		a1.setPrecnik(15);
		a1.setSirina(150);
		a1.setVisina(50);
		
		v.dodajGumu(a1);
		LinkedList<AutoGuma> gume1 = v.pronadjiGumu("Tigar");
		for(int i = 0;i < gume1.size(); i++) {
			assertTrue(gume1.get(i).getMarkaModel().equals("Tigar"));
		}
		
	}

	
	@Test
	public void testPronadjiGumuFalse() {
		AutoGuma a = new AutoGuma();
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		v.dodajGumu(a);
		AutoGuma a1 = new AutoGuma();
		
		a1.setMarkaModel("Vintera");
		a1.setPrecnik(15);
		a1.setSirina(150);
		a1.setVisina(50);
		
		v.dodajGumu(a1);
		LinkedList<AutoGuma> gume1 = v.pronadjiGumu("Dunlop");
		for(int i = 0;i < gume1.size(); i++) {
			assertFalse(gume1.get(i).getMarkaModel().equals("Dunlop"));
		}
		
	}
	@Test
	public void testPronadjiGumuNull() {
		v.pronadjiGumu(null);
	}
}
