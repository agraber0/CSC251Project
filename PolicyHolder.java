public class PolicyHolder
{
   private double policyholderHeight,
                  policyholderWeight;
   
   private int policyholderAge;
   
   private String providerName,
                  firstName,
                  lastName,
                  smokingStatus,
                  policyNum;
                  
   //constructors
   public PolicyHolder()
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
   
   public PolicyHolder(double height, double weight, String num, int age, String provider, String first, String last, String status)
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
   
   public PolicyHolder(PolicyHolder object2)
   {
      policyholderHeight = object2.policyholderHeight;
      policyholderWeight = object2.policyholderWeight;
      policyNum = object2.policyNum;
      policyholderAge = object2.policyholderAge;
      providerName = object2.providerName;
      firstName = object2.firstName;
      lastName = object2.lastName;
      smokingStatus = object2.smokingStatus;
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
      return String.format("Policy Number: " + policyNum +
             "\nProvider Name: " + providerName + 
             "\nPolicyholder's First Name: " + firstName +
             "\nPolicyholder's Last Name: " + lastName +
             "\nPolicyholder's Age: " + policyholderAge + 
             "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
             "\nPolicyholder's Height: " + policyholderHeight + " inches" +
             "\nPolicyholder's Weight: " + policyholderWeight + " pounds");
   }   
}