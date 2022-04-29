package ch.thipok.koinxrealm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}