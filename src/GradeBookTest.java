import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
    private GradeBook gradebook1;
    private GradeBook gradebook2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		gradebook1=new GradeBook(5);
		gradebook2=new GradeBook(5);
		
		//adding scores to gradebook1
		
	gradebook1.addScore(121.0);
	gradebook1.addScore(151.0);
	
	//adding scores to gradebook2
	gradebook2.addScore(323.4);
	gradebook2.addScore(544);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1=null;
		gradebook2=null;
	}

	@Test
	void testAddScore() {
	      String expectedString = "121 151";
	        
	        // Get the actual string representation of the GradeBook object
	        String actualString = gradebook1.toString();
	        
	        // Test if the actual string representation matches the expected string representation
	        assertTrue(expectedString.equals(actualString), "Incorrect string representation of GradeBook object after adding scores");
            assertEquals(2,gradebook1.getScoreSize(),"Incorrect number of scores");
	}

	@Test
	void testSum() {
		assertEquals(272.0,gradebook1.sum(),.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(121,gradebook1.minimum(),.001);
		assertEquals(323.4,gradebook2.minimum(),.001);;
	}

	@Test
	void testFinalScore() {
		assertEquals(151,gradebook1.finalScore(),"Unavailable");
		assertEquals(544,gradebook2.finalScore(),"Unavailable");
	}

	
}
