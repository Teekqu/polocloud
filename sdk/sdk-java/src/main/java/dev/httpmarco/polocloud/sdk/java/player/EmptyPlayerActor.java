package dev.httpmarco.polocloud.sdk.java.player;

import java.util.UUID;

public class EmptyPlayerActor implements PlayerActorAdapter {

    @Override
    public void message(UUID uuid, String message) {

    }

    @Override
    public void kick(UUID uuid, String message) {

    }

    @Override
    public void toServer(UUID uuid, String service) {

    }
}
