package entities;

import lombok.extern.slf4j.Slf4j;
import javax.persistence.*;

@Entity
@Table(name = "role")
@Slf4j

public class RoleClass {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public RoleClass() {

        }

        public RoleClass(String name) {
                super();
                this.name = name;
        }

        public Long getId() {
                return id;
        }
        public void setId(Long id) {
                this.id = id;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }

}

