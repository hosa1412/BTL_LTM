/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Game;
import java.sql.*;
import connection.DatabaseConnection;
/**
 *
 * @author PC
 */
public class GameController {
    public void saveGame(Game game){
        try{
            String query = "insert into game values (?, ?, ?, ?, ?)";
            PreparedStatement ps = new DatabaseConnection().getConnection().prepareStatement(query);
            ps.setString(1, game.getPlayer1());
            ps.setString(2, game.getPlayer2());
            ps.setString(3, game.getResult());
            ps.setString(4, game.getDate());
            ps.setString(5, game.getNote());
            ps.executeQuery();
        } catch (Exception ex){

        }
    }
}
