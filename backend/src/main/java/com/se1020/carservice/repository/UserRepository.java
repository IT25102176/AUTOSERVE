package com.se1020.carservice.repository;

import com.se1020.carservice.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import tools.jackson.databind.json.JsonMapper;

@Repository
public class UserRepository extends JsonFileRepository<User> {
    public UserRepository(JsonMapper objectMapper, @Value("${app.storage.dir:data}") String storageDir) {
        super(objectMapper, storageDir, "users.json", User.class, User::getId);
    }
}
