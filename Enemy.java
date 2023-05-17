package Character;

public class Enemy extends Character {
    public void move() {
        System.out.println("Enemy is moving");
    }
    public void move(int step) {
        System.out.println("Enemy is moving " + step + " steps. ");
    }    
    public void attack() {
        System.out.println("Enemy is attacking");
    }
    public void block() {
        System.out.println("Enemy is blocking");
    }
}
