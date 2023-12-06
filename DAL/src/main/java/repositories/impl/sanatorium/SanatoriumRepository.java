package repositories.impl.sanatorium;

import ORM.VacationContext;
import entities.sanatorium.Sanatorium;
import repositories.impl.BaseRepository;
import repositories.interfaces.sanatorium.ISanatoriumRepository;

public class SanatoriumRepository
        extends BaseRepository<Sanatorium>
        implements ISanatoriumRepository {

    public SanatoriumRepository(VacationContext context) {
        super(context);
    }
}
