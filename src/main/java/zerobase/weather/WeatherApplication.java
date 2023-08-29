package zerobase.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class WeatherApplication {
    //api key : eeafc477ba0920e22ddceb7da59e6d01
    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

}
