package configuration;

import models.Students;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class StudentConfig {
    @Bean(name = "currentStudents")
    public Students currentStudent(){
        return Students.getInstance();
    }
    @Bean(name = "previousStudents")
    public Students previousStudents(){
        return Students.getInstance();
    }
}
