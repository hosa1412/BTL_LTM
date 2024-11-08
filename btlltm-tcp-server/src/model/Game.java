/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Game {
    private int id;
    private String player1;
    private String player2;
    private String result;
    private String date;
    private String note;

    public Game(int id, String player1, String player2, String result, String date, String note) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
        this.result = result;
        this.date = date;
        this.note = note;
    }

    public Game(String player1, String player2, String result, String date, String note) {
        this.player1 = player1;
        this.player2 = player2;
        this.result = result;
        this.date = date;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}

