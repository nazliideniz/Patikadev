public class Employee {

    public static String name="Nazlı Deniz Özen";
    public static double salary=6000;
    public static double workHours=43;
    public static double hireYear=2019;

    public static void main(String[] args) {
    toString(name,  workHours, hireYear, salary);


    }
    public static double tax(double salary) {
        if (salary >= 1000) {
            return (salary* 0.03);
        }
        else {
            return salary*0;
        }

    }

    public static double bonus(double workHours){
        if(workHours>40){
            double bonusUcreti = (workHours-40)*30;
            return bonusUcreti;
        }
        else {
            return 0;
        }
    }
    public static double raiseSalary(double hireYear){
        if((2021-hireYear)<10){
            return 0.05;
        }
        else if((2021-hireYear)<20){
            return 0.10;
        }
        else {
            return 0.15;
        }


    }
    public static void toString(String name, double workHours, double hireYear, double salary){
        System.out.println("isim: " + name);
        System.out.println("çalışma saati: " + workHours);
        System.out.println("başlangıç yılı: " + hireYear);
        System.out.println("vergi: " + tax(salary));
        System.out.println("bonus:" + bonus(workHours));
        double toplamMaas = (salary - tax(salary) + bonus(workHours))*(1+raiseSalary(hireYear));
        System.out.println("maaş artışı,vergi ve bonusla birlikte maaş: " + toplamMaas );


    }
}
