import java.util.*;
class Scanner1
  {
    public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a basic salary");
          int basicSalary =sc.nextInt();
          int pfFund = (12*basicSalary)/100;
          int hra = (70*basicSalary)/100;
          int allowance = (25*hra)/100;
          System.out.println("The pfFund :- "+pfFund);
          System.out.println("The hra:- "+hra);
          System.out.println("The allowance :- "+allowance);
          int totalCtc = basicSalary + pfFund + hra + allowance;
          System.out.println("The total Ctc Salary :-> "+totalCtc);
      }
  }
