import java.util.Arrays;

public class ObjectCopying2 {
    public static void main(String[] args) {
        // Create first horse
        CompetitionHorse horse1 = new CompetitionHorse("Horse", "Equidae", "Chordata", "Blaze");
        String[] horse1Skills = new String[]{"Jumping", "Dressage"};
        horse1.setCompetitionHorseSkills(horse1Skills);
        horse1.setRider("Alex", 4321, 30);

        // Create second horse using equals operator (shallow copy)
        CompetitionHorse horse2 = horse1;

        // Modify the second horse
        horse2.setCompetitionHorseName("Thunder");
        horse2.setRider("Taylor", 1234, 25);
        String[] horse2Skills = new String[]{"Racing"};
        horse2.setCompetitionHorseSkills(horse2Skills);

        // Print both horses - USE GETTERS!
        System.out.println("Horse1:");
        System.out.println("Name: " + horse1.getCompetitionHorseName());
        System.out.println("Skills: " + Arrays.toString(horse1.getCompetitionHorseSkills()));
        System.out.println("Rider: " + horse1.getRider().getRiderName());
        
        System.out.println("\nHorse2:");
        System.out.println("Name: " + horse2.getCompetitionHorseName());
        System.out.println("Skills: " + Arrays.toString(horse2.getCompetitionHorseSkills()));
        System.out.println("Rider: " + horse2.getRider().getRiderName());
        
        // Check if they are the same object
        System.out.println("\nAre horse1 and horse2 the same object? " + (horse1 == horse2));
    }
}