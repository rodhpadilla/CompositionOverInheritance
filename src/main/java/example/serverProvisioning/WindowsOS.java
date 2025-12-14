package main.java.example.serverProvisioning;

public class WindowsOS implements OperatingSystem{
    @Override public void boot() {
        System.out.println("Booting Windows Server");
    }
}
