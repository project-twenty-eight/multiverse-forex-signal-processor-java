package online.projecttwentyeight.universe;

import java.util.HashSet;
import java.util.Set;

public class UniverseFacade {
    public static Set<Universe> createUniversePopulation() {

        Set sample =  new HashSet();

        sample.add(new OptimizableTradingUniverse());
        sample.add(new OptimizableTradingUniverse());
        sample.add(new OptimizableTradingUniverse());
        sample.add(new OptimizableTradingUniverse());

        return sample;

    }
}
