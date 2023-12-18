package services.impl;

import DTO.DefaultVacationDTO;
import entities.vacation.DefaultVacation;
import mapper.VacationMapper;
import security.indentity.Employee;
import security.indentity.PersonalServiceEmployee;
import services.interfaces.IVacationService;
import unitOfWork.IUnitOfWork;

import java.util.ArrayList;
import java.util.List;

import static security.SecurityContext.getUser;

public class VacationService implements IVacationService {

    private IUnitOfWork database;
    private int pageSize = 10;

    private VacationMapper mapper;

    public VacationService(IUnitOfWork unitOfWork, VacationMapper mapper) {
        if (unitOfWork == null || mapper == null)
            throw new NullPointerException();

        this.database = unitOfWork;
        this.mapper = mapper;
    }

    @Override
    public ArrayList<DefaultVacationDTO> getVacations(int page) {
        var user = getUser();
        var userType = user.getUserType();
        if (!userType.equals(Employee.class.getName())
                & !userType.equals(PersonalServiceEmployee.class.getName())) {
            throw new IllegalArgumentException();
        }

        List<DefaultVacation> vacations = database.getDefaultVacationRepository().getAll(DefaultVacation.class);
        ArrayList<DefaultVacationDTO> vacationsDTO = mapper.defaultVacationsToDTO(vacations);

        return vacationsDTO;
    }
}
