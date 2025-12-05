public class Salesperson extends Employee{
    public Salesperson (String name, String id, double baseSalary){
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary()*1.10;
    }
}
