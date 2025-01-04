package my.code.tasktrackerapi.store.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Objects;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;

    private Instant createAt = Instant.now();
    private String description;

}
