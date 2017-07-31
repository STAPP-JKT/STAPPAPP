package com.example.william.stapp.com.stapp.market;

import java.util.ArrayList;
/**
 * Created by jason on 06/07/2017.
 */

public class SectionDataModel {
    private String headerTitle;
    private ArrayList<SingleItemModel> allItemsInSection;

    public SectionDataModel(){
        this.headerTitle = headerTitle;
        this.allItemsInSection = allItemsInSection;
    }
    public String getHeaderTitle(){
        return headerTitle;
    }
    public void setHeaderTitle(String headerTitle){
        this.headerTitle = headerTitle;
    }

    public ArrayList<SingleItemModel> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(ArrayList<SingleItemModel> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }
}