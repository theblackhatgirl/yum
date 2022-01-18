package com.yum;

import com.yum.recipe.model.Ingredient;
import com.yum.recipe.model.Recipe;
import com.yum.recipe.model.Step;
import com.yum.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class YumApplication {

	public static void main(String[] args) {
		SpringApplication.run(YumApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*")
						.exposedHeaders("Authorization")
						.allowedMethods("GET", "POST", "PUT", "DELETE");
			}
		};
	}
}
