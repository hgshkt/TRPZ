package entities.user;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;

@Entity
@Table(appliesTo = "Employee")
public class Employee extends User {
    @Id
    public long id;
}
