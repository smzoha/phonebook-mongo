package com.zedapps.phonebook.service;

import com.zedapps.phonebook.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shamah M Zoha
 * @since 14-Feb-22
 **/
@Service
public class UserService {

    @Autowired
    private MongoTemplate template;

    public List<User> getAllUsers() {
        return template.findAll(User.class);
    }

    public List<User> getActiveUsers() {
        return template.find(new Query(Criteria.where("inactive").is(false)), User.class);
    }

    public User getUserById(String id) {
        return template.findById(id, User.class);
    }

    public User getUserByUsername(String username) {
        return template.findOne(new Query(Criteria.where("username").is(username)), User.class);
    }

    public User save(User user) {
        return template.save(user);
    }

    public boolean updateUserStatus(boolean inactive) {
        Update inactivateUpdate = new Update().set("inactive", inactive);

        return template.updateFirst(new Query(), inactivateUpdate, User.class).getModifiedCount() > 0;
    }

    public boolean delete(User user) {
        return template.remove(user).getDeletedCount() > 0;
    }
}
