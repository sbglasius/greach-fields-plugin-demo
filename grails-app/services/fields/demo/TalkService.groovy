package fields.demo

import grails.gorm.services.Service

@Service(Talk)
interface TalkService {

    Talk get(Serializable id)

    List<Talk> list(Map args)

    Long count()

    void delete(Serializable id)

    Talk save(Talk talk)

}