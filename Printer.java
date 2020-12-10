public class Printer {
    private final boolean duplex;
    private int tonerLevel;
    private int numOfPages;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in Duplex");
        }
        this.numOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public boolean isDuplex(boolean b) {
        if (b) {
            System.out.println("Printing on both Pages");
        }
        return duplex;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}
