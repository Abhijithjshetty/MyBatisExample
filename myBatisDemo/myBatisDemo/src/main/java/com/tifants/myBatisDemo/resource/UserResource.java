package com.tifants.myBatisDemo.resource;

import com.tifants.myBatisDemo.mapper.UserMapper;
import com.tifants.myBatisDemo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
    @Autowired
    private UserMapper userMapper;
    public UserResource(UserMapper userMapper){
        this.userMapper=userMapper;
    }
    @GetMapping("/all")
    public List<Users> getAll(){
        return userMapper.findAll();
    }
    @GetMapping("/update")
    private List<Users> update() {
        Users user1 = new Users();
        user1.setId(4);
        user1.setName("arun");
        user1.setRole("data_base");
        userMapper.insert(user1);
        return userMapper.findAll();
    }
    @GetMapping("/updateUsers")
    private List<Users> updateUsers(){
        Users user1=new Users();
        user1.setName("arun");
        user1.setRole("back_end");
        userMapper.update(user1);
        return userMapper.findAll();
    }
    @GetMapping("/delete")
    private List<Users> delete(){
        Users user1=new Users();
        user1.setName("arun");
        userMapper.delete(user1);
        return userMapper.findAll();
    }

}
