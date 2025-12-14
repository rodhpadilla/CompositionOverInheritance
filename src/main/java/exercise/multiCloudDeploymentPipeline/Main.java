package exercise.multiCloudDeploymentPipeline;

import exercise.multiCloudDeploymentPipeline.factory.PipelineFactory;
import exercise.multiCloudDeploymentPipeline.model.ApplicationArtifact;
import exercise.multiCloudDeploymentPipeline.service.DeploymentPipeline;

public class Main {
    public static void main(String[] args) {

        ApplicationArtifact monitoringApp = new ApplicationArtifact("NOCMonitoringApp", "v12.9");

        // Team Alpha
        DeploymentPipeline deploymentPipelineAlpha = PipelineFactory.createPipeline(
                "Maven", "SonarQube", "AWS");
        deploymentPipelineAlpha.runPipeline(monitoringApp);
//
        // Team Beta
        DeploymentPipeline deploymentPipelineBeta = PipelineFactory.createPipeline(
                "Gradle", "Snyk", "Azure");
        deploymentPipelineBeta.runPipeline(monitoringApp);

    }
}
