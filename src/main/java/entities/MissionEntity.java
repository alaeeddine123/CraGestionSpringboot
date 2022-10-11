package entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Data
@Entity
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Mission")

public class MissionEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private String missionId;
    private String missioName;
    private String ClientName;

}
