import java.util.*;

public class AppMain {

    public static final int THRESHOLD = 5;
    static List<Integer> nums = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        rangeProcess();
        sortProcess();
        scanner.close();
    }
    static void sortProcess(){
        nums.sort(Comparator.naturalOrder());
        nums.forEach(System.out::print);
    }
    public static void rangeProcess(){
        while(nums.size() < THRESHOLD) {
            String s = scanner.nextLine();
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
                continue;
            }
            int num = Integer.parseInt(s);
            if(num<0 || num > 10) {
                System.out.println("Invalid range! Try again!");
                continue;
            }
            nums.add(num);
        }
    }
}
