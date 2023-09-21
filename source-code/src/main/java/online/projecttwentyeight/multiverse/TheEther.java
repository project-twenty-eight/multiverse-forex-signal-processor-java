package online.projecttwentyeight.multiverse;

import online.projecttwentyeight.universe.Configuration;
import online.projecttwentyeight.universe.OptimizableTradingUniverse;
import online.projecttwentyeight.universe.Universe;

import java.util.HashSet;
import java.util.Set;

public class TheEther {
    public static Configuration getConfiguration() {

        return null;

    }  public static Set<Universe> createUniversePopulation(Configuration configuration) {

        Set sample = new HashSet();

        sample.add(new OptimizableTradingUniverse(configuration));
        sample.add(new OptimizableTradingUniverse(configuration));
        sample.add(new OptimizableTradingUniverse(configuration));
        sample.add(new OptimizableTradingUniverse(configuration));

        return sample;

    }
}
