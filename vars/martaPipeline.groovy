#!/usr/bin/env groovy


/**
 * martaPipeline.groovy
 *
 * Marta Pipeline
 * @param body	Closure of execution
 *
 * Inside the body of the pipeline, it's possible to provide the following pairs key - value as pipeline parameters
 *
 */
def call() {



    /** **/
    stage('Build') {
        echo "\u2776 Initialize"
        echo "Pipeline Init" 
    }
    stage('Test) {
        echo "\u2776 Initialize"
        echo "Pipeline checking" 
    }
    
   
}
