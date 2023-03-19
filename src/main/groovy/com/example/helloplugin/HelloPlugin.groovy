package com.example.helloplugin;

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {
    void apply(Project project) {
        ////def extension = project.extensions.create('greeting', HelloPluginExtension)
        project.task('hello') {
            doLast {
                println("Hello ..... from plugin")
                ////println extension.message.get() + ' from ' + extension.greeter.get() + ' in project: ' + project.name
            }
        }
    }
}