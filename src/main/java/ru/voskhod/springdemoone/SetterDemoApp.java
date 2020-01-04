package ru.voskhod.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from the container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on bean
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        // call new methods

        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        // close application context
        context.close();
    }
}
