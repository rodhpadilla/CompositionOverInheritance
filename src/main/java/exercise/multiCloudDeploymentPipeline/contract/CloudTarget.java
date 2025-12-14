package exercise.multiCloudDeploymentPipeline.contract;

import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;

public interface CloudTarget {
    void deploy(ApplicationArtifact app);
}
