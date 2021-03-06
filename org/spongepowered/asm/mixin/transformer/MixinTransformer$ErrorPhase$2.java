package org.spongepowered.asm.mixin.transformer;

import org.spongepowered.asm.mixin.transformer.throwables.*;
import org.spongepowered.asm.mixin.extensibility.*;

enum MixinTransformer$ErrorPhase$2
{
    MixinTransformer$ErrorPhase$2(final String s, final int n) {
    }
    
    @Override
    IMixinErrorHandler.ErrorAction onError(final IMixinErrorHandler mixinErrorHandler, final String s, final InvalidMixinException ex, final IMixinInfo mixinInfo, final IMixinErrorHandler.ErrorAction errorAction) {
        try {
            return mixinErrorHandler.onApplyError(s, ex, mixinInfo, errorAction);
        }
        catch (AbstractMethodError abstractMethodError) {
            return errorAction;
        }
    }
    
    @Override
    protected String getContext(final IMixinInfo mixinInfo, final String s) {
        return String.format("%s -> %s", mixinInfo, s);
    }
}