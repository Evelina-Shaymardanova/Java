// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

class Main{
    public static void main (String[] args){
        int[] arr = {2, 4, 7, 8, 10, 9};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[indexOfMax]){
                indexOfMax = arr[i];
            }
            if (arr[i] < arr[indexOfMin]){
                indexOfMin = arr[i];
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }
} 
