package com.mongo.com.repository.primary;


import com.mongo.com.document.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends MongoRepository<Account,String> {
}
