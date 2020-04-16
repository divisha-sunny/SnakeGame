package com.SnakeGame;

public class BoardComponent {
// This class has location coordinates x,y and icon representing the component
    private int x, y;
    private char icon;// Icon can be a snake, apple or dot

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public char getIcon(){
        return this.icon;
    }
    public void setX(int newLocation){
        this.x = newLocation;
    }
    public void setY(int newLocation){
        this.y = newLocation;
    }
    public void setIcon(char newSymbol){
        this.icon = newSymbol;
    }

}
