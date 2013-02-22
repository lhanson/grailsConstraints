package grailsblankconstraints.mvc

import org.codehaus.groovy.grails.validation.Validateable
import grailsblankconstraints.SampleDomain

@Validateable
class SampleCommand {
    String name
}

