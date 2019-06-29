package com.sda.exercises.sort;

import java.util.List;

public class BubbleSort {

    public List<Integer> sort (List<Integer> unsortedList){
        for (int i =1; i< unsortedList.size(); i++){   //sprawdz od drugiego elementu, zacznie porownywac drugi do pierwszego
            if (unsortedList.get(i-1) > unsortedList.get(i)){   //jesli element poprzedzajacy jest wiekszy
                Integer temp = unsortedList.get(i-1);
                unsortedList.set(i-1, unsortedList.get(i));      //set czyli pobieramy indeks, po czym wskazujemy na jego wartosc metoda get, dla indeksu i zamieniamy wartosc na i-1
                unsortedList.set(i, temp);                      //ustawienie wartosci temp dla i
                i=0;
            }
        }

        return unsortedList;

    }

}
