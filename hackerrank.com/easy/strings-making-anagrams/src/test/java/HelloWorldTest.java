import org.junit.*;

import static org.junit.Assert.*;

public class HelloWorldTest {
	private HelloWorld hello = null;
	private String string1 = null;
	private String string2 = null;

	@Before
	public void setup(){
		hello = new HelloWorld();
	}

	@Test
	public void check_1_letter(){
		string1 = "a";
		string2 = "a";
		assertEquals(0, hello.numberNeeded(string1, string2));
	}

	@Test
	public void check_2_letter(){
		string1 = "ba";
		string2 = "ac";
		assertEquals(2, hello.numberNeeded(string1, string2));
	}

	@Test
	public void check_3_letter(){
		string1 = "cde";
		string2 = "abc";
		assertEquals(4, hello.numberNeeded(string1, string2));
	}

	@Test
	public void check_4_letter(){
		string1 = "bacdc";
		string2 = "dcbad";
		assertEquals(2, hello.numberNeeded(string1, string2));
	}


}
