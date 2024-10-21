public class Warrior extends Hero {
    public Warrior(int health, int damage, String typeOfSuperPower) {
        super(health, damage, typeOfSuperPower);
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Warrior health" + getHealth() + ", Warrior damage" + getDamage());
        System.out.println("Warrior применил суперспособность" + getTypeOfSuperPower());
    }
}
