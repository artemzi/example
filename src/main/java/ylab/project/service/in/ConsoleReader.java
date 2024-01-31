package ylab.project.service.in;

import ylab.project.controller.AuthController;
import ylab.project.service.out.ConsoleMenuWriter;

import java.util.Scanner;

public class ConsoleReader {

    private final AuthController authController;


    public ConsoleReader(AuthController authController) {
        this.authController = authController;
    }

    public void start(){
        try{
            ConsoleMenuWriter.authMenu();
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    authController.auth();
                    break;
                case 2:
                    authController.registration();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("неправильный input");
                    start();
                    break;
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Incorrect input");
        }

    }
    private void login(){

    }
    private void reg(){
        System.out.println("REGISTRATION\n");


    }
}
