package com.infoshare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Przedzialy {



    public void przedzialy(){
        int iloscliczb, iloscprzedzialow, zakres, a, liczba;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilość liczb: ");
        iloscliczb = sc.nextInt();
        System.out.println("Podaj ilość przedziałów");
        iloscprzedzialow = sc.nextInt();
        System.out.println("Podaj zakres liczb");
        zakres = sc.nextInt();
        liczba = 3;
        a = zakres / iloscprzedzialow;
        System.out.println(a);
        List<Integer> ranges = new ArrayList<>();
    }
}
/*
ćwiczenie 2 (przedziały)
-  pobierz z klawiatury 3 parametry, ilość liczb (x), ilość przedziałów (y), zakres liczb (z)
- stwórz y równych przedziałów dla zakresu z
   np.  zakres z = 100, przedziały y = 5  ->  czyli tworzymy 5 przedziałów (np. list)  0-20, 21-40, 41-60, 61-80, 81-100
-  wygeneruj losowo x liczb z zakresu 0 - z i przypisz ją do odpowiedniego przedziału (pojemnika)
  np. wylosowana liczba 25 -> wpada do pojemnika 2 (przedział 21-40)
- wyświetl ilość liczb w każdym przedziale
*/