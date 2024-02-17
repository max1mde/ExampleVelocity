package com.maximde.exaplevelocity.listeners;

import com.maximde.exaplevelocity.ExampleVelocity;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.LoginEvent;
import com.velocitypowered.api.proxy.Player;

public record ProxyJoinListener(ExampleVelocity plugin) {
    @Subscribe
    public void onJoin(LoginEvent event) {
        Player player = event.getPlayer();
    }

}
