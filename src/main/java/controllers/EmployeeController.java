package controllers;

import entities.EmployeeEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.EmployeeService;

import java.util.List;


@RestController

@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private  final EmployeeService employeeService = null;


    @GetMapping("/employees")
    List<EmployeeEntity>  getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/saveEmployee ")
     void  newEmploye(@RequestBody EmployeeEntity  newEmployeeEntity){
       employeeService.saveEmployee(newEmployeeEntity);
    }

    @GetMapping("/employee/{id}")
    EmployeeEntity getEmployeeById(long id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employee/id")
      void deleteEmployeeById(long id){
        employeeService.deleteEmployeeById(id);
    }

}
