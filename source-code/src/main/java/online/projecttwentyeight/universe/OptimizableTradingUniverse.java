package online.projecttwentyeight.universe;

import java.util.UUID;

public class OptimizableTradingUniverse implements
        Universe {

    public final UUID id = UUID.randomUUID();

    private final Configuration configuration;


    //private List<Candlestick> candlestickList;

    public OptimizableTradingUniverse(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void run() {

        System.out.println();

        System.out.println(this.id() + " // doing work...");

        System.out.println(this.id() + " // finished doing work.");

    }

    @Override
    public UUID id() {
        return this.id;
    }

}
