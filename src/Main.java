public class Main {
    // При выведении месяца указывется время года (либо Такой месяц не существует). С помощью if else.
    public static void main(String[] args) {
        String month  = "";
        if (month.equals("January") || month.equals("February") || month.equals("December")) {
            System.out.println("The winter");
        }
        else if (month.equals("March") || month.equals("April") || month.equals("May")){
            System.out.println("The spring");
        }
        else if(month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("The summer");
        }
        else if(month.equals("September") || month.equals("October") || month.equals("November")){
            System.out.println("The fall");
        }
        else System.out.println("This month does not exist");
    }
}
