import java.util.Random;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){

        System.out.println("low:");
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        System.out.println("high");
        int high = sc.nextInt();
        System.out.println("target:");
        int target = sc.nextInt();
        //int i = x + (int)(Math.random() * (y - x + 1));
        int[] list = new int[10];
        for (int i = 0; i < 10; i++){
            list[i] = low + (int)(Math.random() * (high - low + 1));
        }

        /*for (int i : list){
            System.out.print(i);
        }*/
        for (int i = 0; i < 9; i++){
            for (int j = i+1; j < 10; j++){
                if (list[i] > list[j]){
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        for (int i : list) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < 9; i++){
            for (int j = i+1; j < 10; j++){
                if (list[i] + list[j] == target){
                    System.out.println(i +"  "+ j);
                }else {
                    System.out.println("no");
                }
            }
        }

    }

    public static int[] RandList(){
        //Scanner sc = new Scanner(System.in);
        Random num = new Random();
        System.out.println(num.nextInt());
        return null;
    }
}
