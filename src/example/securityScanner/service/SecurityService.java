package example.securityScanner.service;

import example.securityScanner.contract.ScanEngine;
import example.securityScanner.model.Target;

public class SecurityService {
    private final ScanEngine engine;

    public SecurityService(ScanEngine engine) {
        this.engine = engine;
    }

    public void runScan(Target target) {
        System.out.println("--- Starting Security Audit ---");
        engine.Scan(target.ip);
    }
}
