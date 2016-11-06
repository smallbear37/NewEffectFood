package smallbear;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerEatFoodEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.food.Food;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.potion.Effect;
import me.onebone.economyapi.EconomyAPI;

public class NEFood extends PluginBase implements Listener {
	
	@Override
		public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
			String cmd = command.getName();
			Player player = this.getServer().getPlayer(sender.getName());
		
		if(cmd.equals("크리스마스쿠키구매")){
			if(args.length < 1){
				sender.sendMessage("[크리스마스]쿠키를 구매하셨습니다.(12개)(1200원)");
				player.getInventory().addItem(new Item(357,0,12).setCustomName("§f[크리스마스]쿠키"));
				EconomyAPI.getInstance().reduceMoney(player, 1000);
			}
		}
		if(cmd.equals("크리곰국구매")){
			if(args.length < 1){
				sender.sendMessage("[크리스마스]곰국을 구매하셨습니다.(3개)(1200원)");
				player.getInventory().addItem(new Item(282,0,3).setCustomName("§f[크리스마스]곰국"));
				EconomyAPI.getInstance().reduceMoney(player, 1000);
			}
		}
		if(cmd.equals("크리라면구매")){
			if(args.length < 1){
				sender.sendMessage("[크리스마스]라면을 구매하셨습니다.(3개)(1200원)");
				player.getInventory().addItem(new Item(459,0,3).setCustomName("§f[크리스마스]라면"));
				EconomyAPI.getInstance().reduceMoney(player, 1000);
			}
		}
		if(cmd.equals("크리호박파이구매")){
			if(args.length < 1){
				sender.sendMessage("[크리스마스]호박파이를 구매하셨습니다.(3개)(1200원)");
				player.getInventory().addItem(new Item(400,0,3).setCustomName("§f[크리스마스]호박파이"));
				EconomyAPI.getInstance().reduceMoney(player, 1000);
			}
		}
		if(cmd.equals("크리음식셋구매")){
			if(args.length < 1){
				sender.sendMessage("[크리스마스]음식셋을 구매하셨습니다.(라면,곰국,쿠키,호박파이)(4500원)");
				player.getInventory().addItem(new Item(364,0,1).setCustomName("§f[크리스마스]스테이크(서비스)"));
				player.getInventory().addItem(new Item(459,0,3).setCustomName("§f[크리스마스]라면"));
				player.getInventory().addItem(new Item(282,0,3).setCustomName("§f[크리스마스]곰국"));
				player.getInventory().addItem(new Item(357,0,12).setCustomName("§f[크리스마스]쿠키"));
				player.getInventory().addItem(new Item(400,0,3).setCustomName("§f[크리스마스]호박파이"));
				EconomyAPI.getInstance().reduceMoney(player, 4000);
			}
		}
		return true;
	}
			public void onLoad() {
				this.getLogger().info("§a특수음식 플러그인 로딩중!");
		}
			public void onEnable() {
				this.getLogger().info("§a특수음식 플러그인 로딩완료!");
		}
		
		@EventHandler
			public void getPlayer(PlayerEatFoodEvent event,Food food){
				food = Food.cookie;{
					event.getPlayer().getEffect(6).setDuration(20+1).setAmplifier(1);	
			}
				food=Food.beetroot_soup;{
					event.getPlayer().getEffect(5).setDuration(20+1).setAmplifier(1);	
			}
				food=Food.mushroom_stew;{
					event.getPlayer().getEffect(1).setDuration(20+1).setAmplifier(1);	
			}
				food=Food.pumpkin_pie;{
					event.getPlayer().getEffect(8).setDuration(20+1).setAmplifier(1);	
			}
				
	}
		
}
