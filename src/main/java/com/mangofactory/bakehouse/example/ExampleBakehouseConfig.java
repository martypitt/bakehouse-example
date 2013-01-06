package com.mangofactory.bakehouse.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.bakehouse.config.BakehouseConfig;
import com.mangofactory.bakehouse.config.BakehouseConfigBuilder;
import com.mangofactory.bakehouse.config.BakehouseConfigProvider;
import com.mangofactory.bakehouse.less.LessCssProcessor;
import com.mangofactory.bakehouse.typescript.TypescriptProcessor;

	@Configuration
	public class ExampleBakehouseConfig implements BakehouseConfigProvider {
	
		@Override @Bean
		public BakehouseConfig build(BakehouseConfigBuilder builder) {
			return builder
				.process("javascript").serveAsSingleFile("AppCode.js")
				.process("typescript").with(new TypescriptProcessor("TypescriptCode.js"))
				.process("less").with(new LessCssProcessor("stylesheet.css"))
				.serveResourcesFromCdn()
				.build();
		}
	}
