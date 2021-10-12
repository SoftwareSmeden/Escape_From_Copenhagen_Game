package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Enemy firstEnemy = new Enemy("Grog",50, 20, 5, 11);
        Enemy secondEnemy = new Enemy("Quax",80,0,13, 15);
        Enemy thirdEnemy = new Enemy("Grim",100,0,12, 21);
        Enemy fourthEnemy = new Enemy("Zorg",120,0,16,29);
        Enemy finalEnemy = new Enemy("Andraculas",180,20,21,34);

        Utilities utilities = new Utilities();

        System.out.println(
                            "██████╗ ███████╗ ██████╗███████╗███╗   ███╗██████╗ ███████╗██████╗      ██╗██████╗ ████████╗██╗  ██╗    ██████╗  ██████╗ ██████╗  ██╗\n" +
                            "██╔══██╗██╔════╝██╔════╝██╔════╝████╗ ████║██╔══██╗██╔════╝██╔══██╗    ███║╚════██╗╚══██╔══╝██║  ██║    ╚════██╗██╔═████╗╚════██╗███║\n" +
                            "██║  ██║█████╗  ██║     █████╗  ██╔████╔██║██████╔╝█████╗  ██████╔╝    ╚██║ █████╔╝   ██║   ███████║     █████╔╝██║██╔██║ █████╔╝╚██║\n" +
                            "██║  ██║██╔══╝  ██║     ██╔══╝  ██║╚██╔╝██║██╔══██╗██╔══╝  ██╔══██╗     ██║██╔═══╝    ██║   ██╔══██║    ██╔═══╝ ████╔╝██║██╔═══╝  ██║\n" +
                            "██████╔╝███████╗╚██████╗███████╗██║ ╚═╝ ██║██████╔╝███████╗██║  ██║     ██║███████╗   ██║   ██║  ██║    ███████╗╚██████╔╝███████╗ ██║\n" +
                            "╚═════╝ ╚══════╝ ╚═════╝╚══════╝╚═╝     ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═╝     ╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝    ╚══════╝ ╚═════╝ ╚══════╝ ╚═╝");

        System.out.println("\n" +
                            "██████ ███████╗██████╗█████╗██████╗███████╗   ██████╗██████╗██████╗██████████╗   ████╗  ██╗█████╗ ██████╗██████████╗   ██╗\n" +
                            "██╔════██╔════██╔════██╔══████╔═█████╔════╝  ██╔════██╔═══████╔══████╔════████╗  ████║  ████╔══████╔════╝██╔════████╗  ██║\n" +
                            "█████╗ ██████ ██║    █████████████╔█████╗    ██║    ██║   ████████╔█████╗ ██╔██╗ ██████████████████║  ████████╗ ██╔██╗ ██║\n" +
                            "██╔══╝ ╚════█ ██║    ██╔══████╔═══╝██╔══╝    ██║    ██║   ████╔═══╝██╔══╝ ██║╚██╗████╔══████╔══████║   ████╔══╝ ██║╚██╗██║\n" +
                            "██████ ███████╚████████║  ████║    ███████╗  ╚██████╚██████╔██║    █████████║ ╚██████║  ████║  ██╚██████╔█████████║ ╚████║");
        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.println("Not a living soul could have foreseen the events that transpired after the latest mutation.\n" +
                "A zoonotic event between one of the most common pets, and all their unfortunate owners, would be known in all history as the \"Danish Death March\".");
        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.println("Rabies encephalitis, a quite ordinary virus among cats, was mixed with the notorious Covid-19 in a Danish household in the north-western parts of Copenhagen.\n" +
                "Under a lot of circumstances, such a thing would only cause the feline to die off, due to the airways being attacked simultaneously with the nervous system.\n" +
                "Not that time though.");
        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.println("The cat became aggressive and bit and scratched its owners.\n" +
                "The owners, already carrying Covid-19, without any severe symptoms, quickly had their immune system ravaged, and as an effect of this, they hadn’t the energy to leave their apartment, in order to seek help.\n" +
                "Not before the mutation had set in.");
        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n" + "What's your name? (Type your player name and press 'Enter')\n");
        String playerName = input.nextLine();

        Player player = new Player(playerName, 100, 5,10);
        Battle fight = new Battle(firstEnemy, player, utilities);

        System.out.println(
                        "      ////^\\\\\\\\\n" +
                        "      | ^   ^ |\n" +
                        "     @ (o) (o) @\n" +
                        "      |   <   |    \n" +
                        "      |  ___  |\n" +
                        "       \\_____/\n" +
                        "     ____|  |____\n" +
                        "    /    \\__/    \\\n" +
                        "   /              \\\n" +
                        "  /\\_/|        |\\_ \\\n" +
                        " / /  |        |  \\ \\\n");
        System.out.println("Hello " + playerName + "!");
        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.println(
                ".             .        .     .     |--|--|--|--|--|--|  |===|==|   /    i\n" +
                "        .            ______________|__|__|__|__|__|_ |  |===|==|  *  . /=\\\n" +
                "__ *            .   /______________________________|-|  |===|==|       |=|  .\n" +
                "__|  .      .   .  //______________________________| :----------------------.\n" +
                "__|   /|\\      _|_|//       ooooooooooooooooooooo  |-|                      |\n" +
                "__|  |/|\\|__   ||l|/,-------8                   8 -| |                      |\n" +
                "__|._|/|\\|||.l |[=|/,-------8                   8 -|-|                      |\n" +
                "__|[+|-|-||||li|[=|---------8                   8 -| |                      |\n" +
                "_-----.|/| //:\\_[=|\\`-------8                   8 -|-|                      |\n" +
                " /|  /||//8/ :  8_|\\`------ 8ooooooooooooooooooo8 -| |                      |\n" +
                "/=| //||/ |  .  | |\\\\_____________  ____  _________|-|                      |\n" +
                "==|//||  /   .   \\ \\\\_____________ |X|  | _________| `---==------------==---'\n" +
                "==| ||  /         \\ \\_____________ |X| \\| _________|     ||            ||\n" +
                "==| |~ /     .     \\\n" +
                "LS|/  /             \\______________________________________________________");

        System.out.println("\n" +
                "███╗   ███╗ █████╗ ██╗   ██╗     ██╗ ██████╗████████╗██╗  ██╗    ██████╗  ██████╗ ██████╗ ██████╗ \n" +
                "████╗ ████║██╔══██╗╚██╗ ██╔╝    ███║██╔════╝╚══██╔══╝██║  ██║    ╚════██╗██╔═████╗╚════██╗╚════██╗\n" +
                "██╔████╔██║███████║ ╚████╔╝     ╚██║███████╗   ██║   ███████║     █████╔╝██║██╔██║ █████╔╝ █████╔╝\n" +
                "██║╚██╔╝██║██╔══██║  ╚██╔╝       ██║██╔═══██╗  ██║   ██╔══██║    ██╔═══╝ ████╔╝██║██╔═══╝ ██╔═══╝ \n" +
                "██║ ╚═╝ ██║██║  ██║   ██║        ██║╚██████╔╝  ██║   ██║  ██║    ███████╗╚██████╔╝███████╗███████");

        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.println("I have to get out of the city.\n" +
                "\n" +
                "I’m almost out of food, and my water-supply will drain out during the summer. I can’t count on summer rains to keep me sustained, so I’ll have to travel further south, where the cities aren’t as dense. Rumours were heard - before all signals got cut - that the south of Zealand were doing a lot better than the north.\n" +
                "\n" +
                "A garrison had managed to open it’s armories before things turned to shit.\n" +
                "Maybe they could use a guy like me?");
        System.out.println("Press any button to continue.\n");
        input.nextLine();

        System.out.println("You stand up and go pick up your backpack”.\n" +
                "“Then you go to your locker and pick up your weapons”.\n" +
                "“You now have a Heckler Koch MP7A2 PDW”.\n" +
                "“Firing at an insane 950 rounds per minute, and with effective kill-range around 200 meters out, the 9mm cartridge will do the neat trick of stopping any of the infected lifeforms outside of your safehouse”.\n" +
                "“Weighing just over 2 kilos, loaded, your weapon is fast, but only carries 20 rounds in your standard magazine. But with the stock folded out, it’s fairly accurate within its killzone. Use ammo wisely, and this weapon will keep you alive”.\n" +
                "“If only you had a good sight on it”.\n" +
                "“You should be on the lookout for a proper sight, like the tritium-illuminated night sight”.\n" +
                "\n" +
                "You also pick up a hefty little handaxe, great for hacking stuff to pieces.\n" +
                "You go look out the window.\n" +
                "\n" +
                "“You are looking down the street on Rosenvængets Hovedvej.");
        System.out.println("Press any button to continue.\n");
        input.nextLine();

        System.out.println("The whole area is packed with infected people and animals, so you will have to be careful, when going outside.\n" +
                "");

        //TODO Jacob er igang her.

        System.out.println(
                        "            ,                                         \n" +
                        "        _,-\"\"-._                                    \n" +
                        "      ,\"        \".                                  \n" +
                        "     /    ,-,  ,\"\\     ENOUGH WITH THE HUMANS..     \n" +
                        "    \"    /   \\ | o|    GRRR..                       \n" +
                        "    \\    `-o-\"  `-',                                \n" +
                        "     `,   _.--'`'--`                                  \n" +
                        "       `--`---'                                       \n" +
                        "         ,' '                                         \n" +
                        "       ./ ,  `,                                       \n" +
                        "       / /     \\                                     \n" +
                        "      (_)))_ _,\"                                     \n" +
                        "         _))))_,                                      \n" +
                        "--------(_,-._)))");
        System.out.println("Oh no! The infested are right in front of you! Time for a fight! \nPress any button to continue.");
        input.nextLine();

        System.out.println("This is how you play: \nPress one of the corresponding numbers and hit 'Enter' to play. \n" + "1: Attack " + "\n" + "2: use Colt M10" + "\n" + "3: use MP7A2" + "\n" + "4: use Handgrenade" + "\n" + "5: use First Aid" + "\n" + "6: use Adrenaline Syringe \nPress any button to continue.");
        input.nextLine();

        fight.turnController(firstEnemy, player);
        input.nextLine();

        System.out.println("Next fight");
        fight.turnController(secondEnemy, player);

    }
}