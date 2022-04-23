package cc.woverflow.easeify

import net.fabricmc.api.ClientModInitializer
import java.io.File

class Easeify : ClientModInitializer {
    override fun onInitializeClient() {
        if (!modDir.exists()) {
            modDir.mkdirs()
        }
    }

    companion object {
        const val NAME = "@NAME@"
        const val ID = "@ID@"
        const val VER = "@VER@"
        val modDir = File("./W-OVERFLOW/$NAME")
    }
}