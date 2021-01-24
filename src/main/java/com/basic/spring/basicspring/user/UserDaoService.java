package com.basic.spring.basicspring.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private Long usersCount = 3L;

    static {
        users.add(new User(1L, "anurag arwalkar", new Date()));
        users.add(new User(2L, "vaishali arwalkar", new Date()));
        users.add(new User(3L, "sameer arwalkar", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);

        return user;
    }

    public User findOne(Long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    public User deleteById(Long id) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }

        return null;
    }

}
