import org.junit.*;

import static org.junit.Assert.*;

public class HelloWorldTest {
	private HelloWorld hello = null;
	private int arraySize;
	private int[] array;
	private int[] result;
	private int rotations;

	@Before
	public void setup(){
		hello = new HelloWorld();
	}

	@Test
	public void arrayNotNull(){
		assertNotNull(hello.arrayLeftRotation(null, 0, 0));
	}

	@Test
	public void rotate_1_with_2_elements(){
		arraySize = 2;
		rotations = 1;
		array = new int[]{1,2};
		result = hello.arrayLeftRotation(array, arraySize, rotations);

		assertArrayEquals(new int[]{2,1}, result);
  }

	@Test
	public void rotate_1_with_5_elements(){
		arraySize = 5;
		rotations = 1;
		array = new int[]{1,2,3,4,5};
		result = hello.arrayLeftRotation(array, arraySize, rotations);

		assertArrayEquals(new int[]{2,3,4,5,1}, result);
  }

	@Test
	public void rotate_2_with_5_elements(){
		arraySize = 5;
		rotations = 2;
		array = new int[]{1,2,3,4,5};
		result = hello.arrayLeftRotation(array, arraySize, rotations);

		assertArrayEquals(new int[]{3,4,5,1,2}, result);
  }
}
