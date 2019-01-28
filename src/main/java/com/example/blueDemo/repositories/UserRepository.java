package com.example.blueDemo.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.blueDemo.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
}