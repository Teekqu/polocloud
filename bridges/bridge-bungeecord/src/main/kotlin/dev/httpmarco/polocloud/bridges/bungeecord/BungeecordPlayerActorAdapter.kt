package dev.httpmarco.polocloud.bridges.bungeecord

import dev.httpmarco.polocloud.sdk.java.player.PlayerActorAdapter
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.chat.TextComponent
import java.util.UUID

class BungeecordPlayerActorAdapter : PlayerActorAdapter {

    override fun message(uuid: UUID?, message: String?) {
        ProxyServer.getInstance().getPlayer(uuid).sendMessage(TextComponent(message))
    }

    override fun kick(uuid: UUID?, message: String?) {
        ProxyServer.getInstance().getPlayer(uuid).disconnect(TextComponent(message))
    }

    override fun toServer(uuid: UUID?, service: String?) {
        ProxyServer.getInstance().getPlayer(uuid).connect(ProxyServer.getInstance().getServerInfo(service))
    }
}