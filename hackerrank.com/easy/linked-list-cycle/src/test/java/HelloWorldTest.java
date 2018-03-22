import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
	private HelloWorld hello = null;

	@Before
	public void setup(){
		hello = new HelloWorld();
	}

	@Test
	public void check_2_element_no_cycle(){
		HelloWorld.Node n1 = new HelloWorld.Node();
		HelloWorld.Node n2 = new HelloWorld.Node();
		n1.next = n2;

		assertEquals(false, hello.hasCycle(n1));
	}

	@Test
	public void check_2_element_cycle(){
		HelloWorld.Node n1 = new HelloWorld.Node();
		HelloWorld.Node n2 = new HelloWorld.Node();
		n1.next = n2;
		n2.next = n1;

		assertEquals(true, hello.hasCycle(n1));
	}

	@Test
	public void check_3_element_cycle(){
		HelloWorld.Node n1 = new HelloWorld.Node();
		HelloWorld.Node n2 = new HelloWorld.Node();
		HelloWorld.Node n3 = new HelloWorld.Node();
		n1.next = n2;
		n2.next = n3;
		n3.next = n2;

		assertEquals(true, hello.hasCycle(n1));
	}

	@Test
	public void check_2_element_no_cycle_recursive(){
		HelloWorld.Node n1 = new HelloWorld.Node();
		HelloWorld.Node n2 = new HelloWorld.Node();
		n1.next = n2;

		assertEquals(false, hello.hasCycleRecursive(n1));
	}

	@Test
	public void check_2_element_cycle_recursive(){
		HelloWorld.Node n1 = new HelloWorld.Node();
		HelloWorld.Node n2 = new HelloWorld.Node();
		n1.next = n2;
		n2.next = n1;

		assertEquals(true, hello.hasCycleRecursive(n1));
	}


}
