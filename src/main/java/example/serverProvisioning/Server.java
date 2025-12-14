package example.serverProvisioning;

public class Server {
    private final OperatingSystem os;
    private final Application app;

    public Server(OperatingSystem os, Application app){
        this.os = os;
        this.app = app;
    }

    public void provision(){
        System.out.println("--- Starting Provisioning ---");
        os.boot();
        app.install();
        System.out.println("--- Server Ready ---");
    }
}
