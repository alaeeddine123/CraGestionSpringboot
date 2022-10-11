package services.implementations;

import repositories.EmployeeRepository;
import services.EmployeeService;
import entities.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;
// add insert method + get employee from database

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(EmployeeEntity employeeEntity) {
        this.employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity getEmployeeById(long id) {
        Optional<EmployeeEntity>  optional = Optional.ofNullable(employeeRepository.findById(id));
        EmployeeEntity employeeEntity = null;
        if (optional.isPresent()) {
            employeeEntity = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employeeEntity;
    }

    @Override
    public void deleteEmployeeById(long id) {
        Optional<EmployeeEntity> employeeEntity = Optional.ofNullable(employeeRepository.findById(id));
        this.employeeRepository.deleteById(id);

    }

    @Override
    public EmployeeEntity getEmployeeByEmail(String employeeEmail) {
        return null;
    }

    /* @Override
    public Page<EmployeeEntity> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.employeeRepository.findAll(pageable);
    }
*/

}
