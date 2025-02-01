package assignment;

import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    public Person(String name, Integer age) {
        this(name, age, null);
    }

    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    public boolean hasOldDog() {
        return dog.filter(d -> d.getAge() >= 10).isPresent();
    }

    public void changeDogsName(String newName) {
        dog.orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"))
                .setName(newName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<Dog> getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = Optional.ofNullable(dog);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && age.equals(person.age) && dog.equals(person.dog);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", dog=" + dog.orElse(null) + '}';
    }
}
