package entities.request;

import entities.vacation.DefaultVacation;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;

@Entity
@Table(appliesTo = "DefaultRequest")
public class DefaultRequest extends Request<DefaultVacation> {

    @Id
    public long id;
    @Override
    public void setVacation(DefaultVacation vacation) {
        this.vacation = vacation;
    }
}
