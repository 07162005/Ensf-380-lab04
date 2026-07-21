package edu.ucalgary.oop;

public class CompetitionHorse implements Cloneable {
    private String animalSpecies;
    private String animalFamily;        
    private String animalPhylum;
    private String animalName;
    private Rider animalRider = new Rider();
    public String[] skills = new String[10];

    public CompetitionHorse() { }
            
    public CompetitionHorse(String animalSpecies, String animalFamily, String animalPhylum, String animalName) {
        this.animalSpecies = animalSpecies;
        this.animalFamily = animalFamily;
        this.animalPhylum = animalPhylum;
        this.animalName = animalName;
    }
    
    public CompetitionHorse(CompetitionHorse other) {
        this.animalSpecies = other.animalSpecies;
        this.animalFamily = other.animalFamily;
        this.animalPhylum = other.animalPhylum;
        this.animalName = other.animalName;
        
        if (other.skills != null) {
            this.skills = new String[other.skills.length];
            System.arraycopy(other.skills, 0, this.skills, 0, other.skills.length);
        }
        
        if (other.animalRider != null) {
            this.animalRider = new Rider(other.animalRider);
        }
    }
    
    @Override
    public CompetitionHorse clone() {
        try {
            return (CompetitionHorse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setCompetitionHorsePhylum(String animalPhylum) {
        this.animalPhylum = animalPhylum;
    }

    public void setCompetitionHorseFamily(String animalFamily) {
        this.animalFamily = animalFamily;
    }

    public void setCompetitionHorseSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public void setCompetitionHorseName(String animalName) {
        this.animalName = animalName;
    }
    
    public void setRider(String name, int regNumber, int age) {
        this.animalRider.setRiderName(name);
        this.animalRider.setRiderRegNumber(regNumber);
        this.animalRider.setAge(age);
    }

    public void setCompetitionHorseSkills(String[] skills) {
        this.skills = skills;
    }

    public String getCompetitionHorsePhylum() {
        return animalPhylum;
    }

    public String getCompetitionHorseFamily() {
        return animalFamily;
    }

    public String getCompetitionHorseSpecies() {
        return animalSpecies;
    }

    public String getCompetitionHorseName() {
        return animalName;
    }
    
    public Rider getRider() {
        return animalRider;
    }
}