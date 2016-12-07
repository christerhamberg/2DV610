package view;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestView {

	private final ByteArrayInputStream  inContentR = new ByteArrayInputStream ("R".getBytes());
	private final ByteArrayInputStream  inContentF = new ByteArrayInputStream ("F".getBytes());
	private final ByteArrayInputStream  inContentU = new ByteArrayInputStream ("U".getBytes());
	private final ByteArrayInputStream  inContent1 = new ByteArrayInputStream ("1".getBytes());
	private final ByteArrayInputStream  inContent2 = new ByteArrayInputStream ("2".getBytes());
	private final ByteArrayInputStream  inContent3 = new ByteArrayInputStream ("3".getBytes());
	private final ByteArrayInputStream  inContent4 = new ByteArrayInputStream ("4".getBytes());
	private final ByteArrayInputStream  inContent5 = new ByteArrayInputStream ("5".getBytes());

	@Before
	public void setUpStreams() {
	}

	
	
	@Test
	public void testGetKbValue() {
		        
        validateKbInput(inContentR,"R");  // 'R'
        validateKbInput(inContentF,"F");  // 'F'
        validateKbInput(inContentU,"U");  // 'U'
        validateKbInput(inContent1,"1");  // '1'
        validateKbInput(inContent2,"2");  // '2'
        validateKbInput(inContent3,"3");  // '3'
        validateKbInput(inContent4,"4");  // '4'
        validateKbInput(inContent5,"5");  // '5'
		
	}
	
	private void validateKbInput (ByteArrayInputStream input, String validator){

        View view = new View ();

		System.setIn(input);
        String data = view.getKbInput();
		assertEquals (data,validator);
		
	}
	
	@After
	public void cleanUpStreams() {
		System.setIn(System.in);
	}

}
