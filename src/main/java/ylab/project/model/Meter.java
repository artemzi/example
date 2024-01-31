package ylab.project.model;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public interface Meter {

//    public abstract void test();
    Long getId() throws NotImplementedException;
    Long getNumber() throws NotImplementedException;
}

