package grailsblankconstraints

import grails.test.mixin.*
import org.junit.*

@TestFor(SampleDomain)
class SampleDomainTests {
    SampleDomain domain

    void testNullable() {
        domain = new SampleDomain()
        assertTrue "Should inherit default nullable constraint", domain.validate()
    }

    void testBlankable() {
        domain = new SampleDomain(name: ' ')
        assertFalse "Should inherit default non-blank constraint", domain.validate()
    }
}
