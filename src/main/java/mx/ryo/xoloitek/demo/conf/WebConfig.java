package mx.ryo.xoloitek.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import mx.ryo.xoloitek.demo.pojo.dto.XoloInternalHeaderType;

@Configuration
public class WebConfig {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
					.allowedHeaders(XoloInternalHeaderType.X_USER.getKey())
					.exposedHeaders(XoloInternalHeaderType.X_CRO.getKey())
					.allowedOrigins("http://localhost:4200");
			}
		};
	}
}
