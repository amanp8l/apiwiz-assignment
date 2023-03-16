package com.example.APIwiz;
import com.example.APIwiz.Services.UpdateData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApIwizApplication {

	public static void main(String[] args){
		SpringApplication.run(ApIwizApplication.class, args);
	}


	//Update data from last 30 days
//	@Bean
//	public CommandLineRunner run(UpdateData updateData) throws Exception {
//		return args -> {
//			updateData.callAPI();
//		};
//	}

}
