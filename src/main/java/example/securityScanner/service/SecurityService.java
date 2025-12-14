package main.java.example.securityScanner.service;

import main.java.example.securityScanner.contract.ScanEngine;
import main.java.example.securityScanner.model.Target;

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
