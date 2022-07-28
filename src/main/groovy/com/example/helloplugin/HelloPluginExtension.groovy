package com.example.helloplugin

import org.gradle.api.provider.Property

interface HelloPluginExtension {
    abstract Property<String> getMessage();
    abstract Property<String> getGreeter();
}