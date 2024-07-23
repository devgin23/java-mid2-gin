package generic.animal;

public class Cat extends Animal{
    public Cat(String name, int size) {
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
        System.out.println("냐옹");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
