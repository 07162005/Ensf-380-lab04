import java.util.Arrays;

public class ObjectCopying1 {
    public static void main(String[] args) {
        // Create first horse
        CompetitionHorse horse1 = new CompetitionHorse("Horse", "Equidae", "Chordata", "Blaze");
        String[] horse1Skills = new String[]{"Jumping", "Dressage"};
        horse1.setCompetitionHorseSkills(horse1Skills);
        horse1.setRider("Alex", 4321, 30);  // No parameter labels!

        System.out.println("Name: " + horse1.getCompetitionHorseName());  // Correct method name
        System.out.println("Skills: " + Arrays.toString(horse1.getCompetitionHorseSkills()));  // Correct method name
        System.out.println("Rider: " + horse1.getRider().getRiderName());  // Correct method name
    }
}