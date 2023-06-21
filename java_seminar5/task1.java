package java_seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> phone_number_list;

        while (true) {
            System.out.println("Введите команду: ");
            String slov = scanner.nextLine();
            
            if (slov.equals("EXIT")) {
                break;

            } else if (slov.equals("ADD")) {
                System.out.println("Введите фаимилию абонента: ");
                String surname = scanner.nextLine();

                System.out.println("Введите номер абонента: ");
                Integer phone_number = Integer.parseInt(scanner.nextLine());

                if (map.containsKey(surname)){
                    phone_number_list = map.get(surname);
                    phone_number_list.add(phone_number);
                    map.put(surname, phone_number_list);
                } else{
                    phone_number_list = new ArrayList<>();
                    phone_number_list.add(phone_number);
                    map.put(surname, phone_number_list);
                }

            } else if (slov.equals("LIST")) {
                System.out.println(map);

            } else if (slov.equals("GET")) {
                System.out.println("Введите фамилию абонента, которого надо искать: ");
                String surname = scanner.nextLine();

                if (surname == null) {
                    System.out.println("Такой фамилии нет в справочнике!");
                } else {
                    System.out.println(map.get(surname));
                }                          

            } else if (slov.equals("REMOVE")) {
                System.out.println("Введите фамилию абонента для удаления из справочника: ");
                String remove = scanner.nextLine();

                if (remove == null) {
                    System.out.println("Такой фамилии нет в справочнике!");
                } else {
                    map.keySet().remove(remove);
                    System.out.println(map);
                }               
            }
        }
    }        
}
