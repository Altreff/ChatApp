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

        maven {
            url = uri("https://maven.pkg.github.com/Altreff/ChatLibrary")
            credentials {
                username = providers.gradleProperty("gpr.user").orElse(System.getenv("USERNAME_GITHUB")).get()
                password = providers.gradleProperty("gpr.token").orElse(System.getenv("TOKEN_GITHUB")).get()
            }

        }
    }
}

rootProject.name = "ChatApp"
include(":app")
 