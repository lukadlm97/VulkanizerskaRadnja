package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {
	
	AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Tigar");
		
		assertEquals("Tigar", a.getMarkaModel());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjakKaraktera() {
		a.setMarkaModel("ti");
	}
	
	// trebao bi po logici da baci exeption, ali ga ne baca jer nisu ispunjena oba uslova, tako je to greska u logic (treba da bude ||)
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVanOpsegaManifest() {
		a.setPrecnik(11);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVanOpsegaManifest2() {
		a.setPrecnik(25);
	}
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(18);
		
		assertEquals(18, a.getPrecnik());
	}
	
	@Test
	public void testSetSirina() {
		a.setSirina(140);
		
		assertEquals(140, a.getSirina());
	}
	
	// trebao bi da baca exeption po logici, ali ga ne baca je nije u isto vreme i manje i vece od intervala (isprvaka je ||)
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManifest() {
		a.setSirina(14);
	}
	
	// trebao bi da baca exeption po logici, ali ga ne baca je nije u isto vreme i manje i vece od intervala (isprvaka je ||)
		@Test (expected = java.lang.RuntimeException.class)
		public void testSetSirinaManifest2() {
			a.setSirina(400);
		}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVanOpsegaIspod() {
		a.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVanOpsegaIznad() {
		a.setVisina(150);
	}
	
	@Test
	public void testSetVisina() {
		a.setVisina(75);
		
		assertEquals(75, a.getVisina());
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		assertEquals("AutoGuma [markaModel=" + "Tigar" + ", precnik=" + 15 + ", sirina=" + 150 + ", visina=" + 50 + "]", a.toString());
	}
	

	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(15);
		a2.setSirina(150);
		a2.setVisina(50);
		
		assertTrue(a.equals(a2));
	}
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(150);
		a.setVisina(50);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Vintera");
		a2.setPrecnik(15);
		a2.setSirina(150);
		a2.setVisina(50);
		
		assertFalse(a.equals(a2));
	}
}
