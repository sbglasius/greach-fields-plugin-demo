package fields.demo

class Tag {
    String tag
    String toString() {
        "$tag (${talks?.size() ?: 0})"
    }
    static hasMany = [talks: Talk]
    static belongsTo = Talk
    static constraints = {
        tag nullable: false
        talks nullable: true
    }
}
