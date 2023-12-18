package mapper;

import DTO.DefaultVacationDTO;
import entities.vacation.DefaultVacation;

import java.util.ArrayList;
import java.util.List;

public class VacationMapper {

    public ArrayList<DefaultVacationDTO> defaultVacationsToDTO(List<DefaultVacation> defaultVacations) {
        var listDTO = new ArrayList<DefaultVacationDTO>();
        for (DefaultVacation vacation : defaultVacations) {
            DefaultVacationDTO defaultVacationDTO = new DefaultVacationDTO((int) vacation.id, vacation.sanatoriumId, vacation.startDate, vacation.endDate, vacation.employeeId);
            listDTO.add(defaultVacationDTO);
        }
        return listDTO;
    }
}
