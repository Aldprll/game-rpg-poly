package Character;

public class App {
    public static void main(String[] args) {
        //Implementasi soal A
        Hero hero = new Hero();
        hero.move(); 
        hero.move("right"); 
        hero.attack();
        hero.useSpecialSkills();
        System.out.println("---------------------------");

        Enemy enemy = new Enemy();
        enemy.move(); 
        enemy.move(5); 
        enemy.attack();
        enemy.block();
        System.out.println("---------------------------");
    
        //Implementasi soal B
        Character character;
    
        character = new Hero();
        character.move(); 
        character.attack();
        System.out.println("---------------------------");
    
        character = new Enemy();
        character.move(); 
        character.attack();
        System.out.println("---------------------------");
    
        character = new Witch();
        character.move();
        character.attack(); 
        System.out.println("---------------------------");
    
        //Implementasi soal C
        Character witch = new Witch();
        Fighter fighter = (Fighter) witch;
        fighter.move(); 
        fighter.attack();
        fighter.useSpecialSkills();
        fighter.showCombo();
    }
}
