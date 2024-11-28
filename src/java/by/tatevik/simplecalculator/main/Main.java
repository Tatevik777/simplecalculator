package by.tatevik.simplecalculator.main;

import by.tatevik.simplecalculator.service.ResultWriter;
import by.tatevik.simplecalculator.util.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        int res = Calculator.sum(x, y);
        ResultWriter.printResult(x + "+" + y + "=" + res);
        res = Calculator.diff(x, y);
        ResultWriter.printResult(x + "-" + y + "=" + res);
        res = Calculator.multiply(x, y);
        ResultWriter.printResult(x + "*" + y + "=" + res);
    }
}
