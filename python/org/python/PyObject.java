package org.python;

import java.lang.reflect.Type;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;

public class PyObject {
    public static Hashtable<String, PyObject> globals;

    // public static Hashtable<String, PyObject> locals;

    public Type type;
    public Object value;

    static {
        globals = new Hashtable<String, PyObject>();
        // locals = new Hashtable<String, PyObject>();
    }

    /**
     * Copy Constructor
     */
    public PyObject(Object v, Type t) {
        value = v;
        type = t;
    }

    public PyObject() {
        type = Object.class;
        value = new Hashtable<String, PyObject>();
    }

    public PyObject(byte v) {
        type = Long.class;
        value = (long)v;
    }

    public PyObject(short v) {
        type = Long.class;
        value = (long)v;
    }

    public PyObject(int v) {
        type = Long.class;
        value = (long)v;
    }

    public PyObject(long v) {
        type = Long.class;
        value = v;
    }

    public PyObject(float v) {
        type = Float.class;
        value = (double)v;
    }

    public PyObject(double v) {
        type = Float.class;
        value = v;
    }

    public PyObject(char v) {
        type = String.class;
        value = Character.toString(v);
    }

    public PyObject(String v) {
        type = String.class;
        value = v;
    }

    public PyObject(Map v) {
        type = Map.class;
        value = v;
    }

    public PyObject(Set v) {
        type = Set.class;
        value = v;
    }

    public PyObject(ArrayList v) {
        type = ArrayList.class;
        value = v;
    }

    /**
     * Proxy Java object methods onto their Python counterparts.
     */

    public boolean equals(PyObject other) {
        return __equals__(other);
    }

    public int compareTo(PyObject other) {
        if (__lt__(other)) {
            return -1;
        } else if (__gt__(other)) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return __str__();
    }

    /**
     * Python interface compatibility
     */

    public void __setattr__(String attr, PyObject v) {
        // value.put(attr, v);
    }

    public PyObject __getattr__(String attr) {
        // return value.get(attr);
        return null;
    }

    public String __repr__() {
        return "<PyObject: " + this.type + ">";
    }

    public String __str__() {
        if (type == String.class) {
            return (String) value;
        }
        else if (type == Long.class) {
            return ((Long) value).toString();
        }
        return this.__repr__();
    }

    public boolean __equals__(PyObject other) {
        return false;
    }

    public boolean __hash__(PyObject other) {
        return false;
    }

    public boolean __lt__(PyObject other) {
        return false;
    }

    public boolean __lte__(PyObject other) {
        return false;
    }

    public boolean __gt__(PyObject other) {
        return false;
    }

    public boolean __gte__(PyObject other) {
        return false;
    }

    public PyObject __add__(PyObject other) {
        if (this.type == String.class) {
            if (other.type == String.class) {
                return new PyObject(((String) this.value) + ((String) other.value));
            } else if (other.type == Long.class) {
            } else if (other.type == Float.class) {
            } else if (other.type == Map.class) {
            } else if (other.type == Set.class) {
            } else if (other.type == Object.class) {
            } else if (other.type == ArrayList.class) {
            }
        } else if (this.type == Long.class) {
        } else if (this.type == Float.class) {
        } else if (this.type == Map.class) {
        } else if (this.type == Set.class) {
        } else if (this.type == Object.class) {
        } else if (this.type == ArrayList.class) {
        }
        return null;
    }

    public PyObject __sub__(PyObject other) {
        return null;
    }

    public PyObject __mul__(PyObject other) {
        return new PyObject(((Long) this.value) * ((Long) other.value));
    }

    public PyObject __floordiv__(PyObject other) {
        return null;
    }

    public PyObject __truediv__(PyObject other) {
        return null;
    }

    public PyObject __div__(PyObject other) {
        return null;
    }

    public PyObject __mod__(PyObject other) {
        return null;
    }

    public PyObject __pow__(PyObject other) {
        return null;
    }

    public PyObject __lshift__(PyObject other) {
        return null;
    }

    public PyObject __rshift__(PyObject other) {
        return null;
    }

    public PyObject __and__(PyObject other) {
        return null;
    }

    public PyObject __xor__(PyObject other) {
        return null;
    }

    public PyObject __or__(PyObject other) {
        return null;
    }

    public void __iadd__(PyObject other) {
        this.value = this.__add__(other).value;
    }

    public void __isubtract__(PyObject other) {
        this.value = this.__sub__(other).value;
    }

    public void __imultiply__(PyObject other) {
        this.value = this.__mul__(other).value;
    }

    public void __ifloordiv__(PyObject other) {
        this.value = this.__floordiv__(other).value;
    }

    public void __itruediv__(PyObject other) {
        this.value = this.__truediv__(other).value;
    }

    public void __idiv__(PyObject other) {
        this.value = this.__div__(other).value;
    }

    public void __imod__(PyObject other) {
        this.value = this.__mod__(other).value;
    }

    public void __ipow__(PyObject other) {
        this.value = this.__pow__(other).value;
    }

    public void __ilshift__(PyObject other) {
        this.value = this.__lshift__(other).value;
    }

    public void __irshift__(PyObject other) {
        this.value = this.__rshift__(other).value;
    }

    public void __iand__(PyObject other) {
        this.value = this.__and__(other).value;
    }

    public void __ixor__(PyObject other) {
        this.value = this.__xor__(other).value;
    }

    public void __ior__(PyObject other) {
        this.value = this.__or__(other).value;
    }

    public void __setitem__(PyObject k, PyObject v) {
    }

    public PyObject __getitem__(PyObject k) {
        return null;
    }

    public void delete_subscr(PyObject k) {
    }

}