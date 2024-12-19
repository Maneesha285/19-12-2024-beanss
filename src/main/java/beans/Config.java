package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Config {
    @Configuration
    @ComponentScan(basePackages = "com.beans")
    public class AppConfig {
    }
    @Bean("id1")
    public Company getCompany(){
        Manager mng=new Manager("Maneeshaa",1);
        Company company=new Company("Neoteric",11,"Ts",mng);

        return company;
    }

}
