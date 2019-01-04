package tf.services.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Scheduler {

  private boolean done = true;
  public Scheduler() {
  }

  public static void main(String[] args) {
	 SpringApplication.run(Scheduler.class, args);
  }

}
