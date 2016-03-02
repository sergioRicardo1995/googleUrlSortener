class GoogleUrlSortenerGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.4 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def title = "Google Url Sortener Plugin" // Headline display name of the plugin
    def author = "Sergio Ricardo"
    def authorEmail = "sergio.andres.ricardo@gmail.com"
    def description = '''\
        The Google URL Shortener at goo.gl is a service that takes long URLs and squeezes them into fewer characters to make a link that is easier to share.
    '''

    // URL to the plugin's documentation
    def documentation = "https://github.com/sergioRicardo1995/googleUrlSortener"
}
