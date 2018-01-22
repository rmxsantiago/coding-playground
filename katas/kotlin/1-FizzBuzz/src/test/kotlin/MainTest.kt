import org.junit.Assert.*
import org.junit.Test

class MainTest {
	var input : Int = 0
	var expected : String = ""
	var result : String = ""
                
	@Test
	fun `FizzBuzz of 1 == 1`(){
		//given
		input = 1
		expected = "1"
		
		//then
		result = fizzBuzzOf(input)
		
		//result
		assertEquals(expected, result)
	}
	
	@Test
	fun `FizzBuzz of 2 == 2`(){
		//given
		input = 2
		expected = "2"
		
		//then
		result = fizzBuzzOf(input)
		
		//result
		assertEquals(expected, result)
	}
   
	@Test
	fun `FizzBuzz of 3 == Fizz`(){
		//given
		input = 3
		expected = "Fizz"
		
		//then
		result = fizzBuzzOf(input)
		
		//result		
		assertEquals(expected, result)
	}
	
	@Test
	fun `FizzBuzz of 5 == Buzz`(){
		//given
		input = 5
		expected = "Buzz"
		
		//then
		result = fizzBuzzOf(input)
		
		//result		
		assertEquals(expected, result)
	}

	@Test
	fun `FizzBuzz of 9 == Fizz`(){
		//given
		input = 9
		expected = "Fizz"
		
		//then
		result = fizzBuzzOf(input)
		
		//result		
		assertEquals(expected, result)
	}
	
	@Test
	fun `FizzBuzz of 10 == Buzz`(){
		//given
		input = 10
		expected = "Buzz"
		
		//then
		result = fizzBuzzOf(input)
		
		//result		
		assertEquals(expected, result)
	}
	
	@Test
	fun `FizzBuzz of 15 == FizzBuzz`(){
		//given
		input = 15
		expected = "FizzBuzz"
		
		//then
		result = fizzBuzzOf(input)
		
		//result		
		assertEquals(expected, result)
	}


	@Test
	fun `FizzBuzz of numbers from 1 to 100`(){
		println("*** FizzBuzz Results ***")
		for (i in 1..100) println(fizzBuzzOf(i))
	}

}
