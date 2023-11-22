package com.mongo.com.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.com.document.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
