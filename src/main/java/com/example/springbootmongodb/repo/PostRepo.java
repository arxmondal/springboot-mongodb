package com.example.springbootmongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springbootmongodb.model.Post;

public interface PostRepo extends MongoRepository<Post, String> {
    
}