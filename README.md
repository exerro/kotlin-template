<h1 align="center">
  kotlin-template
</h1>

<p align="center">
  <a href="https://jitpack.io/#exerro/kotlin-template"><img src="https://jitpack.io/v/exerro/kotlin-template.svg" alt="JitPack badge"/></a>
  <img src="https://github.com/exerro/kotlin-template/actions/workflows/CI.yml/badge.svg" alt="Build passing status">
</p>

A template for kotlin projects.

## Updating this template

* Change `kotlin-template` in `settings.gradle.kts`
* Change `kotlin-template` in `build.gradle.kts`
* Change `kotlin-template` in this README.

## Creating a release

* Update version in `build.gradle.kts`
* Run `./gradlew clean build test publishToMavenLocal`
* Update version in this README.
* Run `git tag <version>`
* Run `git push --tags`

## Use the library

#### With Gradle (`build.gradle.kts`)

```kotlin
repositories {
    // ...
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("me.exerro:kotlin-template:1.0.0")
}
```

#### Download from [releases](https://github.com/exerro/kotlin-template/releases)

#### For more, see [JitPack](https://jitpack.io/#exerro/kotlin-template)
