public class Manager extends Employee{

    public Manager (String name, String id, double baseSalary){
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary()*1.20;
    }
}
