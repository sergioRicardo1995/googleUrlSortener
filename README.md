# googleUrlSortener
The Google URL Shortener at goo.gl is a service that takes long URLs and squeezes them into fewer characters   to make a link that is easier to share.

#Configurations:
In your Config.groovy ->

API key
google.shortener.api.key='googleApiKey'

#Usage

Example:
  def googleUrlShortenerService
 
  String shortUrl = googleUrlShortenerService.shorten('your long url')
