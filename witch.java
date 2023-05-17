package Character;

public class Witch  extends Enemy{
    public void move() {
        System.out.println("Witch is moving");
    }
    public void attack() {
        System.out.println("Witch is attacking");
    }
    public void castSpell() {
        System.out.println("Witch is casting a spell");
    }
    public void teleport() {
        System.out.println("Witch is teleporting");
    }
}
