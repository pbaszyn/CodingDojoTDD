import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorJUnitTest {

    StringCalculator calculator;

    @Test
    public void shouldReturn0ForEmptyString() {
        //given

        //when
        String result = calculator.add("");

        //then
        assertEquals("0.0",result);
    }

    @Test
    void shouldReturnSumOfMultipleNumbersWithFractionPartGiven(){
        //given

        //when
        String result = calculator.add("2.5,5.3,10,30.7,15");

        //then
        assertEquals("63.5",result);
    }

    @Test
    void shouldReturnMessageWhenDoubledSeparatingCharacterFound(){
        //given

        //when
        String result = calculator.add("2.5,5.3,\n10,30.7,15");

        //then
        assertEquals("Number expected but '\\n' found at position 8.",result);
    }
    @Test
    void shouldReturnMessageWhenDoubledSeparatingCharacterFoundRevert(){
        //given

        //when
        String result = calculator.add("2.5,5.3,10,30.7\n,15");

        //then
        assertEquals("Number expected but ',' found at position 16.",result);
    }

    @Test
    void shouldReturnMessageOnMissingNumberInLastPosition() {
        //given

        //when
        String result  = calculator.add("2.5,5.3,10,30.7,");

        //then
        assertEquals("Number expected but EOF found",result);
    }

    @Test
    void shouldReturnMessageWhenNegativeNumbersGiven() {
        //given

        //when
        String result  = calculator.add("-5,-5.2,10,2 5");

        //then
        assertEquals("Negative not allowed : -5, -5.2",result);

    }

    @Test
    void shouldReturnSumWhenCustomSeparatorIsSpecified() {
        //given

        //when
        String result = calculator.add("//;\n2.5;5.3;10;30.7;15.5");

        //then
        assertEquals("64.0",result);
    }

    @Test
    void shouldReturnErrorMessageWhenCustomSeparatorIsSpecifiedButWrongFind() {
        //given

        //when
        String result = calculator.add("//;\n2.5;5.3;10,30.7;15.5");

        //then
        assertEquals("; expected but ',' found at position 14.",result);
    }

    @Test
    void shouldReturnAllFoundedErrorsForGivenStringOfNumbers() {
        //given

        //when
        String result = calculator.add("//;\n2.5;5.3;10,30.7;15.5,");

        //then
        assertEquals("Number expected but EOF found\n; expected but ',' found at position 14.",result);
    }

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }
}
