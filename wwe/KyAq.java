package wwe;

import wwe.modules.world.*;
import wwe.utils.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.client.gui.*;

public class KyAq extends HAxG
{
    Xssq cFha;
    
    public KyAq() {
        super("WayPoints");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 1) {
                HAxG.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("list")) {
                for (final Xssq xssq : WayPoints.COfQ) {
                    HAxG.TuzD(xssq.CkDS + " X:" + xssq.Nehz.getX() + " Y:" + xssq.Nehz.getY() + " Z:" + xssq.Nehz.getZ());
                }
                return;
            }
            if (array.length < 2) {
                HAxG.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("add")) {
                final Iterator<Xssq> iterator2 = WayPoints.COfQ.iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next().CkDS.equalsIgnoreCase(array[1])) {
                        HAxG.TuzD(array[1] + " is already a way point?");
                        return;
                }
                WayPoints.VlSt(new Xssq(array[1], new BlockPos(Wrapper.mc.player.posX, Wrapper.mc.player.posY, Wrapper.mc.player.posZ), EnumDyeColor.RED, true, false, false));
                HAxG.TuzD("Added waypoint " + array[1]);
                Wrapper.ypJK().VLak();
                }
            }
            else if (this.wJNH(array[0])) {
                for (final Xssq xssq2 : WayPoints.COfQ) {
                    if (xssq2.CkDS.equalsIgnoreCase(array[1])) {
                        WayPoints.COfQ.remove(xssq2);
                        HAxG.TuzD("Removed way point " + array[1]);
                        Wrapper.ypJK().VLak();
                        break;
                    else {
                        HAxG.TuzD(array[1] + " isent a way point?");
                        continue;
                }
                }
            }
            else if (array[0].equalsIgnoreCase("edit")) {
                for (final Xssq cFha : WayPoints.COfQ) {
                    if (cFha.CkDS.equalsIgnoreCase(array[1])) {
                        this.cFha = cFha;
                        hSNE.lyvR(this);
                        break;
                    else {
                        continue;
                }
                }
            }
            else {
                HAxG.TuzD(this.ZlRY());
            }
            }
        }
        catch (Exception ex) {
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "Edits WayPoint's";
    }
    
    @Override
    public String ZlRY() {
        return "WayPoint add/remove/edit/list name";
    }
    
    @oqrr
    public void KnYY(final omqH omqH) {
        Wrapper.mc.displayGuiScreen((GuiScreen)new bSlU(this.cFha));
        hSNE.kduK(this);
    }
}
