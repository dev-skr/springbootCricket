// Write your code here
package com.example.player;
import java.util.HashMap;
import java.util.ArrayList;
import com.example.player.Player;
public interface PlayerRepository{

   ArrayList<Player> getPlayers();
   
   Player postPlayer(Player player);

   Player getPlayer(int id);

   Player updatePlayer(int id,Player player);

   void deletePlayer(int id);
}