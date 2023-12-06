package entities.request;

import entities.vacation.MaternityVacation;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;

@Entity
@Table(appliesTo = "MaternityRequest")
public class MaternityRequest extends Request<MaternityVacation> {

    @Id
    public long id;

    @Override
    public void setVacation(MaternityVacation vacation) {
        this.vacation = vacation;
    }
}
