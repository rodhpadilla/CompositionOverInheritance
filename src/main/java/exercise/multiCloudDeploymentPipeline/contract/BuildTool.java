package exercise.multiCloudDeploymentPipeline.contract;

import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;

public interface BuildTool {
    void compile(ApplicationArtifact app);
}
