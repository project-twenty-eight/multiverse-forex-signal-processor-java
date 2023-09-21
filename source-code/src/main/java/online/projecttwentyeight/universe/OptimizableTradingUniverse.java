package online.projecttwentyeight.universe;

import online.projecttwentyeight.recyclebin.configuration.Configuration;
import online.projecttwentyeight.recyclebin.optimization.evolutionarycomputation.EvolutionaryComputationWidget;
import online.projecttwentyeight.recyclebin.optimization.simulatedannealing.SimulatedAnnealingWidget;
import online.projecttwentyeight.recyclebin.trading.Account;
import online.projecttwentyeight.recyclebin.trading.Broker;
import online.projecttwentyeight.recyclebin.trading.Candlestick;

import java.util.List;

public class OptimizableTradingUniverse implements

        Universe,
        SimulatedAnnealingWidget<OptimizableTradingUniverse>,
        EvolutionaryComputationWidget
{

    private Configuration configuration;

    private Broker broker;

    private Account tradingAccount;

    private List<Candlestick> candlestickList;
    @Override
    public void run() {

        System.out.println(this.id + " // doing work...");

        System.out.println(this.id + " // finished doing work. fitness: "+this.calculateFitness());

    }

    @Override
    public Double calculateFitness() {
        return 0.42;
    }

    @Override
    public OptimizableTradingUniverse mutate(final OptimizableTradingUniverse optimizableTradingUniverse) {
        return null;
    }

    @Override
    public String toString() {
        return "OptimizableTradingUniverse{" +
                "configuration=" + configuration +
                ", broker=" + broker +
                ", tradingAccount=" + tradingAccount +
                ", candlestickList=" + candlestickList +
                '}';
    }
}
