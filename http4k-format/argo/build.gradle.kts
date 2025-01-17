description = "Http4k Argo JSON support"

dependencies {
    api(project(":http4k-format-core"))
    api("net.sourceforge.argo:argo:_")
    testImplementation(project(":http4k-core"))
    testImplementation(project(":http4k-contract"))
    testImplementation(project(":http4k-jsonrpc"))
    testImplementation(project(path = ":http4k-core", configuration ="testArtifacts"))
    testImplementation(project(path = ":http4k-format-core", configuration ="testArtifacts"))
    testImplementation(project(path = ":http4k-contract", configuration ="testArtifacts"))
    testImplementation(project(path = ":http4k-jsonrpc", configuration ="testArtifacts"))
}
