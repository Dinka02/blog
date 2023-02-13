package com.dina.blog.service;
import com.dina.blog.models.User;
import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}
