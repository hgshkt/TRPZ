package entities.sanatorium;


import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;

@Entity
@Table(appliesTo = "Sanatorium")
public class Sanatorium {
    @Id
    public long id;
    public String name;
    public String location;
}
