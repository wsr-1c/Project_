package com.example.project_;

public class State {
    // класс для создания типа для работы с StateAdapter
    // Новацкий Егор Сергеевич 12.03.2025:9:25
    String nameTovar, nameBrand, price;
    int image;

    public State(String nameTovar, String nameBrand, String price, int image){
        this.nameBrand = nameBrand;
        this.nameTovar = nameTovar;
        this.price = price;
        this.image = image;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
