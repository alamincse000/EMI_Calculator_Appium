package screen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EMIScreenCalculation {
    @FindBy(id = "com.continuum.emi.calculator:id/btnStart")
    public AndroidElement btnStart;
    @FindBy(id = "com.continuum.emi.calculator:id/etLoanAmount")
    AndroidElement amountBtn;
    @FindBy(id = "com.continuum.emi.calculator:id/etInterest")
    AndroidElement interestBtn;
    @FindBy(id = "com.continuum.emi.calculator:id/etYears")
    AndroidElement yearsBtn;
    @FindBy(id = "com.continuum.emi.calculator:id/etMonths")
    AndroidElement monthBtn;
    @FindBy(id = "com.continuum.emi.calculator:id/etEMI")
    AndroidElement emiBtn;
    @FindBy(id = "com.continuum.emi.calculator:id/etFee")
    AndroidElement processingBtn;
    @FindBy(id = "com.continuum.emi.calculator:id/btnCalculate")
    AndroidElement calculationBtn;
    @FindBy(id = "com.continuum.emi.calculator:id/btnReset")
    public AndroidElement resetBtn;


    @FindBy(id = "com.continuum.emi.calculator:id/monthly_emi_result")
    AndroidElement lblResultEMI;
    @FindBy(id = "com.continuum.emi.calculator:id/total_interest_result")
    AndroidElement lblTotalInterest;
    @FindBy(id = "com.continuum.emi.calculator:id/processing_fee_result")
    AndroidElement lblProcessingFee;
    @FindBy(id = "com.continuum.emi.calculator:id/total_payment_result")
    AndroidElement lblTotalPayment;

    private double mEMI;

    public double getmEMI() {
        return mEMI;
    }

    public void setmEMI(double mEMI) {
        this.mEMI = mEMI;
    }

    public double getTInterest() {
        return TInterest;
    }

    public void setTInterest(double TInterest) {
        this.TInterest = TInterest;
    }

    public double getProFee() {
        return ProFee;
    }

    public void setProFee(double proFee) {
        ProFee = proFee;
    }

    public double getTPayment() {
        return TPayment;
    }

    public void setTPayment(double TPayment) {
        this.TPayment = TPayment;
    }

    private double TInterest;
    private double ProFee;
    private double TPayment;


    public EMIScreenCalculation(AndroidDriver driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void emiCalculation(double amount, double interest, int year, double processingFee)  {

        amountBtn.sendKeys("" + amount + "");
        interestBtn.sendKeys("" + interest + "");
        yearsBtn.sendKeys("" + year + "");
        processingBtn.sendKeys("" + processingFee + "");
        calculationBtn.click();

        setmEMI(Double.parseDouble((lblResultEMI.getText().replace(",", ""))));
        setTInterest(Double.parseDouble((lblTotalInterest.getText().replace(",", ""))));
        setProFee(Double.parseDouble((lblProcessingFee.getText().replace(",", ""))));
        setTPayment(Double.parseDouble((lblTotalPayment.getText().replace(",", ""))));


    }
}
