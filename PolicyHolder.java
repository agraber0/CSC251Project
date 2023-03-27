public class PolicyHolder
{
   private Policy policy;
   
   private double policyholderHeight,
                  policyholderWeight;
   
   private int policyholderAge;
   
   private String providerName,
                  firstName,
                  lastName,
                  smokingStatus,
                  policyNum;
                  
   //constructors
   public Policy()
   {
      policyholderHeight = 0;
      policyholderWeight = 0;
      policyNum = "";
      policyholderAge = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      smokingStatus = "";
   }
   
   public Policy(double height, double weight, String num, int age, String provider, String first, String last, String status)
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
   
   public void setPolicyNum(String num)
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
   
   public String getPolicyNum()
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
   
   public String toString()
   {
      return String.format();
   }
   
}