package org.cneko.toneko.common.mod.entities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.cneko.toneko.common.api.NekoQuery;

public interface INeko {

    default NekoQuery.Neko getNeko(){
        return NekoQuery.getNeko(this.getEntity().getUUID());
    }
    default LivingEntity getEntity(){
        return null;
    }
    default boolean isPlayer(){
        return this.getEntity() instanceof Player;
    }
}
