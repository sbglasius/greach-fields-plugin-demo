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
        image url: true
        talks minSize: 0
    }

    static mapping = {
        bio type: 'text'
    }
}
