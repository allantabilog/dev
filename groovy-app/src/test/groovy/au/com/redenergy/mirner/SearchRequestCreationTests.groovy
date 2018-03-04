package au.com.redenergy.mirner

import spock.lang.Specification

class SearchRequestCreationTests extends Specification {

    def "should create new search request from parameter map"() {
        given:
        SearchRequest searchRequest
        def params = [mirn: '12345678', meterNumber: 'M-999', postCode: '3000']
        when:
        searchRequest = SearchRequest.build(params)

        then:
        searchRequest != null
        println searchRequest
    }

    def "should create new search request from builder"() {
        given:
        SearchRequestBuilder builder = new SearchRequestBuilder()

        when:
        SearchRequest searchRequest = builder.mirn(new Mirn(mirn: '123345'))
                .meterNumber(new MeterNumber(meterNumber: 'M-12344'))
                .address(new Address(postCode: '3000'))
                .build()

        then:
        searchRequest != null
        println searchRequest
    }

    def "should create new search request from map using builder"() {
        given:
        SearchRequestBuilder builder = new SearchRequestBuilder()

        when:
        def searchRequest = builder.buildFromMap([mirn: '12345', postcode: '3000'])

        then:
        searchRequest != null
        println searchRequest
    }
}
