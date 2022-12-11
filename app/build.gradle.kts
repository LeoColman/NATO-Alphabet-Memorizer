import org.gradle.api.JavaVersion.VERSION_1_8
import java.util.Properties

plugins {
  id("com.android.application")
  kotlin("android")
  id("io.gitlab.arturbosch.detekt").version("1.22.0")
}

android {
  namespace = "br.com.colman.nato"
  compileSdk = 33

  defaultConfig {
    applicationId = "br.com.colman.nato"
    minSdk = 21
    versionCode = 100
    versionName = "1.0.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  signingConfigs {
    val keystore = rootProject.file("release-keystore.keystore")
    val keystoreSecret = rootProject.file("release-keystore.keystore.secret")

    if(!keystore.exists() && keystoreSecret.exists()) {
      logger.warn("Impossible to create signing configuration with files encrypted")
      return@signingConfigs
    }
    val keystoreProperties = Properties().apply {
      load(rootProject.file("keystore.properties").inputStream())
    }

    create("signed") {
      storeFile = keystore
      storePassword = keystoreProperties.getProperty("KEYSTORE_PASSWORD")
      keyAlias = keystoreProperties.getProperty("SIGNING_KEY_ALIAS")
      keyPassword = keystoreProperties.getProperty("SIGNING_KEY_PASSWORD")
    }
  }

  buildTypes {
    named("release") {
      isMinifyEnabled = true
    }

    named("debug") {
      applicationIdSuffix = ".debug"
      isPseudoLocalesEnabled = true
      isDebuggable = true
    }

    if(signingConfigs.findByName("self-sign") == null) return@buildTypes
    create("signedRelease") {
      isMinifyEnabled = true
      signingConfig = signingConfigs.getByName("signed")
    }
  }

  compileOptions {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }

  testOptions {
    unitTests.all { it.useJUnitPlatform() }
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.get()
  }
}

dependencies {
  implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
  implementation("androidx.activity:activity-compose:1.3.1")
  implementation("androidx.compose.ui:ui:${libs.versions.compose.get()}")
  implementation("androidx.compose.ui:ui-tooling-preview:${libs.versions.compose.get()}")
  implementation("androidx.compose.material3:material3:1.0.0-alpha02")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.3")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:${libs.versions.compose.get()}")
  debugImplementation("androidx.compose.ui:ui-tooling:${libs.versions.compose.get()}")
  debugImplementation("androidx.compose.ui:ui-test-manifest:${libs.versions.compose.get()}")

  // Compose
  implementation(libs.bundles.compose)

  // Kotest
  testImplementation(libs.bundles.kotest)
  testImplementation(libs.kotest.runner.junit5) {
    because("Kotest Runner JUnit5 isn't supported in Android Test Implementation")
  }
  androidTestImplementation(libs.bundles.kotest)
}

detekt {
  buildUponDefaultConfig = true
}
