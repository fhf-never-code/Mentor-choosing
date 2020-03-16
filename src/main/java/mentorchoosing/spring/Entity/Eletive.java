package mentorchoosing.spring.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Eletive { //选择类
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//可选的课程号
    private int chosenNum;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private  Course course;

}
