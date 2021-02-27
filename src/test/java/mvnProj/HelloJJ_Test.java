/**
 * 
 */
package mvnProj;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Window10
 *
 */
public class HelloJJ_Test {
	@Test
	public void testMain() {
	final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	System.setOut(new PrintStream(outContent)); //make the output go to a stream instead of
	//the console
	App.main(null); //call main in the App file
	//check if the output is "Hello LYIT!" and a new line.
	assertEquals("Hello JOMY!" + System.getProperty("line.separator"), outContent.toString());
	}

}
