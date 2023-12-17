package tests;

import ORM.VacationContext;
import entities.user.Employee;
import org.junit.Test;
import repositories.impl.user.TestEmployeeRepository;
import static org.junit.Assert.assertEquals;
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

    @Test
    public void Get_InputId_CalledFindMethodOfEntityManagerWithCorrectId() {
        // Arrange
        var mockTransaction = mock(EntityTransaction.class);

        var mockEntityManager = mock(EntityManager.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);

        var mockVacationContext = mock(VacationContext.class);
        when(mockVacationContext.getEntityManager()).thenReturn(mockEntityManager);

        var repository = new TestEmployeeRepository(mockVacationContext);
        var expectedEmployee = new Employee(1);

        when(mockEntityManager.find(Employee.class, (int) expectedEmployee.id)).thenReturn(expectedEmployee);

        // Act
        var actualEmployee = repository.get(Employee.class, (int) expectedEmployee.id);

        // Assert
        verify(mockEntityManager, times(1)).find(Employee.class, (int) expectedEmployee.id);
        assertEquals(expectedEmployee, actualEmployee);
    }
}
