package entities.request;

import entities.user.Employee;
import entities.vacation.DefaultVacation;
import entities.vacation.Vacation;

import java.util.Date;

public abstract class Request<T extends Vacation> {
    public int id;
    public Date requestDate;
    public RequestStatus status;
    public Vacation vacation;

    public abstract void setVacation(T vacation);
}
