package entities.vacation;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(appliesTo = "DefaultVacation")
public class DefaultVacation extends Vacation {
    @Id
    public long id;

    public int sanatoriumId;

    public DefaultVacation(long id, int sanatoriumId, Date startDate, Date endDate, int employeeId) {
        this.id = id;
        this.sanatoriumId = sanatoriumId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeId = employeeId;
    }

    public DefaultVacation() {

    }
}
