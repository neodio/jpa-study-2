package jpabook.jpastudy2;

import com.fasterxml.jackson.datatype.hibernate6.Hibernate6Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaStudy2Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaStudy2Application.class, args);
    }

    @Bean
    Hibernate6Module hibernate6Module() {
        Hibernate6Module hibernate6Module = new Hibernate6Module();
        //강제 지연 로딩 설정
        //hibernate6Module.configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING, true);
        return hibernate6Module;
    }

}
