# Assignment1_C0929616
 
NAme: Ajayveer Singh
Id: C0929616

Assignment 1:

Description:

Dog class models a dog with name and age attributes, along with methods for accessing and modifying these attributes. It also overrides equals() and toString() for comparison and string representation.

Person class models a person who may or may not own a dog. It uses Optional<Dog> to handle cases where a person doesn't have a dog. The class provides methods to check if the dog is old (hasOldDog()), change the dog's name (changeDogsName()), and other basic getters and setters. It also overrides equals() and toString() for comparison and string representation.

Main class demonstrates the use of Person and Dog classes by creating Person objects, one with a dog and one without. It shows exception handling when trying to change a dog's name for a person without a dog.

The code uses Java's Optional class to safely handle the possibility of a person not owning a dog.

Dog tests ensure that the name and age attributes are correctly set and retrieved, and that the equals() and toString() methods work as expected.

Person tests validate the behavior of methods like hasOldDog() (checks if the person has a dog that is 10 or older) and changeDogsName() (ensures the dog's name can be changed or throws an exception if the person doesn't own a dog). Tests also check the correct behavior of getters, setters, equals(), and toString().

The tests cover scenarios for both owning a dog and not owning a dog, ensuring proper exception handling and correct functionality.
