package my.code.tasktrackerapi.api.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import my.code.tasktrackerapi.api.dto.ProjectDto;
import my.code.tasktrackerapi.api.exceptions.BadRequestException;
import my.code.tasktrackerapi.api.factories.ProjectDtoFactory;
import my.code.tasktrackerapi.store.entities.ProjectEntity;
import my.code.tasktrackerapi.store.repositories.ProjectRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import javax.transaction.Transactional;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Transactional
@RestController
public class ProjectController {
    ProjectRepository projectRepository;
    ProjectDtoFactory projectDtoFactory;
    public static final String CREATE_PROJECT = "/api/projects";

    @PostMapping(CREATE_PROJECT)
    public ProjectDto createProject(@RequestParam String name) {

        projectRepository
                .findByName(name)
                .ifPresent(project -> {
                    throw new BadRequestException(String.format("Project \"%s\" already exists.", name));
                });

        //ProjectEntity project = projectRepository.findByName();
        //TODO: uncommit and insert entity in method
//        return projectDtoFactory.makeProjectDto();
        return null;
    }


}


















