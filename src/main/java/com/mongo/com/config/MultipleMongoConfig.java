package com.mongo.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MultipleMongoConfig {

	@Primary
	@Bean(name = "primaryMongoTemplate")
	public MongoTemplate primaryMongoTemplate() throws Exception {
		return new MongoTemplate(primaryFactory());
	}

	@Bean(name = "secondaryMongoTemplate")
	public MongoTemplate secondaryMongoTemplate() throws Exception {
		return new MongoTemplate(secondaryFactory());
	}

	@Bean
	@Primary
	public SimpleMongoClientDatabaseFactory primaryFactory() throws Exception {
		return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/user_db");
	}

	@Bean
	public SimpleMongoClientDatabaseFactory secondaryFactory() throws Exception {
		return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/student_db");
	}
}
