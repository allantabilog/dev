package au.com.redenergy.mirner

class SearchRequestBuilder {

    Address address
    MeterNumber meterNumber
    Mirn mirn

    SearchRequest build() {
        new SearchRequest(address: this.address, mirn: this.mirn, meterNumber: this.meterNumber)
    }

    SearchRequest buildFromMap(Map params) {
        this.address(new Address(flatOrUnitNumber: params.unitNumber, streetNumber: params.streetNumber, postCode: params.postcode))
                .meterNumber(new MeterNumber(meterNumber: params.meterNumber))
                .mirn(new Mirn(mirn: params.mirn))
                .build()
    }

    SearchRequestBuilder address(Address address1) {
        this.address = address1
        this
    }

    SearchRequestBuilder meterNumber(MeterNumber meterNumber1) {
        this.meterNumber = meterNumber1
        this
    }

    SearchRequestBuilder mirn(Mirn mirn1) {
        this.mirn = mirn1
        this
    }
}
