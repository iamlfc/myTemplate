package com.github.iamlfc.mytemplate.services

import com.intellij.openapi.project.Project
import com.github.iamlfc.mytemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
