#!/usr/bin/env groovy
public class PipelineTest implements Serializable{

    String jdkVersion;
    String branchVersion;

    String getJdkVersion() {
        return jdkVersion
    }

    void setJdkVersion(String jdkVersion) {
        this.jdkVersion = jdkVersion
    }

    String getBranchVersion() {
        return branchVersion
    }

    void setBranchVersion(String branchVersion) {
        this.branchVersion = branchVersion
    }
}
