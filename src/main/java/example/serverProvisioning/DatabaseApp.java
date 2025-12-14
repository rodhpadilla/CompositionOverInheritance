package main.java.example.serverProvisioning;

public class DatabaseApp implements Application {
    @Override public void install() {
        System.out.println("Installing MySQL...");
    }
}
