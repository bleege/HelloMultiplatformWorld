package io.leege.hellomultiplatformworld

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Guess what the name is:  ${platform.name.reversed()}!" +
                "\nThere are only ${daysUntilNewYear()} days left until New Year! 🎆"
    }
}