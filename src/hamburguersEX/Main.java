package hamburguersEX;

public class Main {

    public static void main(String[] args) {
        Hamburger ham = new Hamburger("normal", 2);

        HealthyBurger healthyBurger = new HealthyBurger("diet", 2);

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("premium", 3);

        ham.addHamburgerAddition("lettuce", 2);

        ham.addHamburgerAddition("onion", 3);
        ham.addHamburgerAddition("carrot", 3);
        ham.addHamburgerAddition("pikles", 1);

        healthyBurger.addHamburgerAddition("Zuchini", 1);

        deluxeHamburger.addHamburgerAddition("bacon", 3);
        deluxeHamburger.addHamburgerAddition("onion rings", 3);
        deluxeHamburger.addHamburgerAddition("chedar", 1);
        deluxeHamburger.addHamburgerAddition("barbacoa sauce", 5);


        System.out.println("HEALTHY HAMBURGER");

        System.out.println(healthyBurger.getFinalPrice());

        System.out.println("########################################");

        System.out.println("BASIC HAMBURGER");

        System.out.println(ham.getFinalPrice());

        System.out.println("########################################");

        System.out.println("DELUXE HAMBURGER");

        System.out.println(deluxeHamburger.getFinalPrice());
    }

}
