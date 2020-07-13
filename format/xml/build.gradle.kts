import org.spongepowered.configurate.build.core

plugins {
    id("org.spongepowered.configurate-component")
}

dependencies {
    api(core())
    testImplementation("com.google.guava:guava:29.0-jre")
}
