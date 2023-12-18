package security.indentity;

public class Administrator extends User {

    public Administrator(int id, String name, String surname) {
        super(id, name, surname, Administrator.class.getName());
    }
}
