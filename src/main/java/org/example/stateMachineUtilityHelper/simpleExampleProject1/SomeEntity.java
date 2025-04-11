package org.example.stateMachineUtilityHelper.simpleExampleProject1;

public class SomeEntity {
    private Long entityId;
    private String name;
    private SomeWorkflowPhase phase = SomeWorkflowPhase.NOT_STARTED;

    public SomeEntity() {
    }

    public SomeEntity(Long entityId, String name, SomeWorkflowPhase phase) {
        this.entityId = entityId;
        this.name = name;
        this.phase = phase;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SomeWorkflowPhase getPhase() {
        return phase;
    }

    public void setPhase(SomeWorkflowPhase phase) {
        this.phase = phase;
    }
}
