package com.github.mrknrb.jetbrainsvisualstormplugin.services

import com.github.mrknrb.jetbrainsvisualstormplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
