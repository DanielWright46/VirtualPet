public class VirtualPet {
    private String name;
    private String firstName;
    private int hunger;
    private int feed;
    private int thirst;
    private int water;
    private int boredom;
    private int play;
    private int tired;
    private int rest;
    private int hungerAmount = 0;
    private int thirstAmount = 0;
    private int boredAmount = 0;
    private int triedAmount = 0;

    public VirtualPet(String name, int hunger, int feed, int thirst, int water, int boredom, int play, int tired, int rest) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.water = water;
        this.feed = feed;
        this.boredom = boredom;
        this.play = play;
        this.tired = tired;
        this.rest = rest;
    }

    public String getName() {
        return "Spike the Dog";
    }

    public String getFirstName() {
        return "Spike";
    }

    public int getHunger() {
        if (hunger > hungerAmount) {
            hunger -= hungerAmount;
        } else {
            hunger -= hunger;
        }
        return hunger;
    }

    public int getThirst() {
        if (thirst > thirstAmount) {
            thirst -= thirstAmount;
        } else {
            thirst -= thirst;
        }
        return thirst;
    }

    public int getBoredom() {
        if (boredom > boredAmount) {
            boredom -= boredAmount;
        } else {
            boredom -= boredom;
        }
        return boredom;
    }

    public int getTired() {
        if (tired > triedAmount) {
            tired -= triedAmount;
        } else {
            tired -= tired;
        }
        return tired;
    }

    public int getFeed() {
        return feed;
    }

    public int getWatered() {
        return water;
    }

    public int getPlay() {
        return play;
    }

    public int getRest() {
        return rest;
    }

    public void feedPet() {
        this.hunger -= 2;
        this.boredom -= 5;
        this.tired += 1;
    }

    public void playWithPet() {
        this.hunger += 2;
        this.boredom -= 5;
        this.tired += 6;
        this.thirst += 3;

    }

    public void restPet() {
        this.hunger += 1;
        this.tired -= 7;
        this.boredom += 5;
    }

    public void waterPet() {
        this.thirst -= 3;
    }

    public void boredom() {
        this.boredom += 4;
        this.tired -= 3;
    }

    public void petMenu() {
        System.out.println("Name: " + getName());
        System.out.println("Hunger: " + getHunger());
        System.out.println("Thirst: " + getThirst());
        System.out.println("Boredom: " + getBoredom());
        System.out.println("Tiredness: " + getTired());
    }

    public void petMenuOptions() {
        System.out.println("Select an option from the Menu:");
        System.out.println("1. Feed " + getFirstName());
        System.out.println("2. Give water to " + getFirstName());
        System.out.println("3. Play with " + getFirstName());
        System.out.println("4. Allow " + getFirstName() + " to lay down and rest");
        System.out.println("5. Do nothing with " + getFirstName());
        System.out.println("6. To Exit");
    }

    public void continueOrExit() {
        System.out.println();
        System.out.println("Enter 1-5 to continue");
        System.out.println("Enter 6 to exit");
    }
}
