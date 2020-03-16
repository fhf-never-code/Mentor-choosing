package mentorchoosing.spring.Entity;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Slf4j
@Entity
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Tno;//教师教工号
    private String name;//教室名称
    private  int acceptedNum;//教师可选人数
    private int acceptarea;//导师可设置的选择线/下界
    @OneToMany(mappedBy = "teacher")
    private List<Eletive> eletives;

}
