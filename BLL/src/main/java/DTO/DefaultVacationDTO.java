package DTO;

import java.util.Date;

public class DefaultVacationDTO {
    public int id;
    public Date startDate;
    public Date endDate;
    public int employeeId;

    public int sanatoriumId;

    public DefaultVacationDTO(int id, int sanatoriumId, Date startDate, Date endDate, int employeeId) {
        this.id = id;
        this.sanatoriumId = sanatoriumId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeId = employeeId;
    }
}
