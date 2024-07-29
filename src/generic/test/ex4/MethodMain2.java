package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog biggerDog = new Dog("큰 멍멍이", 200);
        Animal bigger1 = AnimalMethod.<Animal>bigger(dog, cat);
        Dog bigger2 = AnimalMethod.<Dog>bigger(dog, biggerDog);
        System.out.println("bigger1 = " + bigger1);
        System.out.println("bigger2 = " + bigger2);
    }
}
