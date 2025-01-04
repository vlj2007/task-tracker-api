package my.code.tasktrackerapi.api.factories;

import my.code.tasktrackerapi.api.dto.ProjectDto;
import my.code.tasktrackerapi.store.entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoFactory {
    public ProjectDto makeProjectDto(ProjectEntity entity){
        return ProjectDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreateAt())
                .build();
    }
}
