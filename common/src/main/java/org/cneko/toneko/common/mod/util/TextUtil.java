package org.cneko.toneko.common.mod.util;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

import java.util.Random;

public class TextUtil {
    public static Component translatable(String key, Object... args){
        return Component.translatable(key, args);
    }
    public static Component translatable(String key){
        return Component.translatable(key);
    }
    public static String getPlayerName(Player player){
        String playerName = player.getName().getString();
        playerName = playerName.replace("literal{", "").replace("}", "");
        return playerName;
    }

    public static Component randomTranslatabledComponent(String key,int range, Object... args){
        int num = new Random().nextInt(range);
        return Component.translatable(key+"."+num, args);
    }

//    public static void sendNekoMessage(Player player, NekoQuery.Neko neko, String message){
//        String msg = modify(message, neko);
//        CommonChatEvent.sendMessage(translatable(msg, getPlayerName(player)));
//    }
}
