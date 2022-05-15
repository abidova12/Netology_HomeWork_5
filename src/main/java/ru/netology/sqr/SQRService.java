package ru.netology.sqr;

public class SQRService {

    public int numerical(int start, int finish) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start) {
                if (i * i <= finish) {
                    count++;
                }
            }
        }
        return count;
    }
}