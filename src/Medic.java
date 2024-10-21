public class Medic extends Hero {
    private int healPoints;
    public Medic(int health, int damage, String typeOfSuperPower, int healPoints ) {
        super(health, damage, typeOfSuperPower);

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic health" + getHealth() + ", Medic damage" + getDamage());
        System.out.println("Medic применил суперспособность" + getTypeOfSuperPower());
    }
    public void increaseExperience () {
        healPoints *= 1.1;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
