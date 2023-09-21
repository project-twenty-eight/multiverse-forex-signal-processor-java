package online.projecttwentyeight.universe;

import online.projecttwentyeight.recyclebin.configuration.Configuration;
import online.projecttwentyeight.optimization.evolutionarycomputation.EvolutionaryComputationWidget;
import online.projecttwentyeight.optimization.simulatedannealing.SimulatedAnnealingWidget;
import online.projecttwentyeight.recyclebin.trading.Account;
import online.projecttwentyeight.recyclebin.trading.Broker;
import online.projecttwentyeight.recyclebin.trading.Candlestick;

import java.util.List;
import java.util.UUID;

public class OptimizableTradingUniverse implements
        Universe,
        SimulatedAnnealingWidget<OptimizableTradingUniverse>,
        EvolutionaryComputationWidget
{

    public final UUID id = UUID.randomUUID();
    private Configuration configuration;

    private Broker broker;

    private Account tradingAccount;

    private List<Candlestick> candlestickList;
    @Override
    public void run() {

        System.out.println(this.id() + " // doing work...");

        System.out.println(this.id() + " // finished doing work. fitness: "+this.fitness());

    }

    @Override
    public Double fitness() {
        return 0.42;
    }

    @Override
    public OptimizableTradingUniverse mutate(OptimizableTradingUniverse optimizableTradingUniverse) {
        return null;
    }

    @Override
    public OptimizableTradingUniverse mutate() {
        return null;
    }
    //@Override
    //public OptimizableTradingUniverse reproduce(final OptimizableTradingUniverse optimizableTradingUniverse) {
      //  return null;
    //}

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public UUID id() {
return this.id;
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


    @Override
    public Object reproduce(Object o) {
        return null;
    }
}
