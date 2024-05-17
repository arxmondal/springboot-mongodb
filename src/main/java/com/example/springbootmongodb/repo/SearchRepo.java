package com.example.springbootmongodb.repo;

import java.util.List;

import com.example.springbootmongodb.model.Post;

public interface SearchRepo {
    List<Post> findByText(String text);
}