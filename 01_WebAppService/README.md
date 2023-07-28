# Simple Azure Web Application Service Deployment

Rename `project.properties.example` in `src/main/resources/project.properties.example` to `project.properties` and update the configurations based on the Azure subscription.

Example:

```
azure.subscriptionId.properties=${azure subscription id}
azure.resourceGroup.properties=${azure resource group}
azure.appName.properties=azuredojo-webapp
azure.pricingTier.properties=B2
azure.region.properties=eastus
azure.runtime.os.properties=linux
azure.webContainer.properties=Java SE
azure.javaVersion.properties=Java 17
```
