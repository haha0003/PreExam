package Ex13;

import java.util.Random;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    Random random = new Random();

    JuleGave(){
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
    }


    public boolean couldBeLego(){
        boolean lego = false;
        if (isSoft == false && doesRattle == true){
            lego = true;
        }
        return lego;
    }


    @Override
    public String toString() {
        return "JuleGave{" +
                "isSoft=" + isSoft +
                ", isRectangular=" + isRectangular +
                ", doesRattle=" + doesRattle +
                '}' + "Lego: " + couldBeLego();
    }
}
