import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */



import java.util.Random;

public class NonPlayerClass extends GameCharacter {
    private boolean active;
    private String intelligenceType;

    public NonPlayerClass() {
        super();
        setActive(false);
        setIntelligenceType("AVERAGE");
    }

    public NonPlayerClass(int uniqueID, String personality, boolean active, String intelligenceType) {
        super(uniqueID, personality);
        setActive(active);
        setIntelligenceType(intelligenceType);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getIntelligenceType() {
        return intelligenceType;
    }

    public void setIntelligenceType(String intelligenceType) {
        this.intelligenceType = intelligenceType;
    }

    @Override
    public String reportStructure() {
        StringBuilder sb = new StringBuilder(super.reportStructure());
        sb.append("\n==================================\n");
        sb.append("Active: ").append(isActive()).append("\n");
        sb.append("Intelligence: ").append(getIntelligenceType()).append("\n");
        sb.append("==================================\n");
        return sb.toString();
    }

    @Override
    public String introduce() {
        return "Hello, my name is " + getUniqueID();
    }

    @Override
    public String exclaim() {
        String[] exclamations = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
        Random rand = new Random();
        int index = rand.nextInt(exclamations.length);
        return exclamations[index];
    }
}

	

}//end class
