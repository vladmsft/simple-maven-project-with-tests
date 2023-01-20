package test;

import static org.junit.Assert.*;
import org.junit.internal.AssumptionViolatedException;

class Base {

    protected void run() {
        double r = Math.random();
        if (r < 0.1) {
            fail("Oops test failed");
        } else if (r < 0.2) {
            throw new AssumptionViolatedException("Skipping test");
        }
    }

}
