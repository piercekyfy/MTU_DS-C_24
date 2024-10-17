import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import Lab_6.*;

public class Lab6 {

    @ParameterizedTest()
    @CsvSource({"0,1", "1,1", "4,24","8,40320"})
    public void correct_factorial_recursive(int n, int expected) {
        assertEquals(Factorial.recursive(n), expected);
    }
}
