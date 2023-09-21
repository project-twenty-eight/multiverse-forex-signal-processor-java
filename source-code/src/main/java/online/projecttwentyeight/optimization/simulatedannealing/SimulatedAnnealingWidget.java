package online.projecttwentyeight.optimization.simulatedannealing;

import online.projecttwentyeight.optimization.ComputationWidget;
import online.projecttwentyeight.universe.OptimizableTradingUniverse;

public interface SimulatedAnnealingWidget<W> extends ComputationWidget {

    W mutate(final W w);


    OptimizableTradingUniverse mutate();
}
