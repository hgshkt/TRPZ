package security.indentity;

public abstract class User {
    private int id;
    private String name;
    private String surname;

    protected String userType;

    public User(int id, String name, String surname, String userType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserType() {
        return userType;
    }
}
