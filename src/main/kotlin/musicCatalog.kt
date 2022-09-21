import java.lang.Exception

fun main() {
    val musica1 = Song("Bentley", "Brocasito", 2022, 142508.0)
    musica1.getInfos()
    musica1.isFamous()
}

class Song {

    private var title: String
    private var artist: String
    private var year: Int
    private var reproductions: Double

    constructor(title:String, artist:String, year:Int, reproductions:Double){
        this.title = title
        this.artist = artist
        this.year = year
        this.reproductions = reproductions
    }

    fun getInfos() = println("$title, de $artist, lancado em $year.")

    fun isFamous() = if(reproductions >= 1000) {
        println("A musica eh famosa com $reproductions reproducoes")
    } else{
        println("A musica nao eh famosa e conta com $reproductions reproducoes")
    }
}