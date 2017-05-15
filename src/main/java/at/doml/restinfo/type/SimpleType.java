package at.doml.restinfo.type;

import at.doml.restinfo.TypeWriter;

public enum SimpleType implements WritableType {
    
    BYTE,
    SHORT,
    INT,
    LONG,
    BIGINT,
    FLOAT,
    DOUBLE,
    DECIMAL,
    CHAR,
    STRING,
    BOOLEAN,
    OBJECT,
    VOID,
    BOXED_BYTE,
    BOXED_SHORT,
    BOXED_INT,
    BOXED_LONG,
    BOXED_FLOAT,
    BOXED_DOUBLE,
    BOXED_CHAR,
    BOXED_BOOLEAN,
    BOXED_VOID;
    
    @Override
    public void write(TypeWriter writer) {
        writer.writeSimple(this);
    }
}