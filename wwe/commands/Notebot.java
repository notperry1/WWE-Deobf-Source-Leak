package wwe.commands;

import wwe.modules.world.*;
import wwe.utils.*;
import net.minecraft.client.gui.*;
import wwe.*;

public class Notebot extends Command
{
    public Notebot() {
        super("notebot");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        if (array.length <= 0) {
            hSNE.lyvR(this);
        }
        else if (array.length > 0) {
            if (array[0].equalsIgnoreCase("stealer")) {
                if (array.length > 1) {
                    NoteBotStealer.zTtz = array[1];
                    Command.TuzD("Set note bot stealer file name to " + array[1]);
                }
                else {
                    Command.TuzD(this.ZlRY());
                }
            else {
                Command.TuzD("Please use the argument stealer, or dont use one at all");
        }
    }
    
    @Override
    public String UiIp() {
        return "Opens the notebot gui";
    }
    
    @Override
    public String ZlRY() {
        return "notebot, notebot stealer filename";
    }
    
    @oqrr
    public void KnYY(final omqH omqH) {
        Wrapper.mc.displayGuiScreen((GuiScreen)new jCxW());
        hSNE.kduK(this);
    }
}
