mvn -DaltDeploymentRepository=githubsnapshot::default::file:../mvn-repo/snapshots -DaltDeploymentRepository=githubrepo::default::file:/../mvn-repo/releases release:prepare
mvn -DaltDeploymentRepository=githubsnapshot::default::file:../mvn-repo/snapshots -DaltDeploymentRepository=githubrepo::default::file:/../mvn-repo/releases release:perform
