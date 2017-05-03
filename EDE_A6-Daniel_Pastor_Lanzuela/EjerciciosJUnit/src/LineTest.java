import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class LineTest {

	double delta = 0.001;
	Line theLine;
	
	double x0=1,x1=3,y0=2,y1=4;
	
	@Before
	public void setUp()
	{
		theLine= new Line(1,2,3,4);
		
	}
	
	// claculate de slo`pe of the line@Test
	public void testgetSlope(){
		
		 double valorReal =theLine.getSlope();
		 double valorEsperado = (4 - 2) / (3 - 1);
		 
		 assertEquals(valorEsperado, valorReal,delta);
	}
	
	


	@Test
	public void  testgetDistance(){
		
		double valorReal = theLine.getDistance();
		double valorEsperado = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
		assertEquals(valorEsperado, valorReal,delta);
		
	}
	
	@Test
	public void testparallelTo(){
		
		Line theLine2;
		theLine2 = new Line(1,2,3,4);
		boolean valorReal = theLine.parallelTo(theLine2);
		assertTrue(valorReal);
		
		
	}
}
