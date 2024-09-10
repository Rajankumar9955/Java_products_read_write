package com.example.main;

import com.example.bean.Products;
import com.example.io.ReadProductsData;

import java.io.File;
import java.io.IOException;

public class MyMain {
    public static void main(String[] args) {
        ReadProductsData readProductsData=new ReadProductsData();
        String fileName="resources/products.csv";
        try {
            Products[] products=readProductsData.readdata(fileName);
            for(Products elements:products)
            {

            }
            {

            }


        }catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}