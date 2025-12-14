package exercise.multiCloudDeploymentPipeline.impl;

import exercise.multiCloudDeploymentPipeline.contract.SecurityScanner;
import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Snyk implements SecurityScanner {
    @Override public void scan(final ApplicationArtifact app) {
        log.info("[Snyk] Scanning <{}> Version: {}", app.getAppName(), app.getVersion());
    }
}
