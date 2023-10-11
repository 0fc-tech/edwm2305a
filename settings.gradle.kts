pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TP"
include(":app")
include(":cadox")
include(":mod4demo")
include(":mod4demobinding")
include(":mod4tpsupp")
include(":mod5nav")
include(":mod5demosupp")
include(":mod6intent")
include(":mod8viewmodel")
include(":mod8dicelauncher")
include(":mod9room")
include(":tpnews")
include(":mod10recettes")
