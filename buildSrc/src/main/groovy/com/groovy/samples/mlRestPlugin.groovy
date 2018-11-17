package com.groovy.samples

import org.gradle.api.Plugin
import org.gradle.api.Project

class mlRestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {

        project.task("mlRestDeploy"){
            doLast{
                println "Deploying ML Rest Endpoints"
                println project.ProjectDescriptionText//access external properties defined in build.gradle
            }
        }

    }
}
