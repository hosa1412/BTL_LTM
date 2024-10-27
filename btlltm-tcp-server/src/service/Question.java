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
public class Question {
    private Map<String, String> mp = new HashMap<>();
    
    public Question(){
        mp.put("src/image/image1.jpg", "Có bao nhiêu quả cam");
        mp.put("src/image/image2.jpg", "Có bao nhiêu cá hề");
        mp.put("src/image/image3.jpg", "Có bao nhiêu cá nóc");
        mp.put("src/image/image4.jpg", "Có bao nhiêu con sứa");        
        mp.put("src/image/image5.jpg", "Có bao nhiêu hình tam giác");        
        mp.put("src/image/image6.jpg", "Có bao nhiêu quả cà chua");        
        mp.put("src/image/image7.jpg", "Có bao nhiêu quả cà tím");        
        mp.put("src/image/image8.jpg", "Có bao nhiêu bắp cải");
    }
    
    public String getQuestion(String imagePath){
        return mp.get(imagePath);
    }
}
