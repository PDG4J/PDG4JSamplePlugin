package me.theseems;

import org.pf4j.Extension;
import ru.hse.pdg4j.api.plugin.Pdg4jExtension;
import ru.hse.pdg4j.api.user.BootstrapContext;
import ru.hse.pdg4j.impl.builder.PipelineGraphBuilder;

@Extension
public class SimpleExtension implements Pdg4jExtension {
    @Override
    public String getName() {
        return "simple";
    }

    @Override
    public void extendAnalysisPipeline(PipelineGraphBuilder analysisGraphBuilder, BootstrapContext context) {
        MyCustomOptions myCustomOptions = extractCustomOptions(context);
        analysisGraphBuilder.task(new MyCustomCheckTask(myCustomOptions.getMyString()));
    }

    @Override
    public Object getCustomOptions() {
        return new MyCustomOptions();
    }
}