package my.code.tasktrackerapi.api.factories;

import my.code.tasktrackerapi.api.dto.TaskDto;
import my.code.tasktrackerapi.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {
    public TaskDto makeTaskDto(TaskEntity entity){
        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreateAt())
                .description(entity.getDescription())
                .build();

    }
}
