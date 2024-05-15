package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList;

public class Main {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        Computer<KeyBoard> computer = new Computer<>(keyBoard);
        mouse.input();
        mouse.scroll();
        System.out.println("-----------------");
        //computer.getInput().input();
        KeyBoard input = computer.getInput();
        computer.getInput().input();
        input.input();
        keyBoard.exit();

        Computer<KeyBoard> computer1 = new Computer<>();
    }
}
