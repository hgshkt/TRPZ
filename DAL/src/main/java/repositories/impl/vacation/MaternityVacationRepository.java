package repositories.impl.vacation;

import ORM.VacationContext;
import entities.vacation.MaternityVacation;
import repositories.impl.BaseRepository;
import repositories.interfaces.vacation.IMaternityVacationRepository;

public class MaternityVacationRepository
        extends BaseRepository<MaternityVacation>
        implements IMaternityVacationRepository {

    public MaternityVacationRepository(VacationContext context) {
        super(context);
    }
}
