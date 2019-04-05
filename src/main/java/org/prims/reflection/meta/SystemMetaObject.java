package org.prims.reflection.meta;

import org.prims.reflection.DefaultReflectorFactory;
import org.prims.reflection.object.DefaultObjectFactory;
import org.prims.reflection.object.ObjectFactory;
import org.prims.reflection.wrapper.DefaultObjectWrapperFactory;
import org.prims.reflection.wrapper.ObjectWrapperFactory;

public final class SystemMetaObject {

    public static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    public static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
    public static final MirrorObject NULL_META_OBJECT = MirrorObject.forObject(NullObject.class, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());

    private SystemMetaObject() {
        // Prevent Instantiation of Static Class
    }

    private static class NullObject {
    }

    public static MirrorObject forObject(Object object) {
        return MirrorObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());
    }

}