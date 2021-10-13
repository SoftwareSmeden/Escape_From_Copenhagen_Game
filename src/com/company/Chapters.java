package com.company;

import java.util.Scanner;

public class Chapters {

    Scanner input = new Scanner(System.in);
    Player player = new Player("", 100, 5, 15);

    public String playerCreation() {
        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n" + "What's your name? (Type your player name and press 'Enter')\n");
        String playerName = input.nextLine();
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
        return playerName;
    }

    public void chapter_1(){
        Enemy firstEnemy = new Enemy("Infected",50, 0, 5, 11);
        Enemy secondEnemy = new Enemy("Infected",80,15,13, 15);

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
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Rabies encephalitis, a quite ordinary virus among cats, was mixed with the notorious Covid-19 in a Danish household in the north-western parts of Copenhagen.\n" +
                "Under a lot of circumstances, such a thing would only cause the feline to die off, due to the airways being attacked simultaneously with the nervous system.\n" +
                "Not that time though.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("The cat became aggressive and bit and scratched its owners.\n" +
                "The owners, already carrying Covid-19, without any severe symptoms, quickly had their immune system ravaged, and as an effect of this, they hadn’t the energy to leave their apartment, in order to seek help.\n" +
                "Not before the mutation had set in.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();
        String name = playerCreation();
        player.setPlayerName(name);
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        Battle fight = new Battle(firstEnemy, player, utilities);

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
                "I’m almost out of food, and my water-supply will drain out during the summer. I can’t count on summer rains to keep me sustained, so I’ll have to travel further south, " +
                "\n where the cities aren’t as dense. Rumours were heard - before all signals got cut - that the south of Zealand were doing a lot better than the north.\n" +
                "\n" +
                "A garrison had managed to open it’s armories before things turned to shit.\n" +
                "Maybe they could use a guy like me?");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You stand up and go pick up your backpack”.\n" +
                "“Then you go to your locker and pick up your weapons”.\n" +
                "“You now have a Heckler Koch MP7A2 PDW”.\n" +
                "“Firing at an insane 950 rounds per minute, and with effective kill-range around 200 meters out, the 9mm cartridge will do the neat trick of stopping any of the infected lifeforms outside of your safehouse”.\n" +
                "“Weighing just over 2 kilos, loaded, your weapon is fast, but only carries 20 rounds in your standard magazine. But with the stock folded out, it’s fairly accurate within its killzone. " +
                "\nUse ammo wisely, and this weapon will keep you alive”.\n" +
                "“If only you had a good sight on it”.\n" +
                "“You should be on the lookout for a proper sight, like the tritium-illuminated night sight”.\n" +
                "\n" +
                "You also pick up a hefty little handaxe, great for hacking stuff to pieces.\n" +
                "You go look out the window.\n" +
                "\n" +
                "“You are looking down the street on Rosenvængets Hovedvej.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("The whole area is packed with infected people and animals, so you will have to be careful, when going outside.\n" +
                "There's relatively little that indicates the mortal danger, one would venture into, going out in the streets.\n" +
                "Just at bite or a scratch is enough to get infected. Hell... just breathing in the same air as one or the infected might be enough.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Still... you have to get out of the city, if you want to survive.\n" +
                "Plenty of daylight left, but not enough to waste." +
                " Get out there");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Outside everything is quiet, and as you get acquainted with the sounds and smells of your surroundings, you stalk down towards Strandboulevarden");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("" +
                "                                                          ______________\n" +
                "                                                         |##############\n" +
                "              __             __                          |##############\n" +
                "_____________|  |_____     _(   )                        |##############\n" +
                "UUUUUUUUUUUUU|__|UUUUU| ,-'      )_                      |##############\n" +
                "UUU_UUUUUU_UUUUUU_UUUU|(   (  /    )                     |   __   __   _\n" +
                "UU|_|UUUU|_|UUUU|_|UUU|.  \\   )  _) )                    |  |  | |  | | \n" +
                "UUUUUUUUUUUUUUUUUUUUUU| `.  .    )  )                    |  |__| |__| |_\n" +
                "======================|(_   |  )  _)                     |\n" +
                "     __     __    __  |(__(_|____)_______________________|   __   __   _\n" +
                "|   |__|   |__|  |__| |uuuuuuuuuuuuuuuuuuuuuuuuuuuu,'.uuu|  |  | |  | | \n" +
                "|   |__|   |__|  |__| |uuuuuuuuuuuuuuuuuuuuuuuuuu,'   `.u|  |__| |__| |_\n" +
                "======================|uuuu_uuuuuu_uuuuuu_uuuuu,'__   __`.\n" +
                "     __     __    __  |uuu| |uuuu| |uuuu| |uuuu||  | |  ||   __   __   _\n" +
                "|   |__|   |__|  |__| |uuu|_|uuuu|_|uuuu|_|uuuu||__| |__||  |  | |  | | \n" +
                "|   |__|   |__|  |__| |=_====__================'         |  |__| |__| |_\n" +
                "======================||  | |  |  __   __   __   __   __ |______________\n" +
                "  ___  __    ________ ||__| |__| |  | |  | |  | |  | |  ||+++++++++++++_\n" +
                "||_|_||  |  |  |     || _______  |__| |__| |__| |__| |__||++.-------.+| \n" +
                "||_|_||- |  | -|     |||   |   |                         |++|   |   |+|_\n" +
                " |_|_||  |  |  |_____|||   |o  |  _     ____________  _  |++|   |-  |+++\n" +
                "---. _|--|__|--|_____|||===|   |_|_|_  /_|__|_______| _|_|++|___|___|+++\n" +
                "----`. ___             ;---'---'      |  |_-|       |__     |       \\   \n" +
                "--(_)-'_ _\\___________/________|____/_'-(_)-----(_)-' _\\____|________\\__\n" +
                "________________________________________________________________________");
        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.println("You find yourself a little spooked by the whole situation, and cannot help to feel a little \"watched over\".\n" +
                "You start to jog a little, staying quiet - you think - and being ever aware of any movements or sounds.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Suddenly you hear a low growl just to your immediate right.\n" +
                "There just a couple of meters from you, a heavily infected person stands, looking away from you, as it stumbles over a tilted traffic cone.\n" +
                "You hold your breath, try to stay silent, as you stalk away.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Unfortunately, you fail to notice the remains of a cracked windshield in your path.\n" +
                "The faint crackle of crushed glass underneath your feet, instantaneously alerts the infected to your presence.\n" +
                "It shrieks an earpiercing tone, probably alerting other infected to the unfolding events here on the corner of Præstøgade, before charging towards you.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println(
                "The infected\n" +
                ".........\n" +
                ";(6) (o);\n" +
                " \\\" o //   SHREIKS..  \n"+
                " ( HHH )\n" +
                " _)   (_ \n" +
                "");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("This is how you play: \nPress one of the corresponding numbers and hit 'Enter' to play. \n" + "1: Attack " + "\n" + "2: use Colt M10" + "\n" + "3: use MP7A2" + "\n" + "4: use Handgrenade" + "\n" + "5: use First Aid" + "\n" + "6: use Adrenaline Syringe");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        //First fight
        fight.turnController(firstEnemy, player);

        System.out.println("Next fight:\n" + "You notice a good old HE handgrenade, hanging from the belt of the infected, you just killed. You pick it up."); //TODO overgang er lidt mærkelig her. Måske mere tekst inden næste kamp?

        //Second fight
        fight.turnController(secondEnemy, player);
        System.out.println("As you look upon the now eviscerated infected person, you see that unexpectedly this specimen also carries a HE handgrenade, only in its pocket.\n" + //TODO Stemmer ikke overens med player reward. Player får 1x granat og 2 skud til MP
                "You pick it up, saving it for later use.\n");

        System.out.println(
                        "███████╗██╗██████╗ ███████╗████████╗     ██████╗██╗  ██╗ █████╗ ██████╗ ████████╗███████╗██████╗ \n" +
                        "██╔════╝██║██╔══██╗██╔════╝╚══██╔══╝    ██╔════╝██║  ██║██╔══██╗██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
                        "█████╗  ██║██████╔╝███████╗   ██║       ██║     ███████║███████║██████╔╝   ██║   █████╗  ██████╔╝\n" +
                        "██╔══╝  ██║██╔══██╗╚════██║   ██║       ██║     ██╔══██║██╔══██║██╔═══╝    ██║   ██╔══╝  ██╔══██╗\n" +
                        "██║     ██║██║  ██║███████║   ██║       ╚██████╗██║  ██║██║  ██║██║        ██║   ███████╗██║  ██║\n" +
                        "╚═╝     ╚═╝╚═╝  ╚═╝╚══════╝   ╚═╝        ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝        ╚═╝   ╚══════╝╚═╝  ╚═╝");
        System.out.println(
                " ██████╗ ██████╗ ███╗   ███╗██████╗ ██╗     ███████╗████████╗███████╗\n" +
                "██╔════╝██╔═══██╗████╗ ████║██╔══██╗██║     ██╔════╝╚══██╔══╝██╔════╝\n" +
                "██║     ██║   ██║██╔████╔██║██████╔╝██║     █████╗     ██║   █████╗  \n" +
                "██║     ██║   ██║██║╚██╔╝██║██╔═══╝ ██║     ██╔══╝     ██║   ██╔══╝  \n" +
                "╚██████╗╚██████╔╝██║ ╚═╝ ██║██║     ███████╗███████╗   ██║   ███████╗\n" +
                " ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚══════╝╚══════╝   ╚═╝   ╚══════╝  " );
        System.out.println("Press any button to continue.\n");
        input.nextLine();

    }
    public void chapter_2() {
        Utilities utilities = new Utilities();
        Enemy horde = new Enemy("The Horde", 99, 0, 1000, 1001);

        Battle fight = new Battle(horde, player, utilities);

        System.out.println("\n" +
                        "███████╗███████╗ ██████╗ ██████╗ ███╗   ██╗██████╗      ██████╗██╗  ██╗ █████╗ ██████╗ ████████╗███████╗██████╗ \n"+
                        "██╔════╝██╔════╝██╔════╝██╔═══██╗████╗  ██║██╔══██╗    ██╔════╝██║  ██║██╔══██╗██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n"+
                        "███████╗█████╗  ██║     ██║   ██║██╔██╗ ██║██║  ██║    ██║     ███████║███████║██████╔╝   ██║   █████╗  ██████╔╝\n"+
                        "╚════██║██╔══╝  ██║     ██║   ██║██║╚██╗██║██║  ██║    ██║     ██╔══██║██╔══██║██╔═══╝    ██║   ██╔══╝  ██╔══██╗\n"+
                        "███████║███████╗╚██████╗╚██████╔╝██║ ╚████║██████╔╝    ╚██████╗██║  ██║██║  ██║██║        ██║   ███████╗██║  ██║\n"+
                        "╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝╚═════╝      ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝        ╚═╝   ╚══════╝╚═╝  ╚═╝");
        System.out.println("Press any button to continue.");
        input.nextLine();

        System.out.println("Your weapons make a true cacophony as you make quick work of the two infected.\n"+
                "Your breath, heaving, your heart, racing, you strain your ears to listen for indications, that the noise has had any effect on your \"neighbours\". ");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("A heartcurling roar snaps you to attention, and you are acutely aware of just how exposed you are on a large street," +
                "\n with nowhere to go but forwards, as the resounding howls come from down towards Nordre Frihavnsgade.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You sprint down Strandboulevarden, heading towards Kastellet, where you know the location of an armory.\n" +
                "Luckily, some unlucky soul left a medium-sized Scott Aspect MTB lying in the middle of the street." +
                "\nYou run towards it, crouching down and feeling the back-tire for air-pressure. It isn't much, but it's there.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You race your newfound bike around the bend, onto Østbanegade, spotting the walking-bridge around 50 meters ahead.\n" +
                "You also spot something else.\n" +
                "Ahead of you, the whole street is filled with infected," +
                "\n massing about, heads snapping to attention, as they notice the squeaking of your bikes gears.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You race up the stairs, on to the bridge, and hauls ass across.\n" +
                "You won't make it, unless you do something drastic.\n");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You - pedalling for your life - grab a grenade, and pull the pin with your teeth, splitting your lip in the process.\n" +
                "You drop the grenade softly onto the concrete of the bridge - lettin it roll after you - counting the seconds before detonation."); //TODO der mangler noget tekst/historie før kampen
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        //Third fight
        fight.turnController(horde, player); //TODO Granat er allerede gået af her. Tekst nedenunder stemmer ikke overens.

        System.out.println("One...");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Two... you are just a couple of meters from safety and out the way of the blast.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Three... you roll down the grassy hill just on the other side of the bridge. And in the same exact instant.\n" +
                "The grenade goes off!");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("The bridge absolutely tears asunder, exploding in a giant ball of fire, concrete and bloodied limbs,\n" +
                "as the infected of The Horde, that were on the bridge at the time of detonation, are blasted to bits.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You know that the noise probably will attract a shit ton of infected, so you aim to get to the armory as quickly as possible.\n" +
                "A quick bikeride and you are there, just down at Kastellet 30, where FE has a secret armory.\n" +
                "You enter the pitch black building - the power having been out for months.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println(
                "      _,                _.\n" +
                "     (  `)            (`  ).\n" +
                "  .=( ` ,_ `)    .-``(      ).\n" +
                " (.__.:-`-_.'   (.,,(.       '`.\n" +
                "                      `--`--`'`\n" +
                "         ____.........__H_\n" +
                "      __/%%%%|%%%%%%%|%%%%\\\n" +
                " _ ()/%%|:II:|II:::II|:II:|_ _ _\n" +
                "|-(()|--|:II:|II:H:II|:II:|-|-|-|\n" +
                "`'.'\"^  ^` \"^ \"^|\"|^'\"' `^`-.^~'");
        System.out.println("Press any button to continue.\n");
        input.nextLine();

        System.out.println("You are now inside the armory, and you loot the room, finding a tritium-illuminated night sight.\n" +
                "You also find a body armor and a helmet.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You also find a Army-issued Colt M10 Assault Rifle with a full magazine. The rifle even has a rail-mounted laser attached.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("The events of the day has taken a toll on you, and you find yourself exhausted.\n" +
                "You can seal yourself inside the armory as protection against the infected, although it ain't exactly the most comfortable bedding," +
                "\n old MRE-boxes or ammo crates.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Succumbing to sleep, you close your eyes, and hope that you'll wake up easily in the morning," +
                "\n and not the a couple of infected tearing at your flesh, until the disease sets in, and you are doomed to their fate.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println(
                "███████╗███████╗ ██████╗ ██████╗ ███╗   ██╗██████╗      ██████╗██╗  ██╗ █████╗ ██████╗ ████████╗███████╗██████╗\n" +
                "██╔════╝██╔════╝██╔════╝██╔═══██╗████╗  ██║██╔══██╗    ██╔════╝██║  ██║██╔══██╗██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
                "███████╗█████╗  ██║     ██║   ██║██╔██╗ ██║██║  ██║    ██║     ███████║███████║██████╔╝   ██║   █████╗  ██████╔╝\n" +
                "╚════██║██╔══╝  ██║     ██║   ██║██║╚██╗██║██║  ██║    ██║     ██╔══██║██╔══██║██╔═══╝    ██║   ██╔══╝  ██╔══██╗\n" +
                "███████║███████╗╚██████╗╚██████╔╝██║ ╚████║██████╔╝    ╚██████╗██║  ██║██║  ██║██║        ██║   ███████╗██║  ██║\n" +
                "╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝╚═════╝      ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝        ╚═╝   ╚══════╝╚═╝  ╚═╝");
        System.out.println(
                        " ██████╗ ██████╗ ███╗   ███╗██████╗ ██╗     ███████╗████████╗███████╗\n" +
                        "██╔════╝██╔═══██╗████╗ ████║██╔══██╗██║     ██╔════╝╚══██╔══╝██╔════╝\n" +
                        "██║     ██║   ██║██╔████╔██║██████╔╝██║     █████╗     ██║   █████╗  \n" +
                        "██║     ██║   ██║██║╚██╔╝██║██╔═══╝ ██║     ██╔══╝     ██║   ██╔══╝  \n" +
                        "╚██████╗╚██████╔╝██║ ╚═╝ ██║██║     ███████╗███████╗   ██║   ███████╗\n" +
                        " ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚══════╝╚══════╝   ╚═╝   ╚══════╝  " );
        System.out.println("Press any button to continue.\n");
        input.nextLine();

    }

    public void chapter_3() {

        Utilities utilities = new Utilities();

        Enemy boss1 = new Enemy("Andracs", 250, 20, 20, 30);

        Battle fight = new Battle(boss1, player, utilities);

        System.out.println("You wake up, feeling refreshed and ready to continue your journey.\n" +
                "You arise inside the locked up armory, and quickly notice the peace and quiet outside");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("You exit the armory and find nothing to disturb the eerie silence around \"Kastellet\".\n" +
                "You now have a decision to make.\n" +
                "Either, you go up to Rådhuspladsen and try to loot a firetruck, ambulance or maybe the keys to a boat, so you can get out of the city.\n" +
                "Or... you can take the walk down to Politigården, where you might be able to find keys to one of the RIB's down at Kalvebod Brygge.\n" +
                "Whatever you decide, your safest bet to get out alive, is via boat.");
        System.out.println("\nPress any button to continue.");
        input.nextLine();

        System.out.println("Now decide!");
        System.out.println("Type \"Rådhuspladsen\" or \"Politigården\" \n");
        input.nextLine();

        boolean stop = false;

        while(!stop){
            input.nextLine();
            String choice = input.nextLine();
            if (choice.equals("Rådhuspladsen")) {
                System.out.println("You decided to jog towards Rådhuspladsen, moving cautiously but fast.\n" +
                        "Your weapons are loaded, and you head out, feeling hopeful that today is the day, you finally Escape From Copenhagen.");
                input.nextLine();

                System.out.println("The run through the city goes on rather uneventful, although not exactly quiet,\n" +
                        " as the terrible sounds of the infected fills the cityscape with nightmarish noise." +
                        "You head into the Hovedbrandstationen, finding it deserted, but luckily, unlooted.\n");
                input.nextLine();

                System.out.println("Inside, you find the keys to one of the fire-department's rescue-boats.");

                stop = true;
            }
            else if (choice.equals("Politigården")) {

                stop = true;
            }
            else {
                System.out.println("You have to decide between either \"Rådhuspladsen\" or \"Politigården\".");
            }
        }
    }
}

/*  //TODO final boss??

System.out.println(""+
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
        fight.turnController(firstEnemy, player);

*/
