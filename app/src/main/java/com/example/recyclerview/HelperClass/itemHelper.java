package com.example.recyclerview.HelperClass;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class itemHelper {

    int image;
    String title;
    String quantity;
    String Price;
//    GradientDrawable color;

    public itemHelper(int image, String title, String quantity, String price) {
        this.image = image;
        this.title = title;
        this.quantity = quantity;
        this.Price = price;

    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return Price;
    }

//    public GradientDrawable getColor() {
//        return color;
//    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }


//    public Drawable getgradient() {
//        return color;
//    }


}

