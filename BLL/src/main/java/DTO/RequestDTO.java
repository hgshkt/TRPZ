package DTO;

import entities.request.RequestStatus;
import entities.vacation.Vacation;

import java.util.Date;

public class RequestDTO {
    public int id;
    public Date requestDate;
    public RequestStatus status;
    public Vacation vacation;
}
