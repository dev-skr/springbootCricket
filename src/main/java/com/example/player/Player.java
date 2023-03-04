// Write your code here.
package com.example.player;

public class Player {
  
     private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    Player(int playerId, String playerName,int jerseyNumber, String role){
        this.playerId=playerId;
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
        this.role=role;
    }

    public void setId(int playerId){
        this.playerId= playerId;
    }

    public int getId(){
        return playerId;
    }
 
    public void setName(String playerName){
        this.playerName=playerName;
    }

    public String getName(){
        return playerName;
    }

   public void setJerseyNumber(int num){
    this.jerseyNumber=num;
   }
  
  public int getJerseyNumber(){
    return jerseyNumber;
  }

  public void setRole(String role){
    this.role=role;
  }

  public String getRole(){
    return role;
  }
}