package edu.ucalgary.oop;

import java.util.Arrays;

public class ObjectCopying4 {
    public static void main(String[] args) {
        CompetitionHorse horse1 = new CompetitionHorse("Horse", "Equidae", "Chordata", "Blaze");
        String[] horse1Skills = new String[]{"Jumping", "Dressage"};
        horse1.setCompetitionHorseSkills(horse1Skills);
        horse1.setRider("Alex", 4321, 30);
        
    
        System.out.println("Original Horse1:");
        System.out.println("  Name: " + horse1.getCompetitionHorseName());
        System.out.println("  Skills: " + Arrays.toString(horse1.skills));
        System.out.println("  Rider: " + horse1.getRider().getRiderName());
        
        CompetitionHorse horse2 = new CompetitionHorse(horse1);
        horse2.setCompetitionHorseName("Thunder");
        horse2.setRider("Taylor", 1234, 25);
        horse2.setCompetitionHorseSkills(new String[]{"Racing"});
        
        System.out.println();
        System.out.println("Horse1:");
        System.out.println("  Name: " + horse1.getCompetitionHorseName());
        System.out.println("  Skills: " + Arrays.toString(horse1.skills));
        System.out.println("  Rider: " + horse1.getRider().getRiderName());
        
        System.out.println("Horse2:");
        System.out.println("  Name: " + horse2.getCompetitionHorseName());
        System.out.println("  Skills: " + Arrays.toString(horse2.skills));
        System.out.println("  Rider: " + horse2.getRider().getRiderName());
        
        System.out.println("Are horse1 and horse2 the same object? " + (horse1 == horse2));
        System.out.println("Do they share the same skills array? " + (horse1.skills == horse2.skills));
        System.out.println("Do they share the same Rider? " + (horse1.getRider() == horse2.getRider()));
    }
}