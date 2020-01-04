package ru.voskhod.springdemoone;

import java.util.*;

public class ClassyFortuneService implements FortuneService {

    private List<String> fortunes;

    public ClassyFortuneService() {
        fortunes = new ArrayList<>();
        fortunes.add("Be flexy");
        fortunes.add("Visit Gucci shop at Saint-Petersburg");
        fortunes.add("Run around the house");
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        int randomNumber = random.nextInt(fortunes.size());

        return fortunes.get(randomNumber);
    }
}
