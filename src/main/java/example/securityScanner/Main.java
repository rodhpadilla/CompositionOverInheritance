package example.securityScanner;

import example.securityScanner.contract.ScanEngine;
import example.securityScanner.factory.EngineFactory;
import example.securityScanner.model.Target;
import example.securityScanner.model.Type;
import example.securityScanner.service.SecurityService;

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
