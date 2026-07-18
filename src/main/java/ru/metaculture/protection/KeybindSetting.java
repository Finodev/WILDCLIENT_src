package ru.metaculture.protection;

import java.util.function.Supplier;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeybindSetting extends Setting {
   public int O00000000000;
   public String O000000000000;
   public boolean O0000000000000;
   public boolean O000000000000O;
   private final int O00000000000O;
   private final boolean O00000000000O0;

   public KeybindSetting(String string, int i, boolean bl) {
      this.O00000000 = string;
      this.O00000000000 = i;
      this.O0000000000000 = bl;
      this.O00000000000O = i;
      this.O00000000000O0 = bl;
   }

   public KeybindSetting(String string, int i) {
      this(string, i, false);
   }

   public int O0000000000() {
      return this.O00000000000;
   }

   public void O00000000(int i) {
      this.O00000000000 = i;
   }

   public KeybindSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      this.O00000000000 = this.O00000000000O;
      this.O0000000000000 = this.O00000000000O0;
      this.O000000000000O = false;
   }

   public static boolean O000000000(int i) {
      if (MinecraftAccessor.a_.currentScreen != null) {
         return false;
      } else {
         long var1 = MinecraftAccessor.a_.getWindow().getHandle();
         if (i >= 0) {
            return InputUtil.isKeyPressed(var1, i);
         } else if (i <= -100) {
            int var3 = -i - 100;
            return GLFW.glfwGetMouseButton(var1, var3) == 1;
         } else {
            return false;
         }
      }
   }
}
