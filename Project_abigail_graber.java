import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class Project_abigail_graber
{

   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      if(!file.exists())
      {
      System.out.println("Unable to opent file");
      System.exit(0);
      }
      
      Scanner inputFile = new Scanner(file);
      
      String providerName = "",
             firstName = "",
             lastName = "",
             smokingStatus = "",
             policyNum = "";
             
      int age = 0,
          sPolicy = 0,
          nsPolicy = 0;
          
      double height,
             weight,
             policyPrice,
             bmi;
      
      while (inputFile.hasNext())
      {
         policyNum = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
                 
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         
         policyList.add(new Policy(height, weight, policyNum, age, providerName, firstName, lastName, smokingStatus)); 
      }
      
      for (Policy policy : policyList)
      {
         System.out.println("Policy Number: " + policy.getPolicyNum()); 
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %,.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%,.2f\n", policy.getInsurancePrice()); 
         System.out.println(); 
         
         if (policy.getStatus().equalsIgnoreCase("smoker"))
         {
            sPolicy += 1;
         }    
         else if (policy.getStatus().equalsIgnoreCase("non-smoker"))
         {
            nsPolicy += 1;
         }
      }

      
      System.out.println("The number of policies with a smoker is: " + sPolicy);
      System.out.println("The number of policies with a non-smoker is: " + nsPolicy);
      
      inputFile.close();
   
   }
}