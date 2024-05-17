package com.example.springbootmongodb.controller;

import org.springframework.web.bind.annotation.*;

import com.example.springbootmongodb.model.Post;
import com.example.springbootmongodb.repo.PostRepo;
import com.example.springbootmongodb.repo.SearchRepo;

import java.util.List;

@RestController
public class PostController {

    PostRepo postRepo;
    SearchRepo searchRepo;

    public PostController(PostRepo postRepo, SearchRepo searchRepo) {
        this.postRepo = postRepo;
        this.searchRepo = searchRepo;
    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text) {
        return searchRepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postRepo.save(post);
    }

}