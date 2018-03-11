package fields.demo

class OnlineConferenceDataService implements ConferenceDataService {
    @Override
    String getSpeakers() {
        log.debug("Fetching speakers from cfp.gr8conf.org")
        "http://cfp.gr8conf.org/api2/speakers/12".toURL().text
    }

    @Override
    String getTalks() {
        log.debug("Fetching talks from cfp.gr8conf.org")
        "http://cfp.gr8conf.org/api2/talks/12".toURL().text
    }

    @Override
    String getTags() {
        log.debug("Fetching tags from cfp.gr8conf.org")
        "http://cfp.gr8conf.org/api2/tags/12".toURL().text
    }
}
