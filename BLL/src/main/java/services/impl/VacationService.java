package services.impl;

import DTO.VacationDTO;
import entities.user.Employee;
import entities.vacation.DefaultVacation;
import entities.vacation.Vacation;
import security.indentity.Administrator;
import security.indentity.PersonalServiceEmployee;
import services.interfaces.IVacationService;
import unitOfWork.IUnitOfWork;

import java.rmi.AccessException;
import java.util.ArrayList;
import java.util.List;

import static security.SecurityContext.getUser;

public class VacationService implements IVacationService {

    private IUnitOfWork database;
    private int pageSize = 10;

    public VacationService(IUnitOfWork unitOfWork) {
        if (unitOfWork == null)
            throw new NullPointerException();

        this.database = unitOfWork;
    }

    @Override
    public ArrayList<VacationDTO> getVacations(int page) {
        var user = getUser();
        var userType = user.getUserType();
        if (!userType.equals(Employee.class.getName())
                && !userType.equals(PersonalServiceEmployee.class.getName())) {
            throw new IllegalArgumentException();
        }

        List<DefaultVacation> vacations = database.getDefaultVacationRepository().getAll(DefaultVacation.class);
        ArrayList<VacationDTO> vacationsDTO = new ArrayList<>();

        for (Vacation vacation : vacations) {
            var vacationDTO = new VacationDTO();

            vacationDTO.id = vacation.id;
            vacationDTO.employee = vacation.employee;
            vacationDTO.startDate = vacation.startDate;
            vacationDTO.endDate = vacation.endDate;

            vacationsDTO.add(vacationDTO);
        }

        return vacationsDTO;
    }
}
