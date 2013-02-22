= A minimal sample app demonstrating constraint validation =

This example has a sample domain object and an associated command object, both
with a simple String field. The default constraints defined in Config.groovy
are that nullable fields are allowed, but blank fields are not.

== Questions ==

The unit tests for the domain and command objects verify that a null field passes
validation, but the `testBlankable` tests asserting that an object with a blank
field should be invalid do not pass. It appears that setting a `blank: false`
constraint in `grails.gorm.default.constraints` is not enforced by validation.

Why not?
