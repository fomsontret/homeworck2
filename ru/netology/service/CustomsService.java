package ru.netology.service;

public class CustomsService {

    public static final int DUTY_RATE_PER_KG = 100;

    public static int calculateCustoms(int price, int weight) {
        int dutyOnPrice = price / 100;
        int dutyOnWeight = weight * DUTY_RATE_PER_KG;
        int result = dutyOnPrice + dutyOnWeight;
        return result;
    }
}