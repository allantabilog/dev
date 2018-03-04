package au.com.redenergy.mirner

import groovy.transform.Canonical
import groovy.transform.ToString

@Canonical
@ToString(includeNames = true, includePackage = false)
class Address {
    String flatOrUnitNumber
    String streetNumber
    String suburb
    String postCode
}
