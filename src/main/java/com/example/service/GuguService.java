package com.example.service;

import org.springframework.stereotype.Service;

/**
 * Created by jiyeon on 2016. 11. 17..
 */
@Service
public class GuguService {
    public void printGugu() {
        System.out.format("%n                      <gugu>%n");
        for(int j=1; j<=9; j++) {
            System.out.println();
            for(int i=2; i<=5; i++) { // 2~ 5
                System.out.format("%d X %d = %2d    ", i, j, i * j);
            }
        }
        System.out.println(); // 줄바꿈
        for(int j=1; j<=9; j++) {
            System.out.println();
            for(int i=6; i<=9; i++) { // 6~ 9
                System.out.format("%d X %d = %2d    ", i, j, i * j);
            }
        }
        System.out.println(); // 줄바꿈
    }

}
