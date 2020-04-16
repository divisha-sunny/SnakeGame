package com.SnakeGame;

public class AppleElement extends BoardComponent {
    public AppleElement(char symbol){
        setIcon(symbol);
    }

    public void addRandomApple(Board screen, AppleElement apple){

        int x = (int) (((Math.random())*screen.getBoardWidth()-1));
        int y = (int) (((Math.random())*screen.getBoardHeight()-1));

        if(x==0){
            x = 3;
        }
        if(y==0){
            y = 2;
        }
        screen.setObjectLocation(apple,x,y);
    }
}
