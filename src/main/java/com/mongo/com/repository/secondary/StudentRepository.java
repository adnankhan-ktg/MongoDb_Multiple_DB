package com.mongo.com.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.com.document.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
