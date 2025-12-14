package exercise.multiCloudDeploymentPipeline.impl;

import exercise.multiCloudDeploymentPipeline.contract.BuildTool;
import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Gradle implements BuildTool {
    @Override public void compile(final ApplicationArtifact app) {
        log.info("[Gradle] Compiling <{}> Version: {}", app.getAppName(), app.getVersion());
    }
}
