import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class LineTest {

	
	private  double x0=2;
	private  double y0=5;
	private  double x1=2;
	private double y1=5;
	
	@Test
	public void testgetSlope(){
		double delta= 0.0001;
		double resultado = Line.getSlope();
		double esperado = 0;
		assertEquals(esperado, resultado, delta);
	}
	
	
	@Test
	public void  testgetDistance(){
	
		
		
	}
	
	@Test
	public void testparallelTo(){
		
	}
}
