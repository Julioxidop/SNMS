package net.pulga22.snms.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {

    @Inject(method = "onMultiplayerButtonPressed", at = @At("HEAD"), cancellable = true)
    private void cancel(ButtonWidget button, CallbackInfo ci){
        ci.cancel();
    }

}
