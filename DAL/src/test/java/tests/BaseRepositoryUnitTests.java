package tests;

import ORM.VacationContext;
import entities.user.Employee;
import org.junit.Test;
import repositories.impl.user.TestEmployeeRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import static org.mockito.Mockito.*;

public class BaseRepositoryUnitTests {

    @Test
    public void CreateInputEmployeeInstanceCalledAddMethodOfEntityManagerWithEmployeeInstance() {
        // Arrange
        var mockTransaction = mock(EntityTransaction.class);

        var mockEntityManager = mock(EntityManager.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);

        var mockVacationContext = mock(VacationContext.class);
        when(mockVacationContext.getEntityManager()).thenReturn(mockEntityManager);

        var repository = new TestEmployeeRepository(mockVacationContext);
        var expectedEmployee = mock(Employee.class);

        // Act
        repository.create(expectedEmployee);

        // Assert
        verify(mockEntityManager, times(1)).merge(expectedEmployee);
    }
}
