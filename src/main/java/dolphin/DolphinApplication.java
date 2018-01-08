package dolphin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Alex
 **/
@SpringBootApplication
@MapperScan("dolphin.dao.mapper")
public class DolphinApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DolphinApplication.class, args);
    }
}
