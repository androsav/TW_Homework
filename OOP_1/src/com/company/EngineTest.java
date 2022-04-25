package com.company;
import org.junit.jupiter.api.Test;


class EngineTest {

    @Test
     void bigGas() {
        // Arrange
        Engine testEngine = new Engine("400 hp","8 liters", 12000 );
        // Act
        testEngine.Gas(120000);
        // Assert
    }

    @Test
    void zeroGas() {
        // Arrange
        Engine testEngine = new Engine("400 hp","8 liters", 12000 );
        // Act
        testEngine.Gas(0);
        // Assert
    }
}