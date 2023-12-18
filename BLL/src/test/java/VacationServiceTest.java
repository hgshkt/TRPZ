import DTO.DefaultVacationDTO;
import entities.vacation.DefaultVacation;
import mapper.VacationMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repositories.impl.vacation.DefaultVacationRepository;
import security.SecurityContext;
import security.indentity.Administrator;
import security.indentity.Employee;
import security.indentity.User;
import services.impl.VacationService;
import services.interfaces.IVacationService;
import unitOfWork.IUnitOfWork;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertTrue;
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
        assertThrows(NullPointerException.class, () -> {
            new VacationService(nullUnitOfWork, new VacationMapper());
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
        IVacationService streetService = new VacationService(mockUnitOfWork, new VacationMapper());

        // Act

        // Assert
        assertThrows(IllegalArgumentException.class, () -> streetService.getVacations(0));
    }

    @Test
    public void GetVacations_VacationFromDAL_CorrectMappingToVacationDTO() {
        // Arrange
        User user = new Employee(1, "test name", "test surname");
        SecurityContext.setUser(user);

        var vacationService = getVacationService();

        // Act
        DefaultVacationDTO actualDefaultVacationDTO = vacationService.getVacations(1).get(0);

        // Assert
        Assertions.assertTrue(actualDefaultVacationDTO.id == 1
                && actualDefaultVacationDTO.employeeId == 1
                && actualDefaultVacationDTO.startDate.equals(new Date(1702937177700L))
                && actualDefaultVacationDTO.endDate.equals(new Date(1702937177700L)));

    }

    private IVacationService getVacationService() {
        var expectedVacation = new DefaultVacation(1, 1, new Date(1702937177700L), new Date(1702937177700L), 1);
        var expectedVacationList = new ArrayList<DefaultVacation>();
        expectedVacationList.add(expectedVacation);

        var mockRepository = mock(DefaultVacationRepository.class);
        IUnitOfWork unitOfWork = mock(IUnitOfWork.class);
        when(unitOfWork.getDefaultVacationRepository()).thenReturn(mockRepository);
        when(unitOfWork.getDefaultVacationRepository().getAll(DefaultVacation.class)).thenReturn(expectedVacationList);

        return new VacationService(unitOfWork, new VacationMapper());
    }
}