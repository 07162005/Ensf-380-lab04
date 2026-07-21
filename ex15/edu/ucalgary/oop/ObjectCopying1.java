package edu.ucalgary.oop;

import java.util.Arrays;

public class ObjectCopying1 {
    public static void main(String[] args) {
        CompetitionHorse horse1 = new CompetitionHorse("Horse", "Equidae", "Chordata", "Blaze");
        String[] horse1Skills = new String[]{"Jumping", "Dressage"};
        horse1.setCompetitionHorseSkills(horse1Skills);
        horse1.setRider("Alex", 4321, 30);
        
        
        System.out.println("Name: " + horse1.getCompetitionHorseName());
        System.out.println("Skills: " + Arrays.toString(horse1.skills));
        System.out.println("Rider: " + horse1.getRider().getRiderName());
    }
}