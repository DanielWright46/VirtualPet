import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet myPet = new VirtualPet("Jo-Jo", 10, 10, 10, 10, 10, 10, 10, 10);

        myPet.petMenu();
        System.out.println();
        myPet.petMenuOptions();

        String menuOption = "";
        menuOption = input.nextLine();

        while (!menuOption.equals("6")) {

            if (menuOption.equals("1")) {
                myPet.feedPet();
                myPet.petMenuOptions();
                System.out.println();
                myPet.petMenu();
                myPet.continueOrExit();
                menuOption = input.nextLine();

            } else if (menuOption.equals("2")) {
                myPet.waterPet();
                myPet.petMenuOptions();
                System.out.println();
                myPet.petMenu();
                myPet.continueOrExit();
                menuOption = input.nextLine();

            } else if (menuOption.equals("3")) {

                myPet.playWithPet();
                myPet.petMenuOptions();
                System.out.println();
                myPet.petMenu();
                myPet.continueOrExit();
                menuOption = input.nextLine();

            } else if (menuOption.equals("4")) {
                myPet.restPet();
                myPet.petMenuOptions();
                System.out.println();
                myPet.petMenu();
                myPet.continueOrExit();
                menuOption = input.nextLine();

            } else if (menuOption.equals("5")) {
                myPet.boredom();
                myPet.petMenuOptions();
                System.out.println();
                myPet.petMenu();
                myPet.continueOrExit();
                menuOption = input.nextLine();


            } else {
                System.out.println();
                System.out.println("Error! Choose Menu Option");
                System.out.println();
                myPet.petMenuOptions();
                menuOption = input.nextLine();
            }
        }
        input.close();
    }

}









