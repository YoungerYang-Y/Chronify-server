package pers.chronify.eat;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 食
 *
 * @author YangYang
 * @date 2023-08-28 23:55
 */
@SpringBootApplication
@EnableDubbo
public class EatApplication {

    public static void main(String[] args) {
        SpringApplication.run(EatApplication.class, args);
    }

}
