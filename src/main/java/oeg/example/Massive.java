package oeg.example;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        /*String input,title = "Биномиальные коэффициенты";

        input = JOptionPane.showInputDialog(null,"Укажите значение нижнего индекса",title,JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            System.exit(0);
        }
        int n = Integer.parseInt(input);
        if(n < 0){
            JOptionPane.showMessageDialog(null,"Указан неверный параметр",title,JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        int[] binoms = new int[n + 1];

        binoms[0] = 1;
        String txt = "Содержимое массива:\n| "+ binoms[0] + "|";

        for (int i = 1; i < binoms.length; i++) {
            binoms[i] = binoms[i - 1]*(n - i + 1)/i;

            txt += ""+binoms[i]+" |";
        }

        JOptionPane.showMessageDialog(null,txt,title,JOptionPane.INFORMATION_MESSAGE);*/

        //Array_A();
        //Array_B();
        //Array_C();
    }

    public static void Array_A(){
        Scanner sc = new Scanner(System.in);
        String[] animals = {"Волк", "Кошка", "Собака", "Кролик"};
        System.out.println("Введите название животного: ");
        String animal = sc.nextLine();

        for (int i = 0; i < animals.length; i++) {
            if(animal.equals(animals[i])){
                System.out.printf("Введённое вами животное: %s",animals[i]);
                break;
            }else{
                System.out.println("В нашей базе данных нет такого животного");
                System.out.print("Попробуйте заново");
                break;
            }
        }
    }

    public static void Array_B(){
        int size = 10;

        Random random = new Random();

        int[]nums = new int[size];

        String txt = "Массив случайных чисел:\n| ";

        for (int i = 0; i < nums.length; i++) {

            nums[i] = random.nextInt(10);

            txt += nums[i]+" | ";
        }

        txt += "\nПроверка:\n| ";

        for (int num : nums) {
            txt += num + " | ";
        }
        JOptionPane.showMessageDialog(null,txt,"Случайные числа",JOptionPane.PLAIN_MESSAGE);
    }

    public static void Array_C(){
        int rows = 9,cols = 9;

        int[][] table = new int[rows][cols];

        String txt = "\t|\t";

        for (int i = 1; i <= cols; i++) {
            txt += i +"\t";
        }
        txt += "\n";
        for (int i = 1; i <= 10 + 8 * cols; i++) {
            txt += "-";
        }
        for (int i = 0; i < table.length; i++) {
            txt += "\n" + (i + 1) +"\t|\t";
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1)*(j + 1);
                txt += table[i][j] + "\t";
            }
        }
        System.out.println("Таблица умножения");
        System.out.println(txt);
    }


}
