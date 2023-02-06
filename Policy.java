public class Policy
{
   private double policyholderHeight,
                  policyholderWeight;
   
   private int policyNum,
               policyholderAge;
   
   private String providerName,
                  firstName,
                  lastName,
                  smokingStatus;
                  
   public Policy()
   {
      policyholderHeight = 0;
      policyholderWeight = 0;
      policyNum = 0;
      policyholderAge = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      smokingStatus = "";
   }
   
   public Policy(double height, double weight, int num, int age, String provider, String first, String last, String status)
   {
      policyholderHeight = height;
      policyholderWeight = weight;
      policyNum = num;
      policyholderAge = age;
      providerName = provider;
      firstName = first;
      lastName = last;
      smokingStatus = status;
   }
   
   public void setHeight(double height)
   {
      policyholderHeight = height;
   }
   
   public void setWeight(double weight)
   {
      policyholderWeight = weight;
   }
   
   public void setPolicyNum(int num)
   {
      policyNum = num;
   }
   
   public void setAge(int age)
   {
      policyholderAge = age;
   }
   
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
   public void setLastName(String last)
   {
      lastName = last;
   }
   
   public void setStatus(String status)
   {
      smokingStatus = status;
   }
   
   public double getHeight()
   {
      return policyholderHeight;
   }
   
   public double getWeight()
   {
      return policyholderWeight;
   }
   
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   public int getAge()
   {
      return policyholderAge;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public String getStatus()
   {
      return smokingStatus;
   }
   
   public double getBMI()
   {
      double BMI = ((policyholderWeight * 703)/(policyholderHeight * policyholderHeight));
      return BMI;
   }
   
   public double getInsurancePrice()
   {
      double baseFee = 600,
             additionalFee = 0,
             bmiFee = ((getBMI() - 35) * 20);
      
      final double ageFee = 75,
                   smokerFee = 100;
             
         if (policyholderAge > 50)
         {
            additionalFee = ageFee;
         }
         
         else if (smokingStatus.equalsIgnoreCase("smoker"))
         {
            additionalFee = smokerFee;
         }
         
         else if (getBMI() > 35)
         {
            additionalFee = bmiFee;
         }
         
         else if (policyholderAge > 50 && smokingStatus.equalsIgnoreCase("smoker"))
         {
            additionalFee = (ageFee + smokerFee);
         }
         
         else if (policyholderAge > 50 && getBMI() > 35)
         {
            additionalFee = (ageFee + bmiFee);
         }
         
         else if (policyholderAge > 50 && smokingStatus.equalsIgnoreCase("smoker") && getBMI() > 35)
         {
            additionalFee = (ageFee + smokerFee + bmiFee);
         }
         
         else if (smokingStatus.equalsIgnoreCase("smoker") && getBMI() > 35)
         {
            additionalFee = (smokerFee + bmiFee);
         }
         
      double insurancePrice = (baseFee + additionalFee);
      return insurancePrice;
   }
}