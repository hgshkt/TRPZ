package services.interfaces;

import DTO.VacationDTO;

import java.util.ArrayList;

public interface IVacationService {
    ArrayList<VacationDTO> getVacations(int page);
}
