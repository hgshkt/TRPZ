package repositories.impl.request;

import ORM.VacationContext;
import entities.request.MaternityRequest;
import repositories.impl.BaseRepository;
import repositories.interfaces.request.IMaternityRequestRepository;

public class MaternityRequestRepository
        extends BaseRepository<MaternityRequest>
        implements IMaternityRequestRepository {

    public MaternityRequestRepository(VacationContext context) {
        super(context);
    }
}
