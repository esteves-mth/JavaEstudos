public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    } public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    } public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    } public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    } public void setPrice(double price) {
        this.price = price;
    }

    public int calculateCarAge(){
        return (java.time.Year.now().getValue() - getYear());
    }

    public boolean isVintage(){
        return (this.getYear() > 20);
    }

    public double calculateDepreciation(){
        return (getPrice()*(Math.pow(calculateCarAge(), 0.85)));
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() + '\'' +
                ", age=" + calculateCarAge() + '\'' +
                ", vintage? " + isVintage() + '\'' +
                ", price= " + calculateDepreciation() +
                '}';
    }
}
