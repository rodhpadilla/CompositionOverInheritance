package exercise.multiCloudDeploymentPipeline.model;

import lombok.Data;

@Data
public class ApplicationArtifact {
    private String appName;
    private String version;

    public ApplicationArtifact(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }
}
