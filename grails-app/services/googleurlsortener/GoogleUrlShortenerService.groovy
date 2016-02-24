package googleurlsortener

import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method

/**
 * GoogleUrlShortenerService
 * Using API "Google URL Shortener", send a request to  '/urlshortener' endPoint and get the shortened url.
 * The Google URL Shortener at goo.gl is a service that takes long URLs and squeezes them into fewer characters
 to make a link that is easier to share.
 * Created by sricardo on 23/02/16.
 */
class GoogleUrlShortenerService {

    def grailsApplication

    String shorten(String url) {
        String shortened
        def http = new HTTPBuilder("https://www.googleapis.com/")
        http.request(Method.POST) {
            uri.path = 'urlshortener/v1/url'
            uri.query = [key: grailsApplication.config.google.shortener.api.key]
            requestContentType = ContentType.JSON
            body = [longUrl: url]

            response.success = { resp, json ->
                shortened = json.id
            }

            response.failure = { resp ->
                shortened = url
            }
        }
        return shortened
    }

}
