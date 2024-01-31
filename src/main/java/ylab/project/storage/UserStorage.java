package ylab.project.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import ylab.project.model.User;

public class UserStorage implements Storage {


    private static User authenticatedUser;
    public static List<User> users = new ArrayList<>(Arrays.asList(new User("admin", "admin")));

    public UserStorage(User user) {
        this.authenticatedUser = user;
    }

    @Override
    public boolean store() throws NotImplementedException {
        throw new NotImplementedException("todo");
    }
}
