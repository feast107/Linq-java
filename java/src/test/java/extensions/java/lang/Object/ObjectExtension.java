package extensions.java.lang.Object;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Self;
import manifold.ext.rt.api.This;

import javax.swing.*;

@Extension
public final class ObjectExtension {
    public static @Self Object Print(@This Object o, Action then){
        then.accept(null);
        return o;
    }
}
