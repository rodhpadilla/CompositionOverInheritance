package example.securityScanner.impl;

import example.securityScanner.contract.ScanEngine;

public class PortScanEngine implements ScanEngine {
    @Override public void Scan(final String ip) {
        System.out.println("Checking open ports on " + ip);
    }
}
