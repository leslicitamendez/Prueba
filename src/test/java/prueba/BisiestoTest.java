package prueba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BisiestoTest {
	
	Bisiesto bi;
	
	@Before
	public void setUp()
	{
		bi = new Bisiesto();
	}

	@Test
	public void ingresaNumeroPositivo() {
		bi.setAnho(2011);
		assertEquals(2011, bi.getAnho());
	}

    @Test
    public void testCambiarAnio() {
            bi = new Bisiesto(2011);
            bi.setAnho(1999);
            assertEquals(1999, bi.getAnho());
    }
    
    @Test
    public void esAnhoBisiesto()
    {
    	bi = new Bisiesto(2012);
    	assertEquals(true, bi.esAnhoBisiesto());
    }

    @Test
    public void noEsAnhoBisiesto() {
            bi = new Bisiesto(1853);
            assertEquals(false, bi.esAnhoBisiesto());
    }
}
