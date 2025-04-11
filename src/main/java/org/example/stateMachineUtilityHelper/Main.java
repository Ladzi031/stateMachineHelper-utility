package org.example.stateMachineUtilityHelper;

import org.example.stateMachineUtilityHelper.simpleExampleProject1.SomeEntity;
import org.example.stateMachineUtilityHelper.simpleExampleProject1.SomeEntityStateManagerImpl;
import org.example.stateMachineUtilityHelper.simpleExampleProject1.SomeWorkflowPhase;
import org.example.stateMachineUtilityHelper.utility.StateMachine;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // state-machine caller code: you can play with the state-machine in here...

        StateMachine<SomeEntity> stateMachine = new SomeEntityStateManagerImpl();
        SomeEntity myEntity = new SomeEntity(1L, "Test", getRandomPhase());
        stateMachine.transition(myEntity, getRandomPhase());

    }
    public static SomeWorkflowPhase getRandomPhase() {
      // EnumSet<SomeWorkflowPhase> phases = EnumSet.allOf(SomeWorkflowPhase.class);
        var phases = List.of(SomeWorkflowPhase.values());
       return phases.get(new Random().nextInt(phases.size()));
    }
}
