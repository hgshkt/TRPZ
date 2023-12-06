package entities.request;

import entities.vacation.Vacation;

import java.util.Date;

public abstract class Request<T extends Vacation> {
    public int id;
    public Date requestDate;
    public RequestStatus status;
    public Vacation vacation;

    public abstract void setVacation(T vacation);
}
