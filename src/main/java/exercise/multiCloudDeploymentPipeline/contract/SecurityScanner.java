package exercise.multiCloudDeploymentPipeline.contract;

import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;

public interface SecurityScanner {
    void scan(ApplicationArtifact app);
}
