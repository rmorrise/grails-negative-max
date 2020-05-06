package negative.max

class BootStrap {

    def init = { servletContext ->
        (1..200).each { i ->
            new Sample(sampleNumber: i).save(failOnError: true)
        }
    }
    def destroy = {
    }
}
