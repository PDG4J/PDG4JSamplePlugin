package me.theseems;

import ru.hse.pdg4j.api.PipelineContext;
import ru.hse.pdg4j.api.PipelineTask;
import ru.hse.pdg4j.api.check.task.CheckPipelineTask;
import ru.hse.pdg4j.impl.task.basic.SourceInitialCheckTask;

import java.util.Collection;
import java.util.List;

public class MyCustomCheckTask extends CheckPipelineTask {
    private String myString;

    public MyCustomCheckTask(String myString) {
        super("MyCustomCheck");
        this.myString = myString;
    }

    @Override
    public void perform(PipelineContext pipelineContext) {
        warning("My string is " + myString);
        success();
    }

    @Override
    public Collection<Class<? extends PipelineTask<?>>> getRequirements() {
        return List.of(SourceInitialCheckTask.class);
    }
}
