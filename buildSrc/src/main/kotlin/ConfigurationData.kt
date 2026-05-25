object ConfigurationData {
    const val compileSdk = 34
    const val targetSdk = 33
    const val minSdk = 21
    // GSN fork: republish under our own Maven coords so it can't collide
    // with upstream `org.matrix.rustcomponents` if both are ever on the
    // classpath at the same time. See docs/native-calls-m4-forks.md in
    // the gsnapp repo.
    const val publishGroupId = "app.getsafenow.matrix.rustcomponents"
    const val versionNameCrypto =
        "${BuildVersionsCrypto.majorVersion}.${BuildVersionsCrypto.minorVersion}.${BuildVersionsCrypto.patchVersion}"
    // GSN fork suffix `-gsn1` — bump on every fork-cut release. Underlying
    // upstream version stays at 26.04.15 until we deliberately roll forward.
    const val versionNameSdk =
        "${BuildVersionsSDK.majorVersion}.${BuildVersionsSDK.minorVersion}.${BuildVersionsSDK.patchVersion}-gsn1"
}
