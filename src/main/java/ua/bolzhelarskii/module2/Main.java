package ua.bolzhelarskii.module2;

import ua.bolzhelarskii.module2.objects.Invoice;
import ua.bolzhelarskii.module2.services.Methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        Methods.fillListOfInvoice(invoices);
        decorate();
        Methods.getCountOfCategorySell(invoices);
        decorate();
        Methods.getCheapestOfInvoice(invoices);
        decorate();
        Methods.getSumOfOrder(invoices);
        decorate();
        Methods.getRetailOfInvoice(invoices);
        decorate();
        Methods.invoicedOnlySingleTypeOfTechnology(invoices);
        decorate();
        Methods.getFirstOfThreeInvoices(invoices);
        decorate();
        Methods.infoInvoiceForYoungPeople(invoices);
        decorate();
        Methods.sortedInvoiced(invoices);
        decorate();
    }

    private static void decorate() {
        System.out.println("*****************************************************************************************");
    }
}