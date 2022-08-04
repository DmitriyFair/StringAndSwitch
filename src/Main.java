public class Main {
    // При выведении месяца указывется время года (либо Такой месяц не существует). С помощью if else.
    public static void main(String[] args) {
        String month  = "";
        if (month == "January" || month == "February" || month == "December"){
            System.out.println("The winter");
        }
        else if (month == "March" || month == "April" || month == "May"){
            System.out.println("The spring");
        }
        else if(month == "June" || month == "July" || month == "August"){
            System.out.println("The summer");
        }
        else if(month == "September" || month == "October" || month == "November"){
            System.out.println("The fall");
        }
        else System.out.println("This month does not exist");
    }
}
