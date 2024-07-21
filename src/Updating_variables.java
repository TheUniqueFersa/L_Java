public class Updating_variables {
    public static void main(String[] args) {
        int salary = 1000;

        salary += 200;
        System.out.println(salary);

        salary -= 500;
        System.out.println(salary);

        salary = salary + (30*2) - 45;

        String employeeName = "Fersa LM";
        //Concatenar
        employeeName = employeeName + " Fershota";
        employeeName = "TheUnique" + employeeName;
        System.out.println(employeeName);
    }
}
