public class Main1 {
    // Тоже самое, но со switch case.
    public static void main(String[] args) {
        String month = "";
        switch (month){
            case "January":
            case "February":
            case "December":
                System.out.println("The spring");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("The summer");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("The fall");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("The winter");
                break;
            default:
                System.out.println("This month does not exist");
                break;
        }
    }
}
