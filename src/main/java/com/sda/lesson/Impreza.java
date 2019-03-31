package com.sda.lesson;

import java.util.Arrays;
import java.util.Random;

public class Impreza {
    private BeerTypes[] availableBeers;

    public Impreza() {
        availableBeers = new BeerTypes[2];
        availableBeers[0] = pickRandomBeerType();
        availableBeers[1] = pickRandomBeerType();
    }

    public void showBeerAndColour() {
        Arrays.asList(availableBeers).forEach(beerType -> {
            switch (beerType){
                case LAGER:
                    System.out.println("Lager (jasny)");
                    break;
                case MIODOWE:
                    System.out.println("Miodowe (jasne)");
                    break;
                case PILZNER:
                    System.out.println("Pilzner (jasny)");
                    break;
                case PORTER:
                    System.out.println("Porter (ciemny)");
                    break;
                case STOUT:
                    System.out.println("Stout (ciemny)");
                    break;
            }
        });
    }

    private BeerTypes pickRandomBeerType() {
        Random random = new Random();
        int randomEnumIndex = random.nextInt(BeerTypes.values().length-1);
        return BeerTypes.values()[randomEnumIndex];
    }
}
