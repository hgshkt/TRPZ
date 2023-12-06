package entities.vacation;

import entities.user.Employee;

import java.util.Date;


public abstract class Vacation {
    public int id;
    public Date startDate;
    public Date endDate;
    public Employee employee;
}
