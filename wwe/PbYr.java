package wwe;

import wwe.utils.*;
import net.minecraft.client.gui.*;

public class PbYr extends HAxG
{
    public PbYr() {
        super("customfont");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            hSNE.lyvR(this);
        }
        catch (Exception ex) {
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "Opens the custom font picker gui";
    }
    
    @Override
    public String ZlRY() {
        return "customfont";
    }
    
    @oqrr
    public void KnYY(final omqH omqH) {
        Wrapper.mc.displayGuiScreen((GuiScreen)new BxVd());
        hSNE.kduK(this);
    }
}
