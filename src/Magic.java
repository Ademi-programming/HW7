public class Magic extends Hero {

    public Magic(int health, int damage, String typeOfSuperPower) {
        super(health, damage, typeOfSuperPower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность" + getTypeOfSuperPower());
        System.out.println("Magic health" + getHealth() + ", Magic damage" + getDamage());

    }
}