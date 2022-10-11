package entities;

import entities.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Role;

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


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection<Role> roles;

    public UserEntity() {

    }

    public UserEntity(String firstName, String lastName, String email, String password, Collection<Role> roles) {
        super();
        this.userFirstName = userFirstName;
        this.userFamilyName = userFamilyName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.roles = roles;
    }
    public Long getId() {
        return userId;
    }
    public void setId(Long id) {
        this.userId = userId;
    }
    public String getFirstName() {
        return userFirstName;
    }
    public void setFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    public String getFamilyName() {
        return userFamilyName;
    }
    public void FamilyName(String userFamilyName) {
        this.userFamilyName = userFamilyName;
    }
    public String getEmail() {
        return userEmail;
    }
    public void setEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getPassword() {
        return userPassword ;
    }
    public void setPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Collection<Role> getRoles() {
        return roles;
    }
    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

}

    
    @Enumerated(EnumType.STRING)
    private RoleEnum role;


}
