public class CompetitionHorse implements Cloneable {
    private String competitionHorseName;
    private String family;
    private String phylum;
    private String breed;
    private String[] skills;
    private Rider rider;
    
    // Regular constructor
    public CompetitionHorse(String name, String family, String phylum, String breed) {
        this.competitionHorseName = name;
        this.family = family;
        this.phylum = phylum;
        this.breed = breed;
    }
    
    // Copy constructor - for Exercise 15.4 (DEEP COPY)
    public CompetitionHorse(CompetitionHorse other) {
        this.competitionHorseName = other.competitionHorseName;
        this.family = other.family;
        this.phylum = other.phylum;
        this.breed = other.breed;
        
        // Deep copy of skills array
        if (other.skills != null) {
            this.skills = new String[other.skills.length];
            System.arraycopy(other.skills, 0, this.skills, 0, other.skills.length);
        }
        
        // Deep copy of Rider
        if (other.rider != null) {
            this.rider = new Rider(other.rider);
        }
    }
    
    // Clone method - for Exercise 15.3 (SHALLOW COPY)
    @Override
    public CompetitionHorse clone() {
        try {
            return (CompetitionHorse) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since we implement Cloneable
            throw new AssertionError();
        }
    }
    
    // Getters and setters
    public String getCompetitionHorseName() {
        return competitionHorseName;
    }
    
    public void setCompetitionHorseName(String name) {
        this.competitionHorseName = name;
    }
    
    public String[] getCompetitionHorseSkills() {
        return skills;
    }
    
    public void setCompetitionHorseSkills(String[] skills) {
        this.skills = skills;
    }
    
    public Rider getRider() {
        return rider;
    }
    
    public void setRider(Rider rider) {
        this.rider = rider;
    }
    
    public void setRider(String name, int id, int age) {
        this.rider = new Rider(name, id, age);
    }
}