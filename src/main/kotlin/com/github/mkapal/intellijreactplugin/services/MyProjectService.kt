package com.github.mkapal.intellijreactplugin.services

import com.github.mkapal.intellijreactplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
