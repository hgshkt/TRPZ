package entities.vacation;

import entities.sanatorium.Sanatorium;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;

@Entity
@Table(appliesTo = "DefaultVacation")
public class DefaultVacation extends Vacation {
    @Id
    public long id;
    public Sanatorium sanatorium;
}
