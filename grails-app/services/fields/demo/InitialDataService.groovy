package fields.demo

import grails.gorm.transactions.Transactional
import groovy.json.JsonSlurper

@Transactional
class InitialDataService {
    SpeakerService speakerService
    TalkService talkService
    TagService tagService
    ConferenceDataService conferenceDataService

    /**
     * Load data from live service or text dependent on connectivity
     */
    void loadInitialData() {

        loadSpeakers(conferenceDataService.speakers)

        loadTags(conferenceDataService.tags)

        loadTalks(conferenceDataService.talks)
    }

    void loadSpeakers(String speakers) {
        def speakersJson = new JsonSlurper().parseText(speakers)

        speakersJson.each {
            Speaker speaker = new Speaker(it as Map)
            speaker.talks = []
            speakerService.save(speaker)
        }

    }

    void loadTags(String tags) {
        def tagsJson = new JsonSlurper().parseText(tags)

        tagsJson.each {
            Tag tag = new Tag(tag: it.tag)
            tagService.save(tag)
        }

    }

    void loadTalks(String talks) {
        def talksJson = new JsonSlurper().parseText(talks)

        talksJson.each { Map it ->
            Talk talk = new Talk(title: it.title, summary: it.summary)
            talk.speaker = speakerService.findByName((it.speakers as List<Map>)[0].name as String)
            talkService.save(talk)
            it.tags.each {
                Tag tag = tagService.findByTag(it as String)
                tag.addToTalks(talk)
                tagService.save(tag)
            }
        }

    }
}
