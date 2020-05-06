package negative.max

import grails.core.GrailsApplication
import grails.plugins.*
import grails.rest.RestfulController

class ApplicationController extends RestfulController<Sample> {
    ApplicationController() {
        super(Sample)
    }
}
