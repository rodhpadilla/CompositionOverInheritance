package exercise.multiCloudDeploymentPipeline.impl;

import exercise.multiCloudDeploymentPipeline.contract.SecurityScanner;
import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SonarQube implements SecurityScanner {
    @Override public void scan(final ApplicationArtifact app) {
        log.info("[SonarQube] Scanning <{}> Version: {}", app.getAppName(), app.getVersion());
    }
}
