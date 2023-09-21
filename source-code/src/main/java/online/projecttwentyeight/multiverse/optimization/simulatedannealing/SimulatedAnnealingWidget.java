package online.projecttwentyeight.multiverse.optimization.simulatedannealing;

import online.projecttwentyeight.multiverse.optimization.ComputationWidget;

public interface SimulatedAnnealingWidget<W> extends ComputationWidget {

public SimulatedAnnealingWidget<W> mutate(final SimulatedAnnealingWidget<W> simulatedAnnealingWidget);



}
