package repositories.impl.user;

import ORM.VacationContext;
import entities.user.Employee;
import org.junit.jupiter.api.Test;
import repositories.impl.BaseRepository;

public class TestEmployeeRepository extends BaseRepository<Employee> {

    public TestEmployeeRepository(VacationContext context) {
        super(context);
    }
}