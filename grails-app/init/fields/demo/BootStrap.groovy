package fields.demo

import grails.util.Environment

class BootStrap {
    InitialDataService initialDataService
    def init = { servletContext ->
        if(Environment.current == Environment.DEVELOPMENT) {
            initialDataService.loadInitialData()
        }
    }
    def destroy = {
    }
}
