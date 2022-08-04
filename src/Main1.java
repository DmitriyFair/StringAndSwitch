public class Main1 {
    // Тоже самое, но со switch case.
    public static void main(String[] args) {
        String month = "";
        switch (month){
            case "January":
                System.out.println("The winter");
                break;
            case "February":
                System.out.println("The winter");
                break;
            case "March":
                System.out.println("The spring");
                break;
            case "April":
                System.out.println("The spring");
                break;
            case "May":
                System.out.println("The spring");
                break;
            case "June":
                System.out.println("The summer");
                break;
            case "July":
                System.out.println("The summer");
                break;
            case "August":
                System.out.println("The summer");
                break;
            case "September":
                System.out.println("The fall");
                break;
            case "October":
                System.out.println("The fall");
                break;
            case "November":
                System.out.println("The fall");
                break;
            case "December":
                System.out.println("The winter");
                break;
            default:
                System.out.println("This month does not exist");
        }
    }
}
