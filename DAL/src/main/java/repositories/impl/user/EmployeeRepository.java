package repositories.impl.user;

import ORM.VacationContext;
import entities.user.Employee;
import repositories.impl.BaseRepository;
import repositories.interfaces.user.IEmployeeRepository;

public class EmployeeRepository
        extends BaseRepository<Employee>
        implements IEmployeeRepository {


    public EmployeeRepository(VacationContext context) {
        super(context);
    }
}
