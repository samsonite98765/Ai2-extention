package com.extensions.login; 

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

@DesignerComponent(version = 1,
                    category = ComponentCategory.EXTENSION,
                    description = "",
                    nonVisible = true,
                    iconName = "")

@SimpleObject(external = true)

public class Login extends AndroidNonvisibleComponent {
    
    public Login(ComponentContainer container) {
        super(container.$form());
    }
    
    @SimpleFunction(description = "")
public void SetGradientBackground(AndroidViewComponent component, Object orientation, int color1, int color2) {
   
    // To set gradient colors as background, what we are actually going to 
    // do is create a new GradientDrawable object and set it as 
    // the background of the view. With this approach, it'd be possible to 
    // create gradients programmatically without editing any XML resource
    // file which is currently not supported in App Inventor 2.
    
    // Getting the reference to the View of the parameter component using 
    // the getView() method of AndroidNonVisible class.
    View view = component.getView();

    // GradientDrawable is a subclass of Drawable class from Android
    // support library. It is mostly used to create gradients.
    // For more info visit: https://developer.android.com/reference/android/graphics/drawable/GradientDrawable
    GradientDrawable gradientDrawable = new GradientDrawable(
            (GradientDrawable.Orientation) orientation,
            new int[] {color1, color2});

    // Setting the gradientDrawable as the background of view.
    view.setBackground(gradientDrawable);
}
}
