package com.siddeshwar.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.siddeshwar.learnspringframework.enterprise.example.web.MyWebController;
//import com.siddeshwar.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnspringframeworkApplication {

	public static void main(String[] args) {
//		GamingConsole game = new Mar
		ioGame();
//		SuperContraGame game = new SuperContraGame();
		ConfigurableApplicationContext context 
		=	SpringApplication.run(LearnspringframeworkApplication.class, args);
		
//		GameRunner runner = context.getBean(GameRunner.class);
//		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBussinessService());
	}

}
