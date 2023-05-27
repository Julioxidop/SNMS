package net.pulga22.snms.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerWarningScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiplayerWarningScreen.class)
public class MultiplayerWarningScreenMixin {

    @Inject(method = "initButtons", at = @At("HEAD"), cancellable = true)
    private void cancel(CallbackInfo ci){
        MinecraftClient.getInstance().setScreen(new TitleScreen());
        ci.cancel();
    }

}
