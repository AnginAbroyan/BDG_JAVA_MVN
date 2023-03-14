package inherance_abstract_association.association.ex5;


//Aggregation
public class Bank {
    public int countEmployee;
    public String department;
    public String name;

    private Employee employee;

    public Bank(Employee employee){
        this.employee = employee;
    }
}
