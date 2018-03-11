package fields.demo

class Speaker {
    String name
    String company
    String twitter
    String bio
    String image

    Date dateCreated
    Date lastUpdated

    String toString() {
        name
    }
    static hasMany = [talks: Talk]

    static constraints = {
        name nullable: false
        bio nullable: false, widget: 'textarea'
        twitter nullable: false
        company nullable: false
        talks minSize: 0
        image url: true
    }

    static mapping = {
        bio type: 'text'
    }
}
