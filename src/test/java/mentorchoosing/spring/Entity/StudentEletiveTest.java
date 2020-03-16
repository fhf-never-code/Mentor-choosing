package mentorchoosing.spring.Entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class StudentEletiveTest {
    @Autowired
    private EntityManager manager;//对数据库增删改查的接口
    @Test
    @DisplayName("学生-选择表的测试")
    public void test_StudentEletive(){
        //创建一个学生实体
        Student student01 = new Student();
        student01.setSno(2017214241);
        student01.setName("风红枫同学");
        //创建一个选择实体

    }

}
