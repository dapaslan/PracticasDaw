package JUNIT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

		Calculadora cal1;
	
			@Before
			public void antesDelTest()
			{
				cal1 = new Calculadora();
				System.out.println("Reinicinando calculadora.....");
			}
	
				
	
	
			
	
	
			@Test
			public void sumartest(){
				
				float resultado=cal1.sumar(2, 4);
				System.out.println("2 + 4 = "+ cal1.sumar(2,4));
				assertEquals("Metodo sumarTest",6.0, resultado, 0);
			}
			

			
			@Test
			public void restatest(){
				
				float resultado=cal1.restar(2, 4);
				System.out.println("2 + 4 = "+ cal1.restar(2,4));
				assertEquals("Metodo restarTest",6.0, resultado, 0);
			}
		
			
			@Test
			public void multiplicartest(){
				
				float resultado=cal1.multiplicar(2, 4);
				System.out.println("2 + 4 = "+ cal1.multiplicar(2,4));
				assertEquals("Metodo restarTest",6.0, resultado, 0);
			}
			
			@Test
			public void dividirtest(){
				
				float resultado=cal1.dividir(2, 4);
				System.out.println("2 + 4 = "+ cal1.dividir(2,4));
				assertEquals("Metodo restarTest",6.0, resultado, 0);
			}
	

}
