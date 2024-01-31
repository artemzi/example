package ylab.project.storage;

import java.util.List;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import ylab.project.model.User;

public interface Storage {
  boolean store() throws NotImplementedException;
  void addUsers(User user);
  List<User> getUsers();
}
