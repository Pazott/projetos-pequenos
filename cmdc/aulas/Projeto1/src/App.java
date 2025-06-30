import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        String product1, product2;
        int age, code;
        double price1, price2, measure;

        age = 30;
        code = 5290;
        char gender = 'F';

        price1 = 2100.0;
        price2 = 650.50;
        measure = 53.234567;
        
        product1 = "Computer";
        product2 = "Office Desk";

        System.out.printf("Products: \n%s, which price is R$ %.2f \n%s, which price is R$ %.2f \n\nRecord: %d years old, code %d and gender: %c \n\nMeasue with eight decimal places: %.8f \nRounded (three decimal places): %.3f%n", product1, price1, product2, price2, age, code, gender, measure, measure);
    
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);



    }
}