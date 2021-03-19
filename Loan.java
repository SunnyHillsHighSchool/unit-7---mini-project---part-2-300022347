//Programmers: Kyle Kim


import java.util.ArrayList;

public class Loan
{


  //instance variables (Lab Description)--------------------------------------
  //instance variables (Lab Description)--------------------------------------


  private int ID;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;


  //constructor--------------------------------------------------------------
  //constructor--------------------------------------------------------------


  public Loan(int ID, double loanAmount, String country,int daysToFund, int numLenders)
  {
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }


  //accessor methods---------------------------------------------------------
  //accessor methods---------------------------------------------------------


  public int getID()
  {
    return ID;
  }

  public double getLoanAmount()
  {
    return loanAmount;
  }

  public String getCountry()
  {
    return country;
  }

  public int getDaysToFund()
  {
    return daysToFund;
  }

  public int getNumLenders()
  {
    return numLenders;
  }
  

  //modifier methods------------------------------------------------------
  //modifier methods------------------------------------------------------


  public void setID(int initID)
  {
    ID=initID;
  }

  public void setLoanAmount(double initLoanAmount)
  {
    loanAmount=initLoanAmount;
  }

  public void setCountry(String initCountry)
  {
    country=initCountry;
  }

  public void setDaysToFund(int initDaysToFund)
  {
    daysToFund=initDaysToFund;
  }

  public void setNumLenders(int initNumLenders)
  {
    numLenders=initNumLenders;
  }


  //toString----------------------------------------------------------------
  //toString----------------------------------------------------------------


  public String toString()
  {
    return (String)("ID: " + ID + " Loan Amount: " + loanAmount + " Country: " + country + " Days left to fund: " + daysToFund + " Number of Lenders: " + numLenders);
  }
}
