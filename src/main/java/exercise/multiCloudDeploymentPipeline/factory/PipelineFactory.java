package exercise.multiCloudDeploymentPipeline.factory;

import exercise.multiCloudDeploymentPipeline.contract.BuildTool;
import exercise.multiCloudDeploymentPipeline.contract.CloudTarget;
import exercise.multiCloudDeploymentPipeline.contract.SecurityScanner;
import exercise.multiCloudDeploymentPipeline.impl.AWS;
import exercise.multiCloudDeploymentPipeline.impl.Azure;
import exercise.multiCloudDeploymentPipeline.impl.Gradle;
import exercise.multiCloudDeploymentPipeline.impl.Maven;
import exercise.multiCloudDeploymentPipeline.impl.Snyk;
import exercise.multiCloudDeploymentPipeline.impl.SonarQube;
import exercise.multiCloudDeploymentPipeline.service.DeploymentPipeline;

public class PipelineFactory {

    public static BuildTool getBuildTool(String buildToolName) {
        final BuildTool tool;
        if (buildToolName.equalsIgnoreCase("maven")) {
            tool = new Maven();
        } else if (buildToolName.equalsIgnoreCase("gradle")) {
            tool = new Gradle();
        } else {
            throw new IllegalArgumentException("Unknown BuildTool");
        }
        return tool;
    }

    public static SecurityScanner getSecurityScanner(String SecurityScannerName) {
        final SecurityScanner scanner;
        if (SecurityScannerName.equalsIgnoreCase("sonarqube")) {
            scanner = new SonarQube();
        } else if (SecurityScannerName.equalsIgnoreCase("snyk")) {
            scanner = new Snyk();
        } else {
            throw new IllegalArgumentException("Unknown SecurityScanner");
        }
        return scanner;
    }

    public static CloudTarget getCloudTarget(String CloudProviderName){
        final CloudTarget cloud;
        if (CloudProviderName.equalsIgnoreCase("aws")) {
            cloud = new AWS();
        } else if (CloudProviderName.equalsIgnoreCase("azure")) {
            cloud = new Azure();
        } else {
            throw new IllegalArgumentException("Unknown CloudProvider");
        }
        return cloud;
    }

    public static DeploymentPipeline createPipeline(String buildTool, String scanner, String cloud) {
        return new DeploymentPipeline(
                getBuildTool(buildTool),
                getSecurityScanner(scanner),
                getCloudTarget(cloud)
        );
    }
}
