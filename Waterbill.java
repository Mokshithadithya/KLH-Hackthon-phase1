 import java.util.Scanner;

class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int consumption;
        int bill;

        System.out.print("Enter water consumption in litres: ");
        consumption = sc.nextInt();

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);

        sc.close();
    }
} 
    

