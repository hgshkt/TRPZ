package ORM;

import repositories.impl.request.DefaultRequestRepository;
import repositories.impl.request.MaternityRequestRepository;
import repositories.impl.sanatorium.SanatoriumRepository;
import repositories.impl.user.EmployeeRepository;
import repositories.impl.vacation.DefaultVacationRepository;
import repositories.impl.vacation.MaternityVacationRepository;
import unitOfWork.IUnitOfWork;

public class HibernateUnitOfWork implements IUnitOfWork {

    private VacationContext context;
    private DefaultRequestRepository defaultRequestRepository;
    private MaternityRequestRepository maternityRequestRepository;
    private SanatoriumRepository sanatoriumRepository;
    private EmployeeRepository employeeRepository;
    private DefaultVacationRepository defaultVacationRepository;
    private MaternityVacationRepository maternityVacationRepository;

    public HibernateUnitOfWork(VacationContext context) {
        this.context = context;
    }

    @Override
    public void save() {

    }

    public DefaultRequestRepository getDefaultRequestRepository() {
        if (defaultRequestRepository == null)
            defaultRequestRepository = new DefaultRequestRepository(context);
        return defaultRequestRepository;
    }

    public MaternityRequestRepository getMaternityRequestRepository() {
        if (maternityRequestRepository == null)
            maternityRequestRepository = new MaternityRequestRepository(context);
        return maternityRequestRepository;
    }

    public SanatoriumRepository getSanatoriumRepository() {
        if (sanatoriumRepository == null)
            sanatoriumRepository = new SanatoriumRepository(context);
        return sanatoriumRepository;
    }

    public EmployeeRepository getEmployeeRepository() {
        if (employeeRepository == null)
            employeeRepository = new EmployeeRepository(context);
        return employeeRepository;
    }

    public DefaultVacationRepository getDefaultVacationRepository() {
        if (defaultVacationRepository == null)
            defaultVacationRepository = new DefaultVacationRepository(context);
        return defaultVacationRepository;
    }

    public MaternityVacationRepository getMaternityVacationRepository() {
        if (maternityVacationRepository == null)
            maternityVacationRepository = new MaternityVacationRepository(context);
        return maternityVacationRepository;
    }
}
