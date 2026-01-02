package com.example.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {

    private LocalDate currentdate;
    private double price;

    // Setter for LocalDate
    public void setCurrentdate(LocalDate currentdate) {
        this.currentdate = currentdate;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateDiscount() {

        DayOfWeek day = currentdate.getDayOfWeek();

        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            price = price - (price * 0.20); 
        } else {
            price = price - (price * 0.10); 
        }

        return price;
    }
}
