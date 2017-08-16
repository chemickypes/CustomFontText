package me.bemind.customfontlibrary;

/**
 * Created by angelomoroni on 16/08/17.
 */

public class FontUtil {

    public enum FontStyle {
        EXTRALIGHT(0), LIGHT(1), REGULAR(2),SEMIBOLD(3),
        BOLD(4) , EXTRABOLD(5), BLACK(6),REGULAR_ITALIC(7),LIGHT_ITALIC(8),BOLD_ITALIC(9),
        EXTRALIGHT_ITALIC(10),SEMIBOLD_ITALIC(11),EXTRABOLD_ITALIC(12),BLACK_ITALIC(13);
        
        int id;
        
        FontStyle(int id){
            this.id = id;
        }

        public static FontStyle fromId(int id) {
            for (FontStyle fontStyle : values()) {
                if(fontStyle.id == id) return fontStyle;
            }

            throw new IllegalArgumentException();
        }
    }
}
