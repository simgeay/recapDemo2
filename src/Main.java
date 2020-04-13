public class Main {

    public static void main(String[] args) {
        double [] myList = {1.2,6.3,4.3,5.6};
        double total = 0;
        double maxNumber = myList[0];
        for(double number:myList){
            total += number;
            if (maxNumber < number){
                maxNumber = number;
            }
        }
        System.out.println("Sum of the list is : " + total);
        System.out.println("The max number is : " + maxNumber);
    }
}
