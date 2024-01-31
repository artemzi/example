package ylab.project;

import ylab.project.controller.AuthController;
import ylab.project.model.User;
import ylab.project.service.in.ConsoleReader;
import ylab.project.repository.UserRepository;
import ylab.project.service.UserService;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        AuthController authController = new AuthController(userService);
        ConsoleReader consoleReader = new ConsoleReader(authController);
        consoleReader.start();
    }
}
