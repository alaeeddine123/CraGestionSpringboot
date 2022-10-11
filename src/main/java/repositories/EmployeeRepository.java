package repositories;

import entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    EmployeeEntity findById (long employeeId);
    EmployeeEntity findByEmail(String  employeeEmail);
}
