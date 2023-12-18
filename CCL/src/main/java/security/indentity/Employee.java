package security.indentity;

public class Employee extends User {


    public Employee(int id, String name, String surname) {
        super(id, name, surname, Employee.class.getName());
    }
}
