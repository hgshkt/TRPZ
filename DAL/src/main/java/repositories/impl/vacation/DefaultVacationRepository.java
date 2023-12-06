package repositories.impl.vacation;

import ORM.VacationContext;
import entities.vacation.DefaultVacation;
import repositories.impl.BaseRepository;
import repositories.interfaces.vacation.IDefaultVacationRepository;

public class DefaultVacationRepository
        extends BaseRepository<DefaultVacation>
        implements IDefaultVacationRepository {

    public DefaultVacationRepository(VacationContext context) {
        super(context);
    }
}
