package org.example.Service;

import org.example.Model.Peoples;
import org.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(Peoples user){
        userRepository.save(user);
    }

    public List<Peoples> getAll(){
        return userRepository.findAll();
    }

    public Optional<Peoples> getById(@PathVariable int id){
        return userRepository.findById(id);
    }


}
