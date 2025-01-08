package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryArterTaxes;
        if(salary<=0){
            System.out.println("wrong input!");
        }
        else if (10000 > salary) {
            salaryArterTaxes = salary * 0.805;
            System.out.println(salaryArterTaxes);
        }
        else if (salary> 10000 & salary <20000){
            salaryArterTaxes = salary * 0.82;
            System.out.println(salaryArterTaxes);
        }
        else if ( salary > 20000){
            salaryArterTaxes = salary * 0.8;
            System.out.println(salaryArterTaxes);
        }
    }
}
