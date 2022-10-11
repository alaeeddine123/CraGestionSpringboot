package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Data
@Entity
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long employeeId;
    @Column(unique = true)
    @NotEmpty(message = "should not be empty" )
    private String employeFamilyName;
    @Column(unique = true)
    @NotEmpty(message = "should not be empty" )
    private String employeFirstName;
    @Column(unique = true)
    @NotEmpty(message = "should not be empty" )
    private String employeProfil;
    private String clientMission;
    @Column(unique = true)
    @NotEmpty(message = "should not be empty" )
    private String employeDispo;
    private int employeSoldeConge;
    @Column(unique = true)
    @NotEmpty(message = "should not be empty" )
    private String employeEmail;



}
