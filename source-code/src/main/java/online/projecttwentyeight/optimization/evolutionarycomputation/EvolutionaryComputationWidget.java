package online.projecttwentyeight.optimization.evolutionarycomputation;

import online.projecttwentyeight.optimization.ComputationWidget;

public interface EvolutionaryComputationWidget<W> extends ComputationWidget {

    W reproduce(W w);

}
