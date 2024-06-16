public class Main {
    public static void main(String[] args) {
        BOSS Boss = new BOSS();
        Boss.setHealth(700);
        Boss.setDamage(40);
        Boss.setProtection("Armor");

        System.out.println("Boss Information:");
        System.out.println("Health:" + Boss.getHealth());
        System.out.println("Damage:" + Boss.getDamage());
        System.out.println("Protection Type:" + Boss.getProtection());

        HERO[] heroes = createHeroes();
        for (HERO hero : heroes) {
            System.out.println("Health:" + hero.getHealth());
            System.out.println("Damage:" + hero.getDamage());
            System.out.println("Superpower:" + hero.getSuperpower());
            System.out.println("------------");
        }
    }

    public static HERO[] createHeroes() {
        HERO spiderman = new HERO(500, 30, "fly");
        HERO halk = new HERO(600, 20);
        HERO ironmam = new HERO(600, 25, "intellect");

        return new HERO[]{spiderman, halk, ironmam};
    }
}

