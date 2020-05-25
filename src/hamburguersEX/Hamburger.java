package hamburguersEX;

import java.util.ArrayList;

public class Hamburger {
    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.

    private String rollType;
    private int hamburgers;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int onion;
    private String otherAddName;
    private int otherAdditions;
    private double price;

    private static final double HAM_PRICE = 2;
    private static final double LETTUCE_PRICE = 0.5;
    private static final double TOMATO_PRICE = 0.2;
    private static final double CARROT_PRICE = 0.4;
    private static final double ONION_PRICE = 0.1;
    private static final double DEFAULT_PRICE = 0.5;


    private ArrayList<String> additions = new ArrayList<>();
    private ArrayList<Integer> additionsAmount = new ArrayList<>();


    public Hamburger(String rollType, int hamburgers) {
        this.rollType = rollType;
        this.hamburgers = hamburgers;
    }

    private int getHamburgers() {
        return hamburgers;
    }

    private int getLettuce() {
        return lettuce;
    }

    private int getTomato() {
        return tomato;
    }

    private int getCarrot() {
        return carrot;
    }

    private int getOnion() {
        return onion;
    }

    private int getOtherAdditions() {
        return otherAdditions;
    }

    private String getOtherAddName() {
        return otherAddName;
    }

    private void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    private void setTomato(int tomato) {
        this.tomato = tomato;
    }

    private void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    private void setOnion(int onion) {
        this.onion = onion;
    }

    private void setOtherAdditions(int otherAdditions) {

        this.otherAdditions = otherAdditions;

        additionsAmount.add(this.otherAdditions);
    }

    private void setOtherAddName(String otherAddName) {

        this.otherAddName = otherAddName;

        additions.add(this.otherAddName);
    }

    public void addHamburgerAddition(String addition, int amount) {
        switch (addition) {
            case "lettuce":
                setLettuce(amount);
                break;
            case "tomato":
                setTomato(amount);
                break;
            case "carrot":
                setCarrot(amount);
                break;
            case "onion":
                setOnion(amount);
                break;
            default:
                setOtherAddName(addition);
                setOtherAdditions(amount);
                break;
        }
    }

    private String getHamDetails() {
        if (getHamburgers() != 0) {
            return getHamburgers() + " - Hamburgers at a prize: " + HAM_PRICE;

        }
        return "No hamburgers";
    }

    private String getLettuceDetails() {
        if (getLettuce() != 0) {
            return getLettuce() + " - Lettuce at a prize: " + LETTUCE_PRICE;
        }

        return "0 - lettuces";
    }

    private String getTomatoDetails() {
        if (getTomato() != 0) {
            return getTomato() + " - Tomato at a prize: " + TOMATO_PRICE;
        }
        return "0 - tomatoes";
    }

    private String getCarrotDetails() {
        if (getCarrot() != 0) {
            return getCarrot() + " - Carrot at a prize: " + CARROT_PRICE;
        }
        return "0 - carrots";
    }

    private String getOnionDetails() {
        if (getOnion() != 0) {
            return getOnion() + " - Onion at a prize: " + ONION_PRICE;
        }
        return "0 - onions";
    }

    private String getOtherAddDetails() {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        if (getOtherAdditions() != 0) {

            for (String stringBuild : additions) {
                sb.append(additionsAmount.get(index) + " - " + stringBuild + " at a prize: " + DEFAULT_PRICE + "\n");
                index++;
            }

            return sb.toString();
        }
        return "0 - additives";
    }

    private String getBillDetails() {
        return getHamDetails() + "\n" + getLettuceDetails() + "\n" + getTomatoDetails() + "\n" + getCarrotDetails() + "\n" + getOnionDetails() + "\n" + getOtherAddDetails();
    }

    public String getFinalPrice() {
        return getBillDetails() + "\n" + "Total prize for the hamburgers is: " + ((getHamburgers() * HAM_PRICE) + (getLettuce() * LETTUCE_PRICE) + (getTomato() * TOMATO_PRICE) + (getCarrot() * CARROT_PRICE) + (getOnion() * ONION_PRICE));
    }

}
