package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList.generics;

public class Main {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        Computer<KeyBoard, Tv> computer = new Computer<>(keyBoard);
        mouse.input();
        mouse.scroll();
        System.out.println("-----------------");
        KeyBoard input = computer.getInput();
        computer.getInput().input();
        input.input();
        input.exit();
        keyBoard.input();
        keyBoard.exit();

        System.out.println("-----------------");
        Computer<Mouse, Monitor> mouseComputer = new Computer<>(mouse);
        mouseComputer.getInput().scroll();

        System.out.println("-----------------");
        //computer.getOutput().soundOff();
    }
}
