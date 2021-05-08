package com.github.definitelynotasquid.razorgenrider.services

import com.github.definitelynotasquid.razorgenrider.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
