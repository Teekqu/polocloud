package dev.httpmarco.polocloud.bridges.waterdog

import dev.httpmarco.polocloud.sdk.java.player.PlayerActorAdapter
import dev.waterdog.waterdogpe.ProxyServer
import java.util.UUID

class WaterdogPlayerActorAdapter : PlayerActorAdapter {

    override fun message(uuid: UUID?, message: String?) {
        ProxyServer.getInstance().getPlayer(uuid).sendMessage(message)
    }

    override fun kick(uuid: UUID?, message: String?) {
        ProxyServer.getInstance().getPlayer(uuid).disconnect(message)
    }

    override fun toServer(uuid: UUID?, service: String?) {
        ProxyServer.getInstance().getPlayer(uuid).connect(ProxyServer.getInstance().getServerInfo(service))
    }
}