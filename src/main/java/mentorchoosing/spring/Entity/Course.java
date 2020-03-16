package mentorchoosing.spring.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int weight;//权重/百分比
    private int lowest;//最低分

    @OneToMany(mappedBy = "course")
    private List<Eletive> eletives;
}
