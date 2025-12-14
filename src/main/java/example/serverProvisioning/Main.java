package example.serverProvisioning;

public class Main {
    public static void main(String[] args) {

        // Scenario 1: A linux Web Server
        Server web01 = new Server(new LinuxOS(), new WebServerApp());
        web01.provision();

        // Scenario 2: A Windows Database
        Server db01 = new Server(new WindowsOS(), new DatabaseApp());
        db01.provision();

        // Scenario 3: A Linux DB
        Server db02 = new Server(new LinuxOS(), new DatabaseApp());
        db02.provision();
    }
}
