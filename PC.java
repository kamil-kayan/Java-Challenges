public class PC {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public PC(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    //to Access the Private Motherboard method;
    public void progLoader() {
        motherboard.loadProgram("Linux v2.3");
    }

    //Directly Accessing the Monitor Class
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy Graphics;
        monitor.drawPixel(1200, 70, "Green");

    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Case getTheCase() {
        return theCase;
    }
}

