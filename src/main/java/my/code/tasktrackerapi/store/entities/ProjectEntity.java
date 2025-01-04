package my.code.tasktrackerapi.store.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name= "project")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;

    private Instant createAt = Instant.now();

    @OneToMany
    private List<TaskStateEntity> taskStates;


    public ProjectEntity() {
    }

    public ProjectEntity(Long id, String name, Instant createAt, List<TaskStateEntity> taskStates) {
        this.id = id;
        this.name = name;
        this.createAt = createAt;
        this.taskStates = taskStates;
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

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public List<TaskStateEntity> getTaskStates() {
        return taskStates;
    }

    public void setTaskStates(List<TaskStateEntity> taskStates) {
        this.taskStates = taskStates;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectEntity that = (ProjectEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(createAt, that.createAt) && Objects.equals(taskStates, that.taskStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createAt, taskStates);
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createAt=" + createAt +
                ", taskStates=" + taskStates +
                '}';
    }
}
