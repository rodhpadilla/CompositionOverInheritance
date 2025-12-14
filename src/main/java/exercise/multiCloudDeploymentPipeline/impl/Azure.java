package exercise.multiCloudDeploymentPipeline.impl;

import exercise.multiCloudDeploymentPipeline.contract.CloudTarget;
import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Azure implements CloudTarget {
    @Override public void deploy(final ApplicationArtifact app) {
        log.info("[Azure] Deploying <{}> Version: {}", app.getAppName(), app.getVersion());
    }
}
