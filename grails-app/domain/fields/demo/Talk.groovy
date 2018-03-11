package fields.demo

class Talk {
    String title
    String summary

    Date dateCreated
    Date lastUpdated

    String toString() {
        title
    }

    static belongsTo = [speaker: Speaker]
    static hasMany = [tags: Tag]

    static constraints = {
        title nullable: false
        summary nullable: false, widget: 'textarea'
        speaker()
        tags()
    }
    static mapping = {
        summary type: 'text'
    }
}
