package online.projecttwentyeight.multiverse;

import online.projecttwentyeight.universe.Universe;
import online.projecttwentyeight.universe.UniverseFacade;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TheMultiverse {

    private static Set<Universe> universeSubstrate=new HashSet();

    public static void main(final String[] commandLineArguments) throws IOException {

        System.out.println("In the beginning there was a developer.");
        System.out.println("This developer said \"Do Work\".");

        TheMultiverse.universeSubstrate.addAll(
                UniverseFacade.createUniversePopulation()
        );

        for(final Universe someUniverse :  TheMultiverse.universeSubstrate){

           System.out.println("exec univ: " + someUniverse);

           someUniverse.run();

        }

}}
