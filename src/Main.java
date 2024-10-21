public class Main {
    public static void main(String[] args) {
        Hero [] heroes = {
            new Magic (100, 40, "Телепатия"),
            new Medic (70, 20, "Лечение"),
            new Warrior (200, 100, "Воевать")
        };
        for (Hero hero: heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}