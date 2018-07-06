#!/usr/bin/env groovy

import groovy.json.JsonSlurper
import org.jfrog.hudson.*
import hudson.plugins.git.*
import hudson.plugins.git.util.*
import hudson.plugins.git.opt.*
import hudson.plugins.git.extensions.*
import hudson.plugins.git.extensions.impl.*
import groovy.json.JsonSlurper
import org.jfrog.hudson.*
import hudson.plugins.git.*
import hudson.plugins.git.util.*
import hudson.plugins.git.opt.*
import hudson.plugins.git.extensions.*
import hudson.plugins.git.extensions.impl.*
/**
 * martaPipeline.groovy
 *
 * Marta Pipeline
 * @param body	Closure of execution
 *
 * Inside the body of the pipeline, it's possible to provide the following pairs key - value as pipeline parameters
 *
 */
def call(body) {

    /** evaluate the body block, and collect configuration into the object **/
    def config = [:]
    def pipelineTest = null;
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    /** **/
    stage('Initialize') {
        echo "\u2776 Initialize"
        
        echo "Pipeline " + pipelineTest.jdkVersion
    }
    stage('Checking-QA') {
        echo "\u2776 Initialize"
        
        echo "Pipeline " + pipelineTest.jdkVersion
    }
}