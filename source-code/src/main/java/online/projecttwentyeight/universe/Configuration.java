package online.projecttwentyeight.universe;

import online.projecttwentyeight.optimization.evolutionarycomputation.EvolutionaryComputationWidget;
import online.projecttwentyeight.optimization.simulatedannealing.SimulatedAnnealingWidget;
import online.projecttwentyeight.trading.*;

public class Configuration implements
        SimulatedAnnealingWidget<Configuration>,
        EvolutionaryComputationWidget<Configuration> {

    private Broker broker;

    private Account tradingAccount;

    private CurrencyPair currencyPair;

    private Granularity granularity;

    private BuyOrSell buyOrSell;

    private TradingRule tradingRule;

    @Override
    public Double fitness() {
        return null;
    }

    @Override
    public Configuration reproduce(Configuration configuration) {
        return null;
    }

    @Override
    public Configuration mutate(Configuration configuration) {
        return null;
    }

    @Override
    public OptimizableTradingUniverse mutate() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
