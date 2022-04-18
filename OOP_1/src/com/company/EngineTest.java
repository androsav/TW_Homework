package com.company;

import org.testng.annotations.Test;

class EngineTest {
    Engine testEngine = new Engine("400 hp","8 liters", 12000 );
    @Test
    void bigGas() {
        testEngine.Gas(120000);
    }

    @Test
    void zeroGas() {
        testEngine.Gas(0);
    }
}