package my.code.tasktrackerapi.store.repositories;

import my.code.tasktrackerapi.store.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    Optional<ProjectEntity> findByName(String name);

}
