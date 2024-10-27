/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class Result {
    private Map<String, Integer> mp = new HashMap<>();
    
    public Result(){
        mp.put("src/image/image1.jpg", 13);
        mp.put("src/image/image2.jpg", 13);
        mp.put("src/image/image3.jpg", 5);
        mp.put("src/image/image4.jpg", 9);
        mp.put("src/image/image5.jpg", 12);
        mp.put("src/image/image6.jpg", 8);
        mp.put("src/image/image7.jpg", 8);
        mp.put("src/image/image8.jpg", 7);
    }
    
    public int getResult(String imagePath){
        return mp.get(imagePath);
    }
}
