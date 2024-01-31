package ylab.project.storage;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public interface Storage {
  boolean store() throws NotImplementedException;
}
