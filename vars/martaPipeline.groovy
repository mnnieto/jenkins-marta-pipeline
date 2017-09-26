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

def call(body) {

    /** evaluate the body block, and collect configuration into the object **/
    def config = [:]
    def pipelineTest
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    /** **/
    stage('\u2776 Initialize') {
        echo "\u2776 Initialize"
        pipelineTest = configPipeline.initialize(config)
        echo "Pipeline " + pipelineTest.jdkVersion
    }

}