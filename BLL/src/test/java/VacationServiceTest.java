import org.junit.jupiter.api.Test;
import repositories.impl.vacation.DefaultVacationRepository;
import security.SecurityContext;
import security.indentity.Administrator;
import security.indentity.User;
import services.impl.VacationService;
import services.interfaces.IVacationService;
import unitOfWork.IUnitOfWork;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    public void testGetVacations_UserIsAdministrator_ThrowIllegalArgumentException() {
        // Arrange
        User user = new Administrator(1, "test name", "test surname");
        SecurityContext.setUser(user);

        var vacationRepository = mock(DefaultVacationRepository.class);

        IUnitOfWork mockUnitOfWork = mock(IUnitOfWork.class);
        when(mockUnitOfWork.getDefaultVacationRepository()).thenReturn(vacationRepository);
        IVacationService streetService = new VacationService(mockUnitOfWork);

        // Act

        // Assert
        assertThrows(IllegalArgumentException.class, () -> streetService.getVacations(0));
    }
}