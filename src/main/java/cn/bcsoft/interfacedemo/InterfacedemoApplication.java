package cn.bcsoft.interfacedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication //等于下面3个
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@ServletComponentScan
public class InterfacedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfacedemoApplication.class, args);
	}

}
