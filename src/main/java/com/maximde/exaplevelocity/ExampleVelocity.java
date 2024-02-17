package com.maximde.exaplevelocity;

import com.google.inject.Inject;
import com.maximde.exaplevelocity.commands.ExampleCommand;
import com.maximde.exaplevelocity.listeners.ProxyJoinListener;
import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(
        id = "exaplevelocity",
        name = "ExapleVelocity",
        authors = {"MaximDe"},
        version = "1.0"
)
public class ExampleVelocity {

    @Inject
    private Logger logger;
    @Inject
    private ProxyServer server;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        registerListener(new ProxyJoinListener(this));
        registerCommand("example", new ExampleCommand(this));
    }

    private void registerListener(Object listener) {
        this.server.getEventManager().register(this, listener);
    }
    private void registerCommand(String commandName, Command command) {
        server.getCommandManager().register(commandName, command);
    }
}
