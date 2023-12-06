package entities.vacation;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;

@Entity
@Table(appliesTo = "MaternityVacation")
public class MaternityVacation extends Vacation{
    @Id
    public long id;
}
