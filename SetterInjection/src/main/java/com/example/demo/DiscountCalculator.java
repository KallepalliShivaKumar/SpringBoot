package com.example.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {

    private LocalDate currentDate;
    private double price;

    // setters for DI
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateDiscount() {

        DayOfWeek day = currentDate.getDayOfWeek();
        double discount;

        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            discount = price * 0.20; // weekend
        } else {
            discount = price * 0.10; // weekday
        }

        return price - discount;
    }
}
