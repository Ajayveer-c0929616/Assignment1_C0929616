package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DogTest {

    @Test
    public void testDogCreation() {
        Dog dog = new Dog("Fufa", 3);
        assertEquals("Fufa", dog.getName(), "Dog's name should match");
        assertEquals(3, dog.getAge(), "Dog's age should match");
    }
}
