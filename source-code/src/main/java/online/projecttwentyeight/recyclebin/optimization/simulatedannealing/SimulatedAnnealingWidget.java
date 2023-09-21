package online.projecttwentyeight.recyclebin.optimization.simulatedannealing;

import online.projecttwentyeight.recyclebin.optimization.ComputationWidget;

public interface SimulatedAnnealingWidget<W> extends ComputationWidget {

public W mutate(final W w);



}
