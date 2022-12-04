package testRunner;

import Utilis.DataSet;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screen.EMIScreenCalculation;

public class CalculationTest extends Setup {
    @BeforeTest
    public void startBtn() {
        EMIScreenCalculation emiScreenCalculation = new EMIScreenCalculation(driver);
        emiScreenCalculation.btnStart.click();
    }

    @Test(dataProvider = "data-provider", dataProviderClass = DataSet.class)
    public void emiCalculation(double amount, double interest, int year, double processingFee, double mEMI, double TInterest, double ProFee, double TPayment)  {
        EMIScreenCalculation emiScreenCalculation = new EMIScreenCalculation(driver);
        emiScreenCalculation.emiCalculation(amount, interest, year, processingFee);

        String monthlyEmi = String.valueOf((emiScreenCalculation.getmEMI()));
        String totalInterest = String.valueOf((emiScreenCalculation.getTInterest()));
        String processingFeeMonthly = String.valueOf((emiScreenCalculation.getProFee()));
        String monthlyTotalPayment = String.valueOf((emiScreenCalculation.getTPayment()));


        System.out.println(monthlyEmi);
        System.out.println(totalInterest);
        System.out.println(processingFeeMonthly);
        System.out.println(monthlyTotalPayment);


        Assert.assertEquals(monthlyEmi, String.valueOf(mEMI));
        Assert.assertEquals(totalInterest, String.valueOf(TInterest));
        Assert.assertEquals(processingFeeMonthly, String.valueOf(ProFee));
        Assert.assertEquals(monthlyTotalPayment, String.valueOf(TPayment));
        emiScreenCalculation.resetBtn.click();


    }


}
