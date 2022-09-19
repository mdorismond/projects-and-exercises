package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlaying = 3;
		int  raccoonsEating = 2;
		int racconsLeft = raccoonsPlaying - raccoonsEating;
		System.out.println(racconsLeft);
        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int differenceOfFlowersAndBees = numberOfFlowers - numberOfBees;
		System.out.println(differenceOfFlowersAndBees);
        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int pigeonFriend = 1;
		int totalPigeons = lonelyPigeon + pigeonFriend;
		System.out.println(totalPigeons);

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int joiningOwls = 2;
		int totalOwls = owlsOnFence	+ joiningOwls;
		System.out.println(totalOwls);

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int busyBeavers = 2;
		int swimmingBeavers = 1;
		int remainingBeavers = busyBeavers - swimmingBeavers;
		System.out.println(remainingBeavers);

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int sittingToucans = 2;
		int joiningToucans = 1;
		int totalToucans = sittingToucans + joiningToucans;
		System.out.println(totalToucans);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int hungrySquirrels = 4;
		int squirrelNuts = 2;
		int extraSquirrels = hungrySquirrels - squirrelNuts;
		System.out.println(extraSquirrels);

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double hiltsQuarters = 0.25;
		double hiltsDimes = 0.10;
		double hiltsNickels = 0.10;
		double totalMoney = hiltsQuarters + hiltsDimes + hiltsNickels;
		System.out.println(totalMoney);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int msBriersmuffins = 18;
		int msMcadamsMuffins = 20;
		int msFlannerysMuffins = 17;
		int totalFirstGradeMuffins = msBriersmuffins + msMcadamsMuffins + msFlannerysMuffins;
		System.out.println(totalFirstGradeMuffins);

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double msHiltYoyoCost = 0.24;
		double msHiltWhistleCost = 0.14;
		double totalToysCost = msHiltYoyoCost + msHiltWhistleCost;
		System.out.println(totalToysCost);


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int lrgMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = lrgMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int msHiltSnow = 29;
		int brecknockSnow = 17;
		int totalSnowInInches = msHiltSnow + brecknockSnow;
		System.out.println(totalSnowInInches);


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double msHiltTotalCash = 10.00;
		double truckCost = 3.00;
		double pencilCost = 2.00;
		double remainingCash = msHiltTotalCash - (truckCost + pencilCost);
		System.out.println(remainingCash);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int totalMarbles = 16;
		int marblesLost = 7;
		int marblesLeft = totalMarbles - marblesLost;
		System.out.println(marblesLeft);


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganShells = 19;
		int neededNumberOfShells = 25;
		int diffOfShells = neededNumberOfShells - meganShells;
		System.out.println(diffOfShells);



        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBallons = 17;
		int redBalloons = 8;
		int greenBalloons = bradBallons - redBalloons;
		System.out.println(greenBalloons);


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int initialBooks = 38;
		int extraBooks = 10;
		int totalBooks = initialBooks + extraBooks;
		System.out.println(totalBooks);


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int oneBeeLegs = 6;
		int numberOfBees2 = 8;
		int totalBeeLegs = oneBeeLegs * numberOfBees2;
		System.out.println(totalBeeLegs);


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCost = 0.99;
		double numberOfCones = 2.0;
		double totalIceCreamCost = numberOfCones * iceCreamCost;
		System.out.println(totalIceCreamCost);


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeeded = 125;
		int hiltRocks = 64;
		int totalNumberOfRocksNeeded = rocksNeeded - hiltRocks;
		System.out.println(totalNumberOfRocksNeeded);


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int lostMarbles = 15;
		int remainingMarbles = hiltMarbles - lostMarbles;
		System.out.println(remainingMarbles);


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int concertDistance = 78;
		int distanceDriven = 32;
		int remainingDistance = concertDistance - distanceDriven;
		System.out.println(remainingDistance);

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timeSpentShovelingMorning = 90;
		int timeSpentShovelingAfternoon = 45;
		int totalTimeSpentShoveling = timeSpentShovelingAfternoon + timeSpentShovelingMorning;
		System.out.println(totalTimeSpentShoveling);


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotDogsPurchased = 6;
		double costOfHotDogs = 0.50;
		double totalMoneySpent = hotDogsPurchased * costOfHotDogs;
		System.out.println(totalMoneySpent);

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double totalCents = 0.50;
		double priceOfPencil = 0.07;
		double numberOfPencilsSheCanBuy = totalCents / priceOfPencil;
		System.out.println(numberOfPencilsSheCanBuy);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
			int totalButterfliesSeen = 33;
			int orangeButterflies = 20;
			int redButterflies = totalButterfliesSeen - orangeButterflies;
			System.out.println(redButterflies);



        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
			double moneyKatePaid = 1.00;
			double candyCost = 0.54;
			double changeOwed = moneyKatePaid - candyCost;
			System.out.println(changeOwed);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
			int initialNumberOfTrees = 13;
			int additionalTreesToPlant = 12;
			int totalTrees = initialNumberOfTrees + additionalTreesToPlant;
			System.out.println(totalTrees);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
			int numberOfDaysUntilGmaVisit = 2;
			int hoursInADay = 24;
			int hoursUntilGmaVistit = hoursInADay * numberOfDaysUntilGmaVisit;
		System.out.println(hoursUntilGmaVistit);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
			int numberOfCousins = 4;
			int piecesOfGumToGive = 5;
			int piecesOfGumNeeded = numberOfCousins * piecesOfGumToGive;
		System.out.println(piecesOfGumNeeded);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danInitialCash = 3.00;
		double candyBarCost = 1.00;
		double cashLeft = danInitialCash - candyBarCost;
		System.out.println(cashLeft);


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int totalBoats = 5;
		int pplInEachBoat = 3;
		int totalPplInBoats = totalBoats * pplInEachBoat;
		System.out.println(totalPplInBoats);

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		double initalLegos = 380;
		double legosLost = 57;
		double legosLeft = initalLegos - legosLost;
		System.out.println(legosLeft);

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int initialMuffins = 35;
		int numberOfMuffinsWanted = 83;
		int numberOfMuffinsNeededToBake = numberOfMuffinsWanted - initialMuffins;
		System.out.println(numberOfMuffinsNeededToBake);


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		double willyCrayons = 1400.0;
		double lucyCrayons = 290.0;
		double differenceInCrayons = willyCrayons - lucyCrayons;
		System.out.println(differenceInCrayons);

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int initialNumberOfStickers = 10;
		int stickerPages = 22;
		int totalStickers = initialNumberOfStickers * stickerPages;
		System.out.println(totalStickers);

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double totalCupcakes = 100.0;
		double numberOfKids = 8.0;
		double sharedCupcakes = totalCupcakes / numberOfKids;
		System.out.println(sharedCupcakes);


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		double gingerbreadCookies = 47.0;
		double numberOfCookiesToBeInJars = 6.0;
		double cookiesRemaining = gingerbreadCookies % numberOfCookiesToBeInJars;
		System.out.println(cookiesRemaining);


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		double croissantsPrepared = 59.0;
		double numberOfNeighbors = 8.0;
		double remainingCroissants = croissantsPrepared % numberOfNeighbors;
		System.out.println(remainingCroissants);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		double cookiesTrayCanHold = 12.0;
		double totalCookies = 276.0;
		double traysNeeded = totalCookies / cookiesTrayCanHold;
		System.out.println(traysNeeded);


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzels = 480;
		int oneServingOfPretzels = 12;
		int  totalPretzelServings = totalPretzels / oneServingOfPretzels;
		System.out.println(totalPretzelServings);


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
      */
		double lemonCupcakes = 53.0;
		double cupcakesLeftHome = 2.0;
		double cupcakesInBox = 3.0;
		double cupcakeBoxesGivenAway = (lemonCupcakes - cupcakesLeftHome) / cupcakesInBox;
		System.out.println(cupcakeBoxesGivenAway);


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		double carrotSticksPrepared = 74.0;
		double amountOfPpl = 12;
		double leftoverCarrotSticks = carrotSticksPrepared % amountOfPpl;
		System.out.println(leftoverCarrotSticks);



        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		double numberOfBears = 98.0;
		double maxBearsShelfCanHold = 7.0;
		double shelvesFilled = numberOfBears / maxBearsShelfCanHold;
		System.out.println(shelvesFilled);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		double picsInAlbum = 20.0;
		double totalPics = 480.0;
		double albumsNeeded = totalPics / picsInAlbum;
		System.out.println(albumsNeeded);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		double totalCards = 94.0;
		double maxCardsBoxCanHold = 8.0;
		double filledBoxesAndCards = totalCards % maxCardsBoxCanHold;
		System.out.println(filledBoxesAndCards);


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int numberofBooks = 210;
		int repairedShelves = 10;
		int booksOnEachShelf = numberofBooks / repairedShelves;
		System.out.println(booksOnEachShelf);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double bakedCroissants = 17.0;
		double totalGuests = 7.0;
		double croissantsForEachGuest = bakedCroissants / totalGuests;
		System.out.println(croissantsForEachGuest);


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */

     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */

	}

}
