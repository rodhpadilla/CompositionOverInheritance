package main.java.example.serverProvisioning;

public class LinuxOS implements OperatingSystem {
    @Override public void boot() {
        System.out.println("Booting Kernel v5.4....");
    }
}
