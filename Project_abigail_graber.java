import java.util.Scanner;
import java.io.*;

public class Project_abigail_graber
{

   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");
      
      if(!file.exists())
      {
      System.out.println("Unable to opent file");
      System.exit(0);
      }
      
      Scanner inputFile = new Scanner(file);
      
      String providerName = "",
             firstName = "",
             lastName = "",
             smokingStatus = "";
             
      int policyNum = 0,
          age = 0,
          sPolicy = 0,
          nsPolicy = 0;
          
      double height,
             weight,
             policyPrice,
             bmi;
      
      while (inputFile.hasNext())
      {
         policyNum = inputFile.nextInt();
         inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         bmi = ((weight * 703)/(height * height)); 
                 
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         
         Policy compPolicy = new Policy(height, weight, policyNum, age, providerName, firstName, lastName, smokingStatus);
         
         System.out.println("Policy Number: " + policyNum); 
         System.out.println("Provider Name: " + providerName);
         System.out.println("Policyholder's First Name: " + firstName);
         System.out.println("Policyholder's Last Name: " + lastName);
         System.out.println("Policyholder's Age: " + age);
         System.out.println("Policyholder's Smoking Status: " + smokingStatus);
         System.out.printf("Policyholder's Height: %,.1f", height);
         System.out.println(" inches");
         System.out.printf("Policyholder's Weight: %,.1f", weight);
         System.out.println(" pounds"); 
         System.out.printf("Policyholder's BMI: %,.2f\n", bmi);
         System.out.printf("Policy Price: $%,.2f\n", compPolicy.getInsurancePrice()); 
         System.out.println(); 
         
         if (smokingStatus.equalsIgnoreCase("smoker"))
         {
            sPolicy += 1;
         }    
         else if (smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            nsPolicy += 1;
         }
      }
      
      System.out.println("The number of policies with a smoker is: " + sPolicy);
      System.out.println("The number of policies with a non-smoker is: " + nsPolicy);
      
      inputFile.close();
   
   }
}