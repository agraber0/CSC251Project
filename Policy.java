public class Policy
{
  //fields
   private double policyholderHeight,
                  policyholderWeight;
   
   private int policyNum,
               policyholderAge;
   
   private String providerName,
                  firstName,
                  lastName,
                  smokingStatus;
                  
   //constructors
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
   
   //setters
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
   
   //getters
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
   
   //Method calculates BMI
   public double getBMI()
   {
      final double FACTOR = 703;
      
      return ((policyholderWeight * FACTOR)/(policyholderHeight * policyholderHeight));
   }
   
   //Method calculates policyholder's total insurance price
   public double getInsurancePrice()
   {
      //constants
      double baseFee = 600,
             additionalFee = 0,
             bmiFee = ((getBMI() - 35) * 20);
      
      final double ageFee = 75,
                   smokerFee = 100,
                   AGE_MAX = 50,
                   BMI_MAX = 35,
                   BMI_FEE = 20;
                   
      double insurancePrice = baseFee;
         
         if (policyholderAge > AGE_MAX)
            insurancePrice += ageFee;
         
         if (smokingStatus.equalsIgnoreCase("smoker"))
            insurancePrice += smokerFee;
         
         if (getBMI() > BMI_MAX)//calls the getBMI() method
            insurancePrice += ((getBMI() - BMI_MAX) * BMI_FEE);

      return insurancePrice;
   }
}