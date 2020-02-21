package com.program.app;

public class ReceiptPrinter {
    public static void main(String[] args) {
        String[][] items = { { "Pizza", "12.99" }, { "Soda ", "1.25" }, { "Cookies", "2.50" } };
        StringBuffer sb = new StringBuffer();
        Float subTotal = 0.0f;
        String line = "\n----------------------\n";
        sb.append("Bill");
        sb.append(line);
        for (String[] item : items) {
            Float price = Float.parseFloat(item[1]);
            subTotal = subTotal + price;
            sb.append(item[0] + "\t\t" + String.format("$%5.2f", price) + "\n");
        }
        Float tax = subTotal * 0.10f;
        Float service = subTotal * 0.15f;
        sb.append("SubTotal:\t" + String.format("$%5.2f", subTotal));
        sb.append("\nTax(10%):\t" + String.format("$%5.2f", tax));
        sb.append("\nService(15%):\t" + String.format("$%5.2f", service));
        sb.append(line);
        sb.append("Total: \t\t" + String.format("$%5.2f", subTotal + tax + service));
        System.out.println(sb);
    }
}
