# CustomFontText
Android text with custom fonts in your application in simple way

![example image custom font android](https://github.com/chemickypes/CustomFontText/blob/develop/custom_font_image_example.png)

# Getting Started

## Add fonts

You have to add your fonts into `assets/` directory.
If you create a subdirectory you'll pay attention to declare it at initialization.

## Initialization
Declare a custom extension of Application class and inside `onCreate()` method define the fonts:
```java
            FontUtil.getInstance()
                .setFont(FontUtil.FontStyle.LIGHT,"Muli-Light.ttf")
                .setFont(FontUtil.FontStyle.REGULAR,"Muli-Regular.ttf")
                .setFont(FontUtil.FontStyle.SEMIBOLD,"Muli-SemiBold.ttf")
                .setFont(FontUtil.FontStyle.BOLD,"Muli-Bold.ttf")
                .setFont(FontUtil.FontStyle.LIGHT_ITALIC,"Muli-LightItalic.ttf")
                .setFont(FontUtil.FontStyle.REGULAR_ITALIC,"Muli-Italic.ttf")
                .setFont(FontUtil.FontStyle.BLACK,"Muli-Black.ttf")
                .setFont(FontUtil.FontStyle.EXTRABOLD,"Muli-ExtraBold.ttf");
```

## Use
You can use TextView with custom font just declaring it on xml file:

```xml
<me.bemind.customfontlibrary.CustomFontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Custom Font"
        ...
        app:fontStyle="regular_italic"/>
```
### Not only TextView
This library let you use EditText and Button too:


```xml
<me.bemind.customfontlibrary.CustomFontEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Custom Light Italic Font"
        android:textSize="20sp"
        app:fontStyle="light_italic"/>
```

```xml
<me.bemind.customfontlibrary.CustomFontButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Custom semibold Button"
        app:fontStyle="semibold" />
```

### Options
Inside xml file you haven't to declare name of the font, but you have to specify the style of it (weight and italic).
The options can be:
 * extralight
 * light
 * regular
 * semibold
 * bold
 * extrabold
 * black

with relative italic style:
 * extralight_italic
 * light_italic
 * regular_italic
 * semibold_italic
 * bold_italic
 * extrabold_italic
 * black_italic
 
EX: 

*Black*
```xml
<me.bemind.customfontlibrary.CustomFontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Custom Font"
        ...
        app:fontStyle="black"/>
```
*Black Italic*
```xml
<me.bemind.customfontlibrary.CustomFontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Custom Font"
        ...
        app:fontStyle="black_italic"/>
```

# TODO
 * TypefaceSpan for SpannableString
 
# License
 ```
   Copyright 2017 Angelo Moroni
   

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
   

       http://www.apache.org/licenses/LICENSE-2.0
       

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 ```
