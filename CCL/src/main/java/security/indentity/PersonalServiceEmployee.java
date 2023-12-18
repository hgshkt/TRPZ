package security.indentity;

public class PersonalServiceEmployee extends User {
    public PersonalServiceEmployee(int id, String name, String surname) {
        super(id, name, surname, PersonalServiceEmployee.class.getName());
    }
}
