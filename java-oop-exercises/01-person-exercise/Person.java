public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        setName(name);
        setAge(age);
        setId(id);
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    } public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public String getId() {
        return id;
    } public void setId(String id) {
        this.id = id;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
