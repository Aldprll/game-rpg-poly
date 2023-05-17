package Character;

public class Hero extends Character {
    public void move() {
        System.out.println("Hero is moving");
    }
    public void move(String direction) {
        System.out.println("Hero is moving to the " + direction + ".");
    }
    public void attack() {
        System.out.println("Hero is attacking");
    }
    public void useSpecialSkills() {
        System.out.println("Hero is using special skills");
    }
}
