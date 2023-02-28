import java.util.Scanner;

public class Project_abigail_graber
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int policyNum = 0,
          age = 0;
          
      double height,
             weight;
      
      String providerName = "",
             firstName = "",
             lastName = "",
             smokingStatus = "";
      
      System.out.print("Please enter the Policy Number: ");     
      policyNum = keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      while (!smokingStatus.equalsIgnoreCase("smoker") && !smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            System.out.print("Invalid selection. Please choose from the options listed (smoker/non-smoker): ");
            smokingStatus = keyboard.nextLine();
         }
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      Policy compPolicy = new Policy(height, weight, policyNum, age, providerName, firstName, lastName, smokingStatus);
      
      System.out.println();
      System.out.println("Policy Number: " + compPolicy.getPolicyNum());
      System.out.println("Provider Name: " + compPolicy.getProviderName());
      System.out.println("Policyholder's First Name: " + compPolicy.getFirstName());
      System.out.println("Policyholder's Last Name: " + compPolicy.getLastName());
      System.out.println("Policyholder's Age: " + compPolicy.getAge());
      System.out.println("Policyholder's Smoking Status: " + compPolicy.getStatus());
      System.out.printf("Policyholder's Height: %,.1f\n", compPolicy.getHeight());
      System.out.printf("Policyholder's Weight: %,.1f\n", compPolicy.getWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", compPolicy.getBMI());
      System.out.printf("Policy Price: $%,.2f\n", compPolicy.getInsurancePrice());
   }
}