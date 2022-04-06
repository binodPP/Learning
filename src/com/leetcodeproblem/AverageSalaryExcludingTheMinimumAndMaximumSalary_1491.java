package com.leetcodeproblem;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary_1491 {
    public static void main(String[] args) {
     int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      double sum=0;

      for(int i=0;i<salary.length; i++){
          min=Math.min(min,salary[i]);
          max=Math.max(max,salary[i]);
      }

      for(int j=0; j<salary.length; j++){
          if(salary[j] != max && salary[j] != min) {
              sum = sum + salary[j];
          }
      }

      return sum/(salary.length-2);
    }
}
