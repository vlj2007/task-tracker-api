package my.code.tasktrackerapi.api.factories;

import my.code.tasktrackerapi.api.dto.TaskStateDto;
import my.code.tasktrackerapi.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {
    public TaskStateDto makeTaskStateDto(TaskStateEntity entity){
        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .ordinal(entity.getOrdinal())
                .createdAt(entity.getCreatedAt())
                .build();

    }
}
