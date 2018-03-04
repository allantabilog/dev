package au.com.redenergy.mirner

import groovy.transform.Canonical
import groovy.transform.ToString

@Canonical
@ToString(includeNames = true)
class SearchRequest {
    Address address
    Mirn mirn
    MeterNumber meterNumber

    static SearchRequest build(Map params){

        Address address1 = new Address(flatOrUnitNumber: params.unitNumber, streetNumber: params.streetNumber, postCode: params.postCode)
        Mirn mirn1 = new Mirn(mirn: params.mirn)
        MeterNumber meterNumber1 = new MeterNumber(meterNumber: params.meterNumber)

        new SearchRequest(address: address1, meterNumber: meterNumber1, mirn: mirn1)

    }


}
