package entities.request;

import entities.vacation.DefaultVacation;

public class DefaultRequest extends Request<DefaultVacation> {
    @Override
    public void setVacation(DefaultVacation vacation) {
        this.vacation = vacation;
    }
}
