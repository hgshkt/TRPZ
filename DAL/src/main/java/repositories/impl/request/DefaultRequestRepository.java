package repositories.impl.request;

import ORM.VacationContext;
import entities.request.DefaultRequest;
import repositories.impl.BaseRepository;
import repositories.interfaces.request.IDefaultRequestRepository;

public class DefaultRequestRepository
        extends BaseRepository<DefaultRequest>
        implements IDefaultRequestRepository {

    public DefaultRequestRepository(VacationContext context) {
        super(context);
    }
}
