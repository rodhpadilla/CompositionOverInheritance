package example.securityScanner.factory;

import example.securityScanner.contract.ScanEngine;
import example.securityScanner.impl.MalwareScanEngine;
import example.securityScanner.impl.PortScanEngine;
import example.securityScanner.model.Type;

public class EngineFactory {
    public static ScanEngine getEngine(Type type) {
        if (type.equals(Type.PORT)) return new PortScanEngine();
        if (type.equals(Type.MALWARE)) return new MalwareScanEngine();
        throw new IllegalArgumentException("Unknown Type");
    }
}
