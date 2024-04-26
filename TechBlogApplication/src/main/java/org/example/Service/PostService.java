package org.example.Service;

import org.example.Model.Posts;
import org.example.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public Optional<Posts> getById(int id){
        return postRepository.findById(id);
    }
    public void add(Posts post){
        postRepository.save(post);

    }
    public List<Posts> getAll(){
        return postRepository.findAll();
    }

}
