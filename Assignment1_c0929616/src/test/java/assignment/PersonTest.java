package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testHasOldDog() {
        Dog dog = new Dog("Mamu", 12);
        Person person = new Person("Ali", 25, dog);

        assertTrue(person.hasOldDog(), "Person should have an old dog");

        Person personWithoutDog = new Person("Babu", 40);
        assertFalse(personWithoutDog.hasOldDog(), "Person should not have a dog");
    }

    @Test
    public void testChangeDogsName() {
        Dog dog = new Dog("Rekha", 5);
        Person person = new Person("Charan", 35, dog);

        person.changeDogsName("Bhai");
        assertEquals("Bhai", dog.getName(), "Dog's name should be updated");

        Person personWithoutDog = new Person("Dev", 45);
        try {
            personWithoutDog.changeDogsName("Ram");
            fail("Exception should be thrown when changing name of a dog-less person");
        } catch (RuntimeException e) {
            assertEquals("Dev does not own a dog!", e.getMessage(), "Exception message should match");
        }
    }
}

