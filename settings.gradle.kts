pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "𝙷𝙾𝚄𝚂𝚂𝙴𝙼_𝚉𝙾𝚁𝙶𝚄𝙸_𝚂𝙿𝙴𝙴𝙲𝙷 _𝚃𝙾 _𝚃𝙴𝚇𝚃"
include(":app")
 