/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;
import org.springframework.web.bind.annotation.*;
 import java.util.HashMap;
 import java.util.ArrayList;
 import com.example.player.Player;
 import com.example.player.PlayerService;

 @RestController
 public class PlayerController{
  
PlayerService service=new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> players(){
      return  service.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
      return service.postPlayer(player);
    }

  @GetMapping("/players/{playerId}")
  public Player player(@PathVariable("playerId") int id){
    return service.getPlayer(id);
  }
  
@PutMapping("/players/{playerId}")
public Player changePlayerDetails(@PathVariable("playerId") int id, @RequestBody Player player){
    return  service.updatePlayer(id,player);
}

@DeleteMapping("/players/{playerId}")
public void delete(@PathVariable("playerId") int id){
  service.deletePlayer(id);
}

 }