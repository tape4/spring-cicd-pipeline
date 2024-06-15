package cicd.demo.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthCheckTest {

    @Test
    void failTest() {
        Assertions.assertThat(true).isEqualTo(false);
    }

}