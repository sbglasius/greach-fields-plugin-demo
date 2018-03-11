package fields.demo

import grails.gorm.services.Service

@Service(Speaker)
interface SpeakerService {

    Speaker get(Serializable id)

    List<Speaker> list(Map args)

    Long count()

    void delete(Serializable id)

    Speaker save(Speaker speaker)

    Speaker findByName(String name)

}