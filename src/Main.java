import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        BankApplication bankApplication = new BankApplication();
        System.out.println("Welcome to Java intensive Almaty");
        while (true){
            System.out.println("PRESS");
            System.out.println("[1] TO ADD WORKERS PRESS");
            System.out.println("[2] TO LIST WORKERS");
            System.out.println("[0] TO EXIT");
            int press = in.nextInt();
            if (press==1){
                System.out.println("Enter ID");
                int inputId = in.nextInt();
                System.out.println("Enter name");
                String inputName = in.next();
                System.out.println("Enter surname");
                String inputSurName = in.next();
                System.out.println("Enter salary");
                int inputSalary = in.nextInt();
                System.out.println("Enter department");
                String inputDepartment = in.next();
                Worker worker = new Worker(inputId, inputName, inputSurName,inputDepartment, inputSalary);
                bankApplication.addWorker(worker);
            }
            else if (press==2) {
                for (Worker worker: bankApplication.workers) {
                    if (worker==null) continue;
                    System.out.println(worker);
                }
            } else if (press==0) {
                break;
            }
        }
    }
}