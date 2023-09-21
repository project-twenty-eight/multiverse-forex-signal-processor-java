package online.projecttwentyeight.optimization.evolutionarycomputation;

import online.projecttwentyeight.optimization.ComputationWidget;
import online.projecttwentyeight.universe.OptimizableTradingUniverse;

public interface EvolutionaryComputationWidget<W> extends ComputationWidget   {

    public W reproduce(W w);

}
