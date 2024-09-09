package com.example.io;

import com.example.bean.Products;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadProductsData {
    public Products[] readdata(String filename) throws IOException
    {
        Products[] productsData=null;
        File file=new File(filename);
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String line=bufferedReader.readLine();
        int count=0;
        while (line!=null)
        {
            line=bufferedReader.readLine();
            count++;
        }

        productsData=new Products[count-1];
        bufferedReader =new BufferedReader(new FileReader(file));
        line=bufferedReader.readLine();
        int indexofproductsData=0;
        while (line!= null)
        {
            line=bufferedReader.readLine();
            if (line != null) {

            }
        }

    }
}
