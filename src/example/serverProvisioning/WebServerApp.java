package example.serverProvisioning;

public class WebServerApp implements Application{
    @Override public void install() {
        System.out.println("Installing Nginx...");
    }
}
