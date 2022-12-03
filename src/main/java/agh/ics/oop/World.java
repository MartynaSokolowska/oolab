package agh.ics.oop;
import javafx.application.Application;

public class World {
    public static void main(String [] args) {
        System.out.println("system rozpoczął działanie");
        try {
            Application.launch(App.class, args);
            System.out.println("System zakończył działanie");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}

