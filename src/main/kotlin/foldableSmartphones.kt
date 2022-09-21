open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone() : Phone(isScreenLightOn = false){

    var isFoldable: Boolean = true

    override fun switchOn() {
        if(isFoldable == false) {
            isScreenLightOn = true
        } else{
            isScreenLightOn = false
            println("Só é possível ligar a tela quando o smartphone não estiver dobrado")
        }

        return
    }

    fun openPhone() {
        if(isFoldable) {
            isFoldable = false
            switchOn()
        } else{
            isFoldable = true
            switchOn()
        }
    }
}