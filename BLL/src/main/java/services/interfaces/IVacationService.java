package services.interfaces;

import DTO.DefaultVacationDTO;

import java.util.ArrayList;

public interface IVacationService {
    ArrayList<DefaultVacationDTO> getVacations(int page);
}
