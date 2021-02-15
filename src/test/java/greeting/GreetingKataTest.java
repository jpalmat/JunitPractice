package greeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingKataTest {

    GreetingKata greetingKata = null;

    @BeforeEach
    public void init(){
        greetingKata = new GreetingKata();
    }

    @Test
    public void Greeting_simpleName_ShouldReturnGreeting(){
        String nameParameter = "Bob";
        String actual = greetingKata.name(nameParameter);
        String expected = "Hello, "+nameParameter;
        assertEquals(expected,actual, "Should return Hello, name");
    }

    @Test
    public void Greeting_HandleNull_ShouldReturnGenericGreeting(){
        String actual = greetingKata.name(null);
        String expected = "Hello, my friend";
        assertEquals(expected, actual, "Should return Hello, my friend");
    }

    @Test
    public void Greeting_StringUppercase_shouldReturnGreetingUppercase(){
        String nameParameter = "JERRY";
        String actual = greetingKata.name(nameParameter);
        String expected = "HELLO JERRY";
        assertEquals(expected, actual, "Should return Greeting uppercase");
    }

    @Test
    public void Greeting_HandleTwoName_ShouldReturnBothnames(){
        String nameOne = "Jimmy";
        String nameTwo = "Maryam";
        String actual = greetingKata.name(nameOne, nameTwo);
        String expected = "Hello, Jimmy and Maryam";
        assertEquals(expected, actual, "Should return multiple greeting");
    }

    @Test
    public void Greeting_HandleMultipleNames_ShouldReturnGreetingWithComas(){
        String nameOne = "Jimmy";
        String nameTwo = "Maryam";
        String nameThree = "Lucas";
        String actual = greetingKata.name(nameOne, nameTwo, nameThree);
        String expected = "Hello, Jimmy, Maryam, and Lucas";
        assertEquals(expected, actual, "Should return greeting with commas");
    }

    @Test
    public void greeting_MixingNormalAndUppercaseNames_shouldReturnString(){
        String nameOne = "Jimmy";
        String nameTwo = "MARYAM";
        String nameThree = "Lucas";
        String actual = greetingKata.name(nameOne, nameTwo, nameThree);
        String expected = "Hello Jimmy and Lucas. AND HELLO MARYAM";
        assertEquals(expected, actual, "Should return Special greeting");
    }
}