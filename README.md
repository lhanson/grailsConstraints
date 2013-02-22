= A minimal sample app demonstrating constraint validation =

This example has a sample domain object and an associated command object, both
with a simple String field. The default constraints defined in Config.groovy
are that nullable fields are allowed, but blank fields are not.

== Questions ==

The unit test for SampleDomain verifies that a null field passes validation,
but a blank field does not. I would expect the command object to behave the
same way, since it is marked @Validateable and therefore should be referenced
by [any validateable class](http://grails.org/doc/latest/guide/validation.html#sharingConstraints).

The tests for the domain class pass. The `testNullable` test for the command
object passes, so it is indeed referencing the `nullable: true` global constraint,
but for some reason `testBlankable` fails for the command object. Why?