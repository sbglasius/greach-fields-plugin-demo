package fields.demo

class OfflineConferenceDataService implements ConferenceDataService {
    @Override
    String getSpeakers() {
        log.warn("Using offline version of speakers")
        getClass().getResource('/speakers.json').text
    }

    @Override
    String getTalks() {
        log.warn("Using offline version of talks")
        getClass().getResource('/talks.json').text
    }

    @Override
    String getTags() {
        log.warn("Using offline version of tags")
        getClass().getResource('/tags.json').text
    }
}
