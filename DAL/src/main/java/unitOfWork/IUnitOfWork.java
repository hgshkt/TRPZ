package unitOfWork;

import repositories.impl.request.DefaultRequestRepository;
import repositories.impl.request.MaternityRequestRepository;
import repositories.impl.sanatorium.SanatoriumRepository;
import repositories.impl.user.EmployeeRepository;
import repositories.impl.vacation.DefaultVacationRepository;
import repositories.impl.vacation.MaternityVacationRepository;
import repositories.interfaces.request.IDefaultRequestRepository;
import repositories.interfaces.request.IMaternityRequestRepository;
import repositories.interfaces.sanatorium.ISanatoriumRepository;
import repositories.interfaces.user.IEmployeeRepository;
import repositories.interfaces.vacation.IDefaultVacationRepository;
import repositories.interfaces.vacation.IMaternityVacationRepository;

public interface IUnitOfWork {

    DefaultRequestRepository getDefaultRequestRepository();

    MaternityRequestRepository getMaternityRequestRepository();

    SanatoriumRepository getSanatoriumRepository();

    EmployeeRepository getEmployeeRepository();

    DefaultVacationRepository getDefaultVacationRepository();

    MaternityVacationRepository getMaternityVacationRepository();

    void save();
}
