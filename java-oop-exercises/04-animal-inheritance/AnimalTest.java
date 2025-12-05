public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("Ronaldo", 2);
        Dog d = new Dog("Mel", 4);
        Cat c = new Cat("Pitico", 3);
        System.out.println(c.getName());
        System.out.println(d.getName());
        System.out.println(a.getName());
        System.out.println(d.getAge());
        System.out.println(a.makeSound());
        System.out.println(d.makeSound());
        System.out.println(c.makeSound());
    }
}
