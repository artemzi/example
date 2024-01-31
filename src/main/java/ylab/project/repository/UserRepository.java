package ylab.project.repository;

import ylab.project.model.User;
import ylab.project.storage.Storage;
import ylab.project.storage.UserStorage;

public class UserRepository {

    private final Storage storage;

    public UserRepository() {
        this.storage = new UserStorage(); // todo тут можно выбрать другое хранилище
    }

    public void saveUser(User user){
        storage.addUsers(user);
    }

    public boolean isLoginAvailable(String login){
        for (User us : storage.getUsers()){
            if (login.equals(us.getLogin())){
                return false;
            }
        }
        return true;
    }
}
