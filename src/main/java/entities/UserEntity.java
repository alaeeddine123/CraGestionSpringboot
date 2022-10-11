package entities;

import entities.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.Collection;

import javax.persistence.*;
@Data
@Entity
@Slf4j
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "user" ,uniqueConstraints = @UniqueConstraint (columnNames = "userEmail"))
//@UniqueConstraint to make data in email column unique
public class UserEntity {




    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long userId;
    private String userFamilyName;
    private String userFirstName;
    private String userProfil;
    private String userEmail;
    private String userPassword;
    
    @Enumerated(EnumType.STRING)
    private RoleEnum role;




}
