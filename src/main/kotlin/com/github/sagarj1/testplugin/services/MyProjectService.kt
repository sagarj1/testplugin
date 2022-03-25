package com.github.sagarj1.testplugin.services

import com.intellij.openapi.project.Project
import com.github.sagarj1.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
