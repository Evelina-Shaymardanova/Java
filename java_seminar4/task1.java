package java_seminar4;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
// 4. Если введено exit, то программа завершается.

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {  
            String slov = scanner.nextLine();

            if (slov.equals("exit")) {
                break;
            } else if (slov.equals("print")) {
                System.out.println("Вывод строк в обратном порядке:");
                while (!list.isEmpty()) {
                    System.out.println(list.removeLast());
                }
            } else if (slov.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println("Последняя введенная строка удалена из памяти.");
                } else {
                    System.out.println("Нет сохраненных строк для удаления.");
                }
            } else {
                list.addLast(slov);
            }
        }
    }
}