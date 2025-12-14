# The "Multi-Cloud Deployment Pipeline"

## 📝 The Business Scenario
You are building the CI/CD engine for a software company.
Developers need to define custom **Pipelines** to release their code.

A Pipeline is **Composed** of three distinct stages. Every pipeline *must* have these three stages, but the *tools* used in each stage vary wildly between teams.

**The Three Stages (The Slots):**
1.  **Build:** Compiles the code.
    * *Tools:* **Maven** (standard Java) or **Gradle** (modern Java).
2.  **Security Scan:** Checks for vulnerabilities.
    * *Tools:* **SonarQube** (Code quality) or **Snyk** (Dependency check).
3.  **Deploy:** Pushes the artifact to the cloud.
    * *Tools:* **AWS** (Elastic Beanstalk) or **Azure** (App Service).

**The Problem:**
* Team A wants: Maven + SonarQube + AWS.
* Team B wants: Gradle + Snyk + Azure.
* Team C wants: Maven + Snyk + AWS.

If you used **Inheritance**, you would need a class `MavenSonarAwsPipeline`, `GradleSnykAzurePipeline`, etc. (Total nightmare).
Instead, you must use **Composition**. You will build a generic `DeploymentPipeline` that has slots for these three components.

---

## 🚀 Your Mission

### 1. The Model (Data)
* Create `ApplicationArtifact`.
* It should hold data like `appName` and `version`.

### 2. The Contracts (Interfaces)
You need three separate interfaces (one for each slot).
* `BuildTool` -> method: `compile(ApplicationArtifact app)`
* `SecurityScanner` -> method: `scan(ApplicationArtifact app)`
* `CloudTarget` -> method: `deploy(ApplicationArtifact app)`

### 3. The Beans (Implementations)
Create the specific workers for the tools mentioned above (Maven, Gradle, SonarQube, Snyk, AWS, Azure).
* *Simulation:* Just print clear logs like `[Maven] Compiling <appName>...`

### 4. The Container (Service)
Create `DeploymentPipeline`.
* **Composition:** It must **HAVE** a `BuildTool`, a `SecurityScanner`, and a `CloudTarget`.
* **Injection:** These must be plugged in via the Constructor.
* **Logic:** A method `runPipeline(ApplicationArtifact app)` that executes the stages in order (Build -> Scan -> Deploy).

### 5. The Factory (Decider)
Create `PipelineFactory`.
* It should allow you to assemble a pipeline easily.
* *Challenge:* Try to make a method that accepts strings for all 3 choices and returns a fully assembled `DeploymentPipeline`.

### 6. The Proof (Main)
In `Main.java`, simulate two different teams:
* **Team Alpha:** Uses Maven, SonarQube, and AWS.
* **Team Beta:** Uses Gradle, Snyk, and Azure.
* Run both pipelines on the same `ApplicationArtifact`.