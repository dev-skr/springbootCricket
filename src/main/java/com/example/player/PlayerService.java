/*
 
* You can use the following import statements
 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 
 */

package com.example.player;

import com.example.player.Player;
import com.example.player.PlayerRepository;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.HashMap;
import com.example.player.Player;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
// Don't modify the below code

public class PlayerService implements PlayerRepository {

    private static HashMap<Integer, Player> team = new HashMap<>();

    public PlayerService() {
        team.put(1, new Player(1, "Alexander", 5, "All-rounder"));
        team.put(2, new Player(2, "Benjamin", 3, "All-rounder"));
        team.put(3, new Player(3, "Michael", 18, "Batsman"));
        team.put(4, new Player(4, "William", 45, "Batsman"));
        team.put(5, new Player(5, "Joshua", 19, "Batsman"));
        team.put(6, new Player(6, "Daniel", 10, "Bowler"));
        team.put(7, new Player(7, "Matthew", 34, "Bowler"));
        team.put(8, new Player(8, "Samuel", 17, "Batsman"));
        team.put(9, new Player(9, "John", 1, "Bowler"));
        team.put(10, new Player(10, "Earnest", 2, "All-rounder"));
        team.put(11, new Player(11, "Bob", 25, "Batsman"));
    }

    // Don't modify the above code

    // Write your code here
  int lastId = team.size();
   @Override
   public ArrayList<Player> getPlayers(){
    ArrayList<Player> list=new ArrayList<>(team.values());
    return list;
   }

@Override
    public Player postPlayer(Player player){
       //System.out.println(player.getName());
       //System.out.println(player.getId());
    
     lastId+=1;
     player.setId(lastId);
     //String tempName=player.getName();
     //player.setName(tempName);
    team.put(lastId,player);
    //System.out.println(player.getName());
     return player;
    }

    @Override
    public Player getPlayer(int id){
        Player player = team.get(id);
        if(player==null)
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        else
        return player;
    }

    @Override
    public Player updatePlayer(int id,Player player){
        Player existingPlayer=team.get(id);
 //System.out.println(player.getName());
 
        if(existingPlayer==null)
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

      if(existingPlayer.getName() != null)
      existingPlayer.setName(player.getName());

      if(existingPlayer.getJerseyNumber() != 0)
      existingPlayer.setJerseyNumber(player.getJerseyNumber());

      if(existingPlayer.getRole() != null)
      existingPlayer.setRole(player.getRole());
     
    

      return existingPlayer;
      
    }

    public void deletePlayer(int id){
        Player player = team.get(id);
        if(player==null)
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        else{
        team.remove(id);
        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }
}
