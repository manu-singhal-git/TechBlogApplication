package org.example.Controller;

import org.example.Model.Posts;
import org.example.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    public PostService postService;
    @GetMapping("posts/{id}")
    public Optional<Posts> getById(@PathVariable int id){
        return postService.getById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Posts post){
        post.setDate(new Date());
        postService.add(post);
    }
    @GetMapping("/posts/all")
    public List<Posts> getAll(){
        return postService.getAll();
    }

}
