package unitOfWork;

import repositories.interfaces.request.IDefaultRequestRepository;
import repositories.interfaces.request.IMaternityRequestRepository;
import repositories.interfaces.sanatorium.ISanatoriumRepository;
import repositories.interfaces.user.IEmployeeRepository;
import repositories.interfaces.vacation.IDefaultVacationRepository;
import repositories.interfaces.vacation.IMaternityVacationRepository;

public interface IUnitOfWork {

    IEmployeeRepository employees = null;
    ISanatoriumRepository sanatoriums = null;
    IDefaultRequestRepository defaultRequests = null;
    IMaternityRequestRepository maternityRequests = null;
    IDefaultVacationRepository defaultVacations = null;
    IMaternityVacationRepository maternityVacations = null;

    void save();
}
