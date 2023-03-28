public class Policy
{
  //fields
   private PolicyHolder policyHolder;
   private static int instanceCount = 0;
      
   public Policy(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }
   
   public Policy()
   {
      instanceCount++;
   }
   
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   
   public int getInstanceCount()
   {
      return instanceCount;
   }
   
   //Method calculates BMI
   public double getBMI()
   {
      final double FACTOR = 703;
      
      return ((policyHolder.getWeight() * FACTOR)/(policyHolder.getWeight() * policyHolder.getHeight()));
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
         
         if (policyHolder.getAge() > AGE_MAX)
            insurancePrice += ageFee;
         
         if (policyHolder.getStatus().equalsIgnoreCase("smoker"))
            insurancePrice += smokerFee;
         
         if (getBMI() > BMI_MAX)//calls the getBMI() method
            insurancePrice += ((getBMI() - BMI_MAX) * BMI_FEE);

      return insurancePrice;
   }
   
   public String toString()
   {
      return String.format();
   }
   
}