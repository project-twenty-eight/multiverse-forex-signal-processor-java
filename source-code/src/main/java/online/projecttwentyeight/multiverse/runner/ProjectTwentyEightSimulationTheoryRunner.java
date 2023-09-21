package online.projecttwentyeight.multiverse.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ProjectTwentyEightSimulationTheoryRunner {

    public static void main(final String[] commandLineArguments) throws IOException {

        SpringApplication.run(ProjectTwentyEightSimulationTheoryRunner.class, commandLineArguments);

        //TheMultiVerse.init();
    }

}
