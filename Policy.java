public class Policy
{
  //fields
   private PolicyHolder holder;
      
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