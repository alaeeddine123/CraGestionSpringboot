package repositories;

import entities.MissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionEntity,Long> {

    MissionEntity findById (long missionId );
}
