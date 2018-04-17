import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {


	@Test
	public void testAddition() {
		Calculator a = new Calculator();

		double res = a.addition(3,7);
		assertFalse(res != 10);
	}

}