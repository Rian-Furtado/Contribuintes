
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int quantity = sc.nextInt();

        System.out.println();

        for (int i = 0; i < quantity; i++) {

            sc.nextLine();

            System.out.println("Digite os dados do " + (i + 1) + "° contribuinte: ");
            System.out.print("Renda anual com salário: ");
            double salary = sc.nextDouble();

            System.out.print("Renda anual com prestação de serviço: ");
            double serviceIncome = sc.nextDouble();

            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();

            System.out.print("Gastos médicos: ");
            double medicalExpense = sc.nextDouble();

            System.out.print("Gastos educaionais: ");
            double educationalExpense = sc.nextDouble();

            list.add(new TaxPayer(salary, serviceIncome, capitalIncome, medicalExpense, educationalExpense));

            System.out.println();


        }

        quantity = 0;

        for (TaxPayer x :
                list) {

            System.out.println();

            System.out.println("RESUMO DO " + (quantity+1) + "° contribuinte: ");
            System.out.printf("Imposto bruto total: %.2f%n" , x.grossTax());
            System.out.printf("Abatimento: %.2f%n" , x.taxRebate());
            System.out.printf("Imposto devido: %.2f%n" , x.netTax());

            System.out.println();

            quantity++;
        }




    }
}