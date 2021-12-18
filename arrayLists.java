import java.util.*;

public class arrayLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inputValid = true;
        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (inputValid == true) {
            System.out.println("\n------Welcome To------");
            System.out.println("Zain's Array List Menu");
            System.out.println("----------------------\n");

            System.out.println("Options: ");
            System.out.println("1 - Count The Letters");
            System.out.println("2 - Sort Numbers");
            System.out.println("3 - Sum of Numbers");
            System.out.println("4 - Remove Duplicates");
            System.out.println("5 - Quit");
            System.out.println("");
            System.out.println("Select A Choice: ");
            String choice = input.nextLine();
            System.out.println("");

            if (choice.equals("1")) {
                countLetters();
            } else if (choice.equals("2")) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                sort(list);
            } else if (choice.equals("3")) {
                ArrayList<Double> list = new ArrayList<Double>();
                sum(list);
            } else if (choice.equals("4")) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                removeDuplicate(list);
            } else if (choice.equals("5")) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
    }

    public static int countLetters() {
        int count = 1;
        int total = 0;
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Words (Use -1 to exit): ");

        for (int i = 0; i < count; i++) {

            String temp = input.nextLine();
            char[] convert = temp.toCharArray();
            temp = temp.toLowerCase();

            if (temp.equals("-1")) {
                System.out.println(words);
                System.out.print("Total letter count: ");
                System.out.println(total);
                return total;
            }

            words.add(i, temp);
            total += convert.length;
            count++;
        }
        return -1;
    }

    public static void sort(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input 5 Numbers: ");
        for (int i = 0; i <= 4; i++) {
            int temp = input.nextInt();
            list.add(i, temp);
        }
        for (int i = 0; i < list.size(); i++) {
            int currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin > list.get(j)) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            list.add(i, list.remove(currentMinIndex));
        }
        System.out.println("Sorted List: " + list);
    }

    public static double sum(ArrayList<Double> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Numbers (Use -1 to exit): ");

        try {
            double temp;
            int count = 0;
            do {
                temp = input.nextDouble();
                if (temp == -1) {
                    System.out.println(list);
                    double total = 0.0;
                    for (int j = 0; j < list.size(); j++) {
                        total += list.get(j);
                    }
                    System.out.print("Total: ");
                    System.out.println(total);
                }

                list.add(count++, temp);
            } while (temp != -1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 10 Numbers: ");
        for (int i = 0; i <= 9; i++) {
            int temp = input.nextInt();
            list.add(i, temp);
        }
        for (int i = 0; i < list.size(); i++) {
            int currentNum = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentNum == list.get(j)) {
                    currentNum = list.get(j);
                    currentMinIndex = j;
                    list.remove(currentMinIndex);
                    j--;
                }
            }
        }
        System.out.print("Distinct integers: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
