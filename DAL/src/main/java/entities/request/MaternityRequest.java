package entities.request;

import entities.vacation.MaternityVacation;

public class MaternityRequest extends Request<MaternityVacation> {
    @Override
    public void setVacation(MaternityVacation vacation) {
        this.vacation = vacation;
    }
}
