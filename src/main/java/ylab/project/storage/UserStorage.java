package ylab.project.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import ylab.project.model.User;

public class UserStorage implements Storage {

    private final List<User> users = new ArrayList<>(List.of(new User("admin", "admin")));

    public UserStorage() {
    }

    @Override
    public boolean store() throws NotImplementedException {
        throw new NotImplementedException("todo");
    }

    @Override
    public void addUsers(User user) {
        this.users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }
}
