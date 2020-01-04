package ru.voskhod.springdemoone;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Na zabiv";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
