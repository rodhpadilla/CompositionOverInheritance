package main.java.example.securityScanner.factory;

import main.java.example.securityScanner.contract.ScanEngine;
import main.java.example.securityScanner.impl.MalwareScanEngine;
import main.java.example.securityScanner.impl.PortScanEngine;
import main.java.example.securityScanner.model.Type;

public class EngineFactory {
    public static ScanEngine getEngine(Type type) {
        if (type.equals(Type.PORT)) return new PortScanEngine();
        if (type.equals(Type.MALWARE)) return new MalwareScanEngine();
        throw new IllegalArgumentException("Unknown Type");
    }
}
