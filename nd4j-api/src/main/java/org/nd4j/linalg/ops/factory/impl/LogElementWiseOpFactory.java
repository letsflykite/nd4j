package org.nd4j.linalg.ops.factory.impl;

import org.nd4j.linalg.ops.ElementWiseOp;
import org.nd4j.linalg.ops.transforms.Log;

/**
 * Created by agibsonccc on 12/11/14.
 */
public class LogElementWiseOpFactory extends BaseElementWiseOpFactory {
    private static ElementWiseOp INSTANCE = new Log();
    @Override
    public ElementWiseOp create() {
        return INSTANCE;
    }
}
