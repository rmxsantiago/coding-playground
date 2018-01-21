import org.junit.Assert.*
import org.junit.Test

class MainTest {
   @Test
   fun helloWorld(){      
      //given
      val result = returnHelloWorld()  
      //then
      assertEquals(result, "Hello,World!")
   }
}
