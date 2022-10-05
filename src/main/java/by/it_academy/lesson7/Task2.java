package by.it_academy.lesson7;

public class Task2 {
    public static void main(String[] args) {

        String[] list = new String[]{"Ivan,1991", "Pavel,2001", "Kirill,2015", "Alexander,2003"};
        String longestName = "";
        double sum = 0;

        for (String item : list) {
            String[] nameAndYear = item.split(",");
            String name = nameAndYear[0];
            int year = Integer.parseInt(nameAndYear[1]);

            if (longestName.length() < name.length()) {
                longestName = name;
            }
            sum += year;
        }
        System.out.println(longestName);
        System.out.println(sum / list.length);
    }
}


