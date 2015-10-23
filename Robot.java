/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх.

В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.

Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):

public class Robot {

    public Direction getDirection() {
        // текущее направление взгляда
    }

    public int getX() {
        // текущая координата X
    }

    public int getY() {
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
Direction, направление взгляда робота,  — это перечисление:
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
*/

public static void moveRobot(Robot robot, int toX, int toY) {
    int x = robot.getX();
    int y = robot.getY();
    
    //1 quadrant
    if (x >= toX && y >= toY) { 
        
        //turn robot left, since it's to the right side of toX coordinate
        while (!(robot.getDirection() == Direction.LEFT)) { //while not looking left
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's upper than toY
        while (!(robot.getDirection() == Direction.DOWN)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
        
    }
               
    //2 quadrant
    else if (x >= toX && y <= toY) { 
        
        //turn robot left, since it's to the right side of toX coordinate
        while (!(robot.getDirection() == Direction.LEFT)) { //while not looking left
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's lower than toY
               while (!(robot.getDirection() == Direction.UP)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
    }
    
    //3 quadrant
    else if (x <= toX && y <= toY) { 
        
        //turn robot left, since it's to the left of toX coordinate
        while (!(robot.getDirection() == Direction.RIGHT)) { //while not looking right
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's lower than toY
        while (!(robot.getDirection() == Direction.UP)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
    }
               
    //4 quadrant
    else if (x <= toX && y >= toY) { 
        
        //turn robot left, since it's to the right side of toX coordinate
        while (!(robot.getDirection() == Direction.RIGHT)) { //while not looking right
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's upper than toY
        while (!(robot.getDirection() == Direction.DOWN)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
    }               
               
}