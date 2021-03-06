# Overview
This light-weight library provides images with letter/text like the Gmail app. It extends the Drawable class thus can be used with existing/custom/network ImageView classes

### Import with Gradle:

repositories{
   
   maven {
        url 'http://dl.bintray.com/amulyakhare/maven'
    }

}

dependencies {
  
  
  compile 'com.amulyakhare:com.amulyakhare.textdrawable:1.0.1'

}

####5. Built-in color generator:

```java
ColorGenerator generator = ColorGenerator.MATERIAL;

int color1 = generator.getRandomColor();


int color2 = generator.getColor("user@gmail.com")


TextDrawable.IBuilder builder = TextDrawable.builder()
				.beginConfig()
				.withBorder(4)
				.endConfig()
				.rect();

TextDrawable ic1 = builder.build("A", color1);
TextDrawable ic2 = builder.build("B", color2);
```
#### Screenshot

<p align="center">
  <img src="https://cloud.githubusercontent.com/assets/28509637/25785463/644b347e-339a-11e7-940b-05a353b6597a.png" width="350"/>
</p>
