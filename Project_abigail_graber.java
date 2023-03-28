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
         
         PolicyHolder policyHolder = new PolicyHolder(height, weight, policyNum, age, providerName, firstName, lastName, smokingStatus);
         
         Policy myPolicy = new Policy(policyHolder);
         
         policyList.add(myPolicy);
         
      }
      
      for (Policy policy : policyList)
      {
         for(int i=0; i < policyList.size(); i++)
         {
            System.out.println(policyList.get(i));
            System.out.println();
         }
            
         if (smokingStatus.equalsIgnoreCase("smoker"))
         {
            sPolicy += 1;
         }    
         else if (smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            nsPolicy += 1;
         }
         
         System.out.println("There were " + policy.getInstanceCount() + " Policy objects created");
         System.out.println();
         
      }
      
      
      System.out.println("The number of policies with a smoker is: " + sPolicy);
      System.out.println("The number of policies with a non-smoker is: " + nsPolicy);
      
      inputFile.close();
   
   }
}