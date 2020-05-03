package learningdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningdockerApplication {

	public static void main (String[] args) {
		SpringApplication.run(LearningdockerApplication.class, args);
	}

//	to build a docker image along with mysql
//	here the port of spring to be deployed has been changed in .properties file
//	specify dockerfile
//	mvn package
//	docker build -f Dockerfile -t learningdocker
//	docker run -p 8085:8085 --name learningdocker --link mysql-standalone -d learningdocker
}
