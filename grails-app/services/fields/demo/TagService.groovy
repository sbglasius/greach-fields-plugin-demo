package fields.demo

import grails.gorm.services.Service

@Service(Tag)
interface TagService {

    Tag get(Serializable id)

    List<Tag> list(Map args)

    Long count()

    void delete(Serializable id)

    Tag save(Tag tag)

    Tag findByTag(String tag)

}