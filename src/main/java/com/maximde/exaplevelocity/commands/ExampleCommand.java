package com.maximde.exaplevelocity.commands;

import com.maximde.exaplevelocity.ExampleVelocity;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.command.SimpleCommand;

import java.util.ArrayList;
import java.util.List;

public class ExampleCommand implements SimpleCommand {

    private ExampleVelocity exampleVelocity;

    public ExampleCommand(ExampleVelocity exampleVelocity) {
        this.exampleVelocity = exampleVelocity;
    }

    @Override
    public void execute(Invocation invocation) {
        CommandSource sender = invocation.source();
        String[] args = invocation.arguments();
    }

    //tab complete
    @Override
    public List<String> suggest(Invocation invocation) {
        List<String> completions = new ArrayList<>();
        String[] args = invocation.arguments();
        //add to completions
        return completions;
    }
}
