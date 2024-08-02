package io.github.brandonkys.noskingui.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(InventoryScreen.class)
public class MixinInventoryScreen {

    @Redirect(method = "drawBackground", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/ingame/InventoryScreen;drawEntity(Lnet/minecraft/client/gui/DrawContext;IIIIIFFFLnet/minecraft/entity/LivingEntity;)V"))
    public void drawBackground(DrawContext context, int x1, int y1, int x2, int y2, int size, float f, float mouseX, float mouseY, LivingEntity entity) {
    }
}
