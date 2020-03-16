package mentorchoosing.spring.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Slf4j
@Data
@Entity
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//定义唯一标识符/主键
    private  int  Sno;//学号
    private  String name;//姓名
    @OneToMany(mappedBy = "student")
    private List<Eletive>eletives;
}

