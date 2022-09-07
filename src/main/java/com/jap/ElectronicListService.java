package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = null;
        itemList = new ArrayList<>();
        ListIterator<String> iterator = (ListIterator<String>) itemList.iterator();

        while (iterator.hasNext()) {
            String currentItem = iterator.next();
            itemList.add(currentItem);
        }

        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        Iterator<String> stringIterator = itemList.iterator();
        while (stringIterator.hasNext()) {
            String item = stringIterator.next();
            if (item.equals(searchItem)) {
                return 1;

            }
        }


        return -1;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        boolean flag = false;

        Iterator<String> stringIterator = itemList.iterator();
        while (stringIterator.hasNext()) {
            String item = stringIterator.next();
            stringIterator.remove();
            flag = true;
        }


        return flag;
    }


}
