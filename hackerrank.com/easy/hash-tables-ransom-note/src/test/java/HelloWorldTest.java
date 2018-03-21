import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
	private HelloWorld hello = null;
	private String magazine = null;
	private String note = null;

	@Before
	public void setup(){

	}

	@Test
	public void check_no_repeat(){
		magazine = "give me one grand today night";
		note = "give one grand today";

		hello = new HelloWorld(magazine, note);
		assertEquals(true, hello.solve());
	}

	@Test
	public void check_1_repeat(){
		magazine = "two times three is not four";
		note = "two times two is four";

		hello = new HelloWorld(magazine, note);
		assertEquals(false, hello.solve());
	}

	@Test
	public void check_2_repeat(){
		magazine = "two times three is not four";
		note = "two times two is four two";

		hello = new HelloWorld(magazine, note);
		assertEquals(false, hello.solve());
	}


}
