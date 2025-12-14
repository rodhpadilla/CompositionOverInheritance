package exercise.multiCloudDeploymentPipeline.impl;

import exercise.multiCloudDeploymentPipeline.contract.BuildTool;
import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Maven implements BuildTool {
    @Override public void compile(final ApplicationArtifact app) {
        log.info("[Maven] Compiling <{}> Version: {}", app.getAppName(), app.getVersion());;
    }
}
