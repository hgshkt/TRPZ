import org.junit.jupiter.api.Test;
import services.impl.VacationService;
import unitOfWork.IUnitOfWork;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class VacationServiceTest {

    @Test
    public void Ctor_InputNull_ThrowArgumentNullException() {
        // Arrange
        IUnitOfWork nullUnitOfWork = null;

        // Act

        // Assert
        assertThrows(NullPointerException.class, () ->{
            new VacationService(nullUnitOfWork);
        });
    }
}
