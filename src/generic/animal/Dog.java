package generic.animal;

public class Dog extends Animal{

    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void sound() {
        System.out.println("월월");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
