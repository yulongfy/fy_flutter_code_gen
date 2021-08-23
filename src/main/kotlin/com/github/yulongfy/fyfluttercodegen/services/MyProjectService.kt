package com.github.yulongfy.fyfluttercodegen.services

import com.github.yulongfy.fyfluttercodegen.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
