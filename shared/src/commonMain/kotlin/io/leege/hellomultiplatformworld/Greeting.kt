package io.leege.hellomultiplatformworld

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, guess what the name is: ${platform.name.reversed()}"
    }
}