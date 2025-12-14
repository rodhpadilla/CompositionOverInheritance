package main.java.example.securityScanner;

import main.java.example.securityScanner.contract.ScanEngine;
import main.java.example.securityScanner.factory.EngineFactory;
import main.java.example.securityScanner.model.Target;
import main.java.example.securityScanner.model.Type;
import main.java.example.securityScanner.service.SecurityService;

public class Main {
    public static void main(String[] args) {

        // 1. Create Data (Model)
        Target myServer = new Target();
        myServer.ip = "192.168.1.250";
        myServer.type = Type.MALWARE;

        // 2. Ask for the Bean (The Component)
        ScanEngine selectedEngine = EngineFactory.getEngine(myServer.type);

        // 3. Compose the Service (Inject the Bean into the Container)
        SecurityService service = new SecurityService(selectedEngine);

        // 4. Run Logic
        service.runScan(myServer);
    }
}
