package org.example.Controller;

import org.example.Model.Peoples;
import org.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    public UserService userService;
   @GetMapping("/users/all")
    public List<Peoples> getAll(){
    return userService.getAll();
      }
@GetMapping("user/{id}")
    public Optional<Peoples> getById(@PathVariable int id){
       return userService.getById(id);
    }
    @PostMapping("add/user")
    public void add(@RequestBody Peoples user)
    {
        userService.addUser(user);
    }




}
