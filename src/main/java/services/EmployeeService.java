package services;

import entities.EmployeeEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
    void saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity getEmployeeById(long id);
    void deleteEmployeeById(long id);

    EmployeeEntity getEmployeeByEmail(String employeeEmail);

   // public Page<EmployeeEntity> findPaginated(int pageNo, int pageSize, String sortField, String  sortDirection);
}
