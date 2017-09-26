#!/usr/bin/env groovy

import org.jfrog.hudson.*
import hudson.plugins.git.*
import hudson.plugins.git.util.*
import hudson.plugins.git.opt.*
import hudson.plugins.git.extensions.*
import hudson.plugins.git.extensions.impl.*


def initialize(body) {
    def pipelineTest = new PipelineTest();
    pipelineTest.jdkVersion = body.jdk;
    pipelineTest.branchVersion = body.branchVersion;
    return pipelineTest
}