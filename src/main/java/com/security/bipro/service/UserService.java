package com.security.bipro.service;

import com.security.bipro.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Bipro","biprocuet@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Bipro1","biprocuet1@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Bipro2","biprocuet2@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Bipro3","biprocuet3@gmail.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }

}
