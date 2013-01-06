package com.mangofactory.bakehouse.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mangofactory.bakehouse.config.BakehouseConfig;
import com.mangofactory.bakehouse.config.BakehouseConfigBuilder;
import com.mangofactory.bakehouse.config.BakehouseConfigProvider;
import com.mangofactory.bakehouse.typescript.TypescriptProcessor;

	@Configuration
	public class ExampleBakehouseConfig implements BakehouseConfigProvider {
	
		@Override @Bean
		public BakehouseConfig build(BakehouseConfigBuilder builder) {
			return builder
				.process("javascript").serveAsSingleFile("AppCode.js")
				.process("typescript").with(new TypescriptProcessor("TypescriptCode.js"))
				.serveResourcesFromCdn()
				.build();
		}
	}
