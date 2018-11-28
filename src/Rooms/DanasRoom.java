package Rooms;

import Game.Runner;
import People.Person;
public class DanasRoom extends Room {

    public DanasRoom(int x, int y){
        super(x,y);
    }

    @Override
    public void enterRoom (Person x){
        occupant=x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Welcome to Dana's room. Thank you for leaving.");
        Runner.gameOff();
    }
}
