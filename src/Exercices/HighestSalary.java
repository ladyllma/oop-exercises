package Exercices;

public class HighestSalary {

    private static String[] names = new String[20];
    private static double[] salaries = new double[20];

    public static void main(String[] args) {
        String name = "";
        double salary;
        fillArrays();

        salary = getHighestSalary();

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] == salary) {
                name = names[i];
                break;
            }
        }

        System.out.println(name + " has the highest salary of " + salary);
    }

    private static void fillArrays() {
        names[0] = "Rosalyn Frost";
        names[1] = "Brigitte Kaiser";
        names[2] = "Sherron Fleetwood";
        names[3] = "Cecille Licari";
        names[4] = "Mitzie Boulware";
        names[5] = "Dinorah Boudreau";
        names[6] = "Kathryn Sayer";
        names[7] = "Roman Toomey";
        names[8] = "Kali Sherk";
        names[9] = "Aurelio Buster";
        names[10] = "Elfriede Alcock";
        names[11] = "Stephenie Bleakley";
        names[12] = "Dinorah Boudreau";
        names[13] = "Gianna Neilson";
        names[14] = "Lisette Faver";
        names[15] = "Edie Lout";
        names[16] = "Rubin Steiger";
        names[17] = "Lurlene Kellison";
        names[18] = "Crista Langenfeld";
        names[19] = "Jama Haubrich";

        salaries[0] = 12346.00;
        salaries[1] = 65490.03;
        salaries[2] = 67593.00;
        salaries[3] = 35497.21;
        salaries[4] = 58487.00;
        salaries[5] = 45432.00;
        salaries[6] = 23134.65;
        salaries[7] = 87634.42;
        salaries[8] = 23904.43;
        salaries[9] = 87439.43;
        salaries[10] = 88786.32;
        salaries[11] = 68239.00;
        salaries[12] = 67823.00;
        salaries[13] = 10293.43;
        salaries[14] = 23394.43;
        salaries[15] = 87092.30;
        salaries[16] = 89639.98;
        salaries[17] = 96382.60;
        salaries[18] = 57829.00;
        salaries[19] = 68996.06;
    }

    private static double getHighestSalary() {
        int n = salaries.length;
        double highest = salaries[0];

        for (int i = 1; i < n; i++)
            if (salaries[i] > highest)
                highest = salaries[i];

        return highest;
    }
}
