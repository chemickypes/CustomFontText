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

    private static FontUtil INSTANCE = new FontUtil();

    private String EXTRALIGHT = null;
    private String LIGHT = null;
    private String REGULAR = null;
    private String SEMIBOLD = null;
    private String BOLD = null;
    private String EXTRABOLD = null;
    private String BLACK = null;
    private String REGULAR_ITALIC= null;
    private String LIGHT_ITALIC = null;
    private String BOLD_ITALIC = null;
    private String EXTRALIGHT_ITALIC = null;
    private String SEMIBOLD_ITALIC = null;
    private String EXTRABOLD_ITALIC = null;
    private String BLACK_ITALIC = null;

    private FontUtil(){}

    public static FontUtil getInstance(){
        return INSTANCE;
    }

    public FontUtil setFont(String[] fonts){
        for (int i = 0; i < fonts.length; i++) {
            if(i == 0){
                EXTRALIGHT = fonts[i];
            }else if (i == 1){
                LIGHT = fonts[i];
            }else if (i == 2){
                REGULAR = fonts[i];
            }else if (i == 3){
                SEMIBOLD = fonts[i];
            }else if (i == 4){
                BOLD = fonts[i];
            }else if (i == 5){
                EXTRABOLD= fonts[i];
            }else if (i == 6){
                BLACK = fonts[i];
            }else if (i == 7){
                REGULAR_ITALIC = fonts[i];
            }else if (i == 8){
                LIGHT_ITALIC = fonts[i];
            }else if (i == 9){
                BOLD_ITALIC = fonts[i];
            }else if (i == 10){
                EXTRABOLD_ITALIC = fonts[i];
            }else if (i == 11){
                SEMIBOLD_ITALIC = fonts[i];
            }else if (i == 12){
                EXTRABOLD_ITALIC = fonts[i];
            }else if (i == 13){
                BLACK_ITALIC = fonts[i];
            }
        }
        return this;
    }


    /**
     * return the correct font or if it's null, the closest font
     * @param fontStyle
     * @return
     */
    public String getFont(FontStyle fontStyle){
        switch (fontStyle){
            case EXTRALIGHT: return getClosestFont(EXTRALIGHT);
            case LIGHT: return getClosestFont(LIGHT,EXTRALIGHT);
            case REGULAR: return getClosestFont(REGULAR);
            case SEMIBOLD: return getClosestFont(SEMIBOLD,REGULAR);
            case BOLD: return getClosestFont(BOLD,SEMIBOLD,REGULAR);
            case EXTRABOLD: return getClosestFont(EXTRABOLD,BOLD,SEMIBOLD,REGULAR);
            case BLACK: return getClosestFont(BLACK,EXTRABOLD,BOLD,SEMIBOLD,REGULAR);
            case LIGHT_ITALIC: return getClosestFont(LIGHT_ITALIC,EXTRALIGHT_ITALIC);
            case REGULAR_ITALIC: return getClosestFont(REGULAR_ITALIC);
            case BOLD_ITALIC: return getClosestFont(BOLD_ITALIC,SEMIBOLD_ITALIC,REGULAR_ITALIC);
            case EXTRALIGHT_ITALIC: return EXTRALIGHT_ITALIC;
            case SEMIBOLD_ITALIC: return getClosestFont(SEMIBOLD_ITALIC,REGULAR_ITALIC);
            case EXTRABOLD_ITALIC: return getClosestFont(EXTRABOLD_ITALIC,BOLD_ITALIC,SEMIBOLD_ITALIC,REGULAR_ITALIC);
            case BLACK_ITALIC: return getClosestFont(BLACK_ITALIC,EXTRABOLD_ITALIC,BOLD_ITALIC,SEMIBOLD_ITALIC,REGULAR_ITALIC);
        }

        throw new IllegalArgumentException();
    }

    public String getFont(int fontStyleId){
        return getFont(FontStyle.fromId(fontStyleId));
    }

    public FontUtil setFont(FontStyle fontType,String font){
        switch (fontType){
            case EXTRALIGHT: {
                EXTRALIGHT = font;
                break;
            }
            case LIGHT: {
                LIGHT = font;
                break;
            }
            case REGULAR: {
                REGULAR = font;
                break;
            }
            case SEMIBOLD: {
                SEMIBOLD = font;
                break;
            }
            case BOLD: {
                BOLD = font;
                break;
            }
            case EXTRABOLD: {
                EXTRABOLD = font;
                break;
            }
            case BLACK: {
                BLACK = font;
                break;
            }
            case REGULAR_ITALIC: {
                REGULAR_ITALIC = font;
                break;
            }
            case LIGHT_ITALIC: {
                LIGHT_ITALIC = font;
                break;
            }
            case BOLD_ITALIC: {
                BOLD_ITALIC = font;
                break;
            }
            case EXTRALIGHT_ITALIC: {
                EXTRALIGHT_ITALIC = font;
                break;
            }
            case SEMIBOLD_ITALIC: {
                SEMIBOLD_ITALIC = font;
                break;
            }
            case EXTRABOLD_ITALIC: {
                EXTRABOLD_ITALIC = font;
                break;
            }
            case BLACK_ITALIC: {
                BLACK_ITALIC = font;
                break;
            }
            default:
                throw new IllegalArgumentException();
        }

        return this;

    }

    private String getClosestFont(String... fonts){

        String font ;

        int i = 0;
        do {
            font = fonts[i++];
        }while (font == null && i < fonts.length);

        return font;
    }

}
