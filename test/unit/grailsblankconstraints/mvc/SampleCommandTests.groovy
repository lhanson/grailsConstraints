package grailsblankconstraints.mvc

import grails.test.mixin.web.ControllerUnitTestMixin
import org.junit.*

@TestMixin(ControllerUnitTestMixin)
class SampleCommandTests {
    SampleCommand cmd

    void testNullable() {
        cmd = new SampleCommand()
        assertTrue "Should inherit default nullable constraint", cmd.validate()
    }

    void testBlankable() {
        cmd = new SampleCommand(name: '')
        assertFalse "Should inherit default non-blank constraint", cmd.validate()
    }
}
