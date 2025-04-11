package org.example.stateMachineUtilityHelper.simpleExampleProject1;

import org.example.stateMachineUtilityHelper.utility.StateMachine;

import java.util.Optional;

import static org.example.stateMachineUtilityHelper.simpleExampleProject1.SomeWorkflowPhase.*;

public class SomeEntityStateManagerImpl implements StateMachine<SomeEntity> {
    @Override
    public <E extends Enum<E>> SomeEntity transition(SomeEntity someEntity, E event) {
            return switch ((SomeWorkflowPhase) event) {
                case NOT_STARTED -> {
                    someEntity.setPhase(NOT_STARTED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield someEntity;
                }
                case STARTED -> {
                    someEntity.setPhase(STARTED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield someEntity;
                }
                case CANCELLED -> {
                    someEntity.setPhase(CANCELLED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield someEntity;
                }
                case COMPLETED -> {
                    someEntity.setPhase(COMPLETED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield someEntity;
                }
                default -> throw new IllegalStateException("some useful message to the caller");
            };
    }

    private void performSomeOperation() {
        System.out.println("performing some operation on entity with respect to this phase/stage and entity");
    }
    private void ensureStateChangeRespectsStateGuards() throws IllegalStateException {
        System.out.println("ensuring state change respects state machine guards...");

    }

    /*
    @Override
    public <E extends Enum<E>> SomeEntity transition(SomeEntity someEntity, E event) {
        if(event instanceof SomeWorkflowPhase) {
            return switch ((SomeWorkflowPhase) event) {
                case NOT_STARTED -> {
                    someEntity.setPhase(NOT_STARTED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield someEntity;
                }
                case STARTED -> {
                    someEntity.setPhase(STARTED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield  someEntity;
                }
                case CANCELLED ->  {
                    someEntity.setPhase(CANCELLED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield  someEntity;
                }
                case COMPLETED -> {
                    someEntity.setPhase(COMPLETED);
                    this.ensureStateChangeRespectsStateGuards();
                    this.performSomeOperation();
                    yield  someEntity;
                }
                default -> throw new IllegalStateException("some useful message to the caller");
            };
        }
        // you could have another if statement here, if this entity works with more than one EVENT enum type...
    }
    */
}
