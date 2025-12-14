package exercise.multiCloudDeploymentPipeline.service;

import exercise.multiCloudDeploymentPipeline.contract.BuildTool;
import exercise.multiCloudDeploymentPipeline.contract.CloudTarget;
import exercise.multiCloudDeploymentPipeline.contract.SecurityScanner;
import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;

public class DeploymentPipeline {
    private final BuildTool tool;
    private final SecurityScanner scanner;
    private final CloudTarget cloud;

    public DeploymentPipeline(BuildTool tool, SecurityScanner scanner, CloudTarget cloud) {
        this.tool = tool;
        this.scanner = scanner;
        this.cloud = cloud;
    }

    public void runPipeline(ApplicationArtifact app) {
        tool.compile(app);
        scanner.scan(app);
        cloud.deploy(app);
    }
}
