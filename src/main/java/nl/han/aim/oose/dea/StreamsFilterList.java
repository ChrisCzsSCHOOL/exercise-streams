package nl.han.aim.oose.dea;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        // TODO: implement

        return input
                .stream()
                .filter(s -> s.length() < 3)
                .toList();

    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        // TODO: implement

        return input
                .stream()
                .filter(s -> s.matches("[0-9]+"))
                .toList();
    }
}