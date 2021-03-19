import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }
  
  //-----------------------------------------AVERAGE LOAN-------------------------------
  public double avgLoan() 
  {
    double avg = 0.0;
    for(int i=0; i<data.size(); i++)
    {
      avg += data.get(i).getLoanAmount();
    }
    avg = avg/(data.size());
    return avg;
  }
  //----------------------------------------LARGEST LOAN--------------------------------
  public double largestLoan()
  {
    double largest = data.get(0).getLoanAmount();
    for(int i=0; i<data.size(); i++)
    {
      if((data.get(i).getLoanAmount())>largest)
      {
        largest = data.get(i).getLoanAmount();
      }
    }
    return largest;
  }
  //-----------------------------------------SMALLEST LOAN----------------------------
  public double smallestLoan()
  {
    double smallest = data.get(0).getLoanAmount();
    for(int i=0; i<data.size();i++)
    {
      if((data.get(i).getLoanAmount())<smallest)
      {
        smallest = data.get(i).getLoanAmount();
      }
    }
    return smallest;
  }
  //--------------------------------------------LARGEST LOAN COUNTRY------------------------
  public String largestLoanCountry()
  {
    double largest = data.get(0).getLoanAmount();
    int index = 0;
    for(int i=0; i<data.size(); i++)
    {
      if((data.get(i).getLoanAmount())>largest)
      {
        largest = data.get(i).getLoanAmount(); 
        index = i;
      }
    }
    String largestLoanCountry = data.get(index).getCountry();
    return largestLoanCountry;
  }
  //-----------------------------SMALLEST LOAN COUNTRY---------------------------------------
  public String smallestLoanCountry()
  {
    double smallest = data.get(0).getLoanAmount();
    int index = 0;
    for(int i=0; i<data.size(); i++)
    {
      if((data.get(i).getLoanAmount())<smallest)
      {
        smallest = data.get(i).getLoanAmount();
        index = i;
      }
    }
    String smallestLoanCountry = data.get(index).getCountry();
    return smallestLoanCountry;
  }
  //-----------------------------AVERAGE DAYS TO FUND---------------------------------------
  public double avgDaysToFund() 
  {
    double avgDays = 0.0;
    for(int i=0; i<data.size(); i++)
    {
      avgDays += data.get(i).getDaysToFund();
    }
    avgDays = avgDays/(data.size());
    return avgDays;
  }
  //--------------------------LARGEST LOAN KENYA--------------------------------------------
  public double largestLoanKenya()
  {
    double largest = 0.0;
    for(int i=0; i<data.size(); i++)
    {
      if((data.get(i).getCountry()).equals("Kenya"))
      {
        if((data.get(i).getLoanAmount())>largest)
        {
          largest = data.get(i).getLoanAmount();
        }
      }
    }
    return largest;
  }
  //------------------------AVERAGE LOAN PHILIPPINES-----------------------------------------
  public double avgLoanPhilippines()
  {
    int amountPh = 0;
    double avgLoanPh = 0.0;
    for(int i=0; i<data.size(); i++)
    {
      if((data.get(i).getCountry()).equals("Philippines"))
      {
        avgLoanPh += data.get(i).getLoanAmount();
        amountPh++;
      }
    }
    avgLoanPh = avgLoanPh/amountPh;
    return avgLoanPh;
  }
  //----------------------LONGEST TO FUND COUNTRY-------------------------------------------
  public String longestToFundCountry()
  {
    double largest = data.get(0).getDaysToFund();
    int index = 0;
    for(int i=0; i<data.size(); i++)
    {
      if((data.get(i).getDaysToFund())>largest)
      {
        largest = data.get(i).getDaysToFund();
        index = i;
      } 
    }
    String longestToFundCountry = data.get(index).getCountry();
    return longestToFundCountry;
  }
  //========================VARIANCE====================================================
  public double variance()
  {
    double total = 0.0;
    double average = this.avgLoan();  //this.avgLoan()
    double current = 0.0;
    for(int i=0; i<data.size();i++)
    {
      current = data.get(i).getLoanAmount();
      current = average-current;
      current = current*current;
      total += current;
    }
    total /= data.size();
    return total;
  }
  //=====================STANDARD DEVIATION===============================================
  public double standardDeviation()
  {
    double currentVariance = this.variance();
    double sDev = Math.sqrt(variance());
    return sDev;
  }
  //==================EMPIRICAL RULE=======================================================
  public boolean empiricalRule()
  {
    int count = 0;
    double low = this.avgLoan() - this.standardDeviation();
    double high = this.avgLoan() + this.standardDeviation();
    int num = 0;
    for(int i=0; i<data.size();i++)
    {
      if((data.get(i).getLoanAmount())>low && (data.get(i).getLoanAmount())<high)
      {
        count++;
      }
      num = i;
    }
    return count>=.68*num;
  }



}