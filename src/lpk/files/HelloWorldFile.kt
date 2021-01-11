package lpk.files

import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    val helloWorld = Paths.get("files/HelloWorld.txt")
    val strings = Files.readAllLines(helloWorld)
    println("strings = $strings")
}