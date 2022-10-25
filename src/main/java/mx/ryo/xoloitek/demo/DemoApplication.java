package mx.ryo.xoloitek.demo;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import mx.ryo.xoloitek.demo.pojo.dto.XoloInternalHeaderType;

@SpringBootApplication
public class DemoApplication {
	final static int SIZE_POOL_MAX = 10;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedHeaders(XoloInternalHeaderType.X_USER.getKey())
						.exposedHeaders(XoloInternalHeaderType.X_CRO.getKey()).allowedOrigins("http://localhost:4200");
			}
		};
	}

	@Bean(name = "labels")
	public ResourceBundle getLabel() {
		Locale locale = new Locale("es", "MX");
		ResourceBundle labels = ResourceBundle.getBundle("statics.labels", locale);
		return labels;
	}

	@Bean(name = "errors")
	public ResourceBundle getError() {
		Locale locale = new Locale("es", "MX");
		ResourceBundle errorCode = ResourceBundle.getBundle("statics.error", locale);
		return errorCode;
	}
	
	@Bean(name = "paths")
	public ResourceBundle getPath() {
		ResourceBundle errorCode = ResourceBundle.getBundle("conf.paths");
		return errorCode;
	}
	
	@Bean(name = "params")
	public ResourceBundle getParam() {
		ResourceBundle errorCode = ResourceBundle.getBundle("conf.control-params");
		return errorCode;
	}
}
