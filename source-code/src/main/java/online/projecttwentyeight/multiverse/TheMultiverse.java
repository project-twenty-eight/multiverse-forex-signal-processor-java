package online.projecttwentyeight.multiverse;

import online.projecttwentyeight.universe.Configuration;
import online.projecttwentyeight.universe.Universe;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TheMultiverse {

    private static final Set<Universe> universeSubstrate = new HashSet();

    public static void main(final String[] commandLineArguments) throws IOException {

        System.out.println("In the beginning there was a developer.");

        System.out.println("This developer said \"Do Work\".");

        Configuration configuration = TheEther.getConfiguration();

        TheMultiverse.universeSubstrate.addAll(
                TheEther.createUniversePopulation(configuration)
        );

        for (final Universe someUniverse : TheMultiverse.universeSubstrate) {

            System.out.println("launching universe: " + someUniverse);

            someUniverse.run();

        }

    }

}
