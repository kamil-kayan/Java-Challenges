class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    //THis plot () Method will override the Plot() in Super Class.
    public String plot() {
        return "No Plot Right Now";
    }

    public String getName() {
        return this.name;
    }

}

//Movie 1
class OrphanBlack extends Movie {
    public OrphanBlack() {
        super("Orphan Black");
    }

    public String plot() {
        return "Clones that are experimented by An organization.";
    }

}

//Movie 2
class Arrow extends Movie {
    public Arrow() {
        super("Arrow");
    }

    @Override
    public String plot() {
        return "A vigilante who is spends 5years in an island " +
                "and Comes Back to Cleanse his City of Villains";
    }
}

//Movie 3
class Flash extends Movie {
    public Flash() {
        super("Flash");
    }

    @Override
    public String plot() {
        return "A scientist Struck by Lightening that makes him " +
                "the Fastest Man Alive, or is he?";
    }
}

//Movie 4;
class TheLastKingdom extends Movie {
    public TheLastKingdom() {
        super("The Last Kingdom.");
    }

    public String plot() {
        return "A young Lord Uhtred Torn between his Love for the by Danes and his " +
                "Loyalty for the Saxons.";
    }
}

//Movie 5;
class GOT extends Movie {
    public GOT() {
        super("Game of Thrones.");
    }
    //this plot will inherit the Super plot()method.
}

//Main Class;
class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i);
            System.out.println("Movie Name = " + movie.getName());
            System.out.println("Plot: " + movie.plot());
        }
    }

    //A method That generates a random Movie;
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number Generated = " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new OrphanBlack();
            case 2:
                return new Arrow();
            case 3:
                return new Flash();
            case 4:
                return new TheLastKingdom();
            case 5:
                return new GOT();
            default:
                return null;

        }

    }
}