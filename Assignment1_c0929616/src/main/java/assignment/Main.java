package assignment;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jagga", 30);
        try {
            person1.changeDogsName("Mamu");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }

        Dog dog = new Dog("Bhai", 12);
        Person person2 = new Person("Jammu", 25, dog);

        System.out.println(person2.getName() + " has a dog named " + person2.getDog().get().getName());
        System.out.println(person2.hasOldDog() ? "The dog is old" : "The dog is young");

        person2.changeDogsName("Rekha");
        System.out.println("After changing, the dog's name is " + person2.getDog().get().getName());
    }
}
