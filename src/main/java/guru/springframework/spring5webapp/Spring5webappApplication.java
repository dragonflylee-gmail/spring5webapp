package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.components.Foo;
import guru.springframework.spring5webapp.components.UserDefined;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.stream(beanNames)
					.sorted()
					.map(ctx::getBean)
					.filter(bean -> bean instanceof UserDefined || bean instanceof Foo)
					.forEach(bean -> System.out.println(bean.getClass().getName()));
		};
	}
}
