package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    //1
    private Stack stack;

    //2
    @BeforeEach
    public void init(){
        stack = new Stack();
    }

    //3
    @Test
    public void Stack_isEmpty_returnTrue(){
        //4
        boolean actual = stack.isEmpty();
        //5
        assertTrue(actual, "For new stack should be true");
    }

    @Test
    public void Stack_pushObject_shouldNotBeEmpty(){
        stack.pushObject(5);
        boolean actual = stack.isEmpty();
        assertFalse(actual, "after pushing stack is not empty");
    }

    @Test
    public void Stack_pushAndPopObject_shouldNotBeEmpty(){
        stack.pushObject(4);
        stack.popObject();
        assertTrue(stack.isEmpty(), "After push and pop, stack should be empty");
    }

    @Test
    public void Stack_pushAndPopCompare_shouldReturnTrue(){
        stack.pushObject(4);
        Object actual = stack.popObject();
        assertEquals(4, actual, "pop should return the last Object");
    }

    @Test
    public void Stack_pushPopMultipleElement_ShouldReturnCorect(){
        stack.pushObject(1);
        stack.pushObject(2);
        stack.pushObject(3);
        assertEquals(3, stack.popObject(), "should return the last element");
        assertEquals(2, stack.popObject(), "should return the last element");
        assertEquals(1, stack.popObject(), "should return the last element");

    }

    @Test
    public void Stack_popEmptyStack_shouldThrowExeption(){
        assertThrows(IllegalStateException.class, ()-> {
            stack.popObject();
        });
    }

    @Test
    public void Stack_pushObjectTopElement_shouldNotBeEmpty(){
        stack.pushObject(4);
        stack.topObject();
        assertFalse(stack.isEmpty(), "top method should return false");
    }

    @Test
    public void Stack_pushMultipleObjectsCallTop_shouldReturnLastObject(){
        stack.pushObject(1);
        stack.pushObject(2);
        stack.pushObject(3);
        Object actual = stack.topObject();
        assertEquals(3, actual, "Top should return the last element");
    }

    @Test
    public void Stack_pushObjectCallTopMultipleTimes_ShouldReturnSameObject(){
        stack.pushObject(1);
        Object expected = 1;
        for(int i = 0; i<3; i++){
            assertEquals(expected, stack.topObject(), "Should return the last element");
        }
    }

    @Test
    public void Stacj_topEmptyStack_ShouldThrowExeption(){
        assertThrows(IllegalStateException.class, () -> {
            stack.topObject();
        });
    }

    @Test
    public void Stack_pushNullObject_ShouldIsNotEmpty() {
        stack.pushObject(null);
        assertFalse(stack.isEmpty(), "Should return is false");
    }

    @Test
    void Stack_pushNullPop_shouldReturnNull() {
        stack.pushObject(null);
        assertNull(stack.popObject(), "should return null");
        assertTrue(stack.isEmpty(), "should return true");
    }

    @Test
    void Stack_pushNullTop_shouldReturnNull() {
        stack.pushObject(null);
        assertNull(stack.topObject(), "should return null");
        assertFalse(stack.isEmpty(), "should return false");
    }
}